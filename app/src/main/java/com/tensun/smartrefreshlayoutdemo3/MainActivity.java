package com.tensun.smartrefreshlayoutdemo3;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;

public class MainActivity extends AppCompatActivity {

    /** 從伺服器download資料, 並呈現在RecyclerView 的模組 */
    @BindView(R.id.recycler_view)
    ItheimaRecyclerView recyclerView;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;

    /** 下拉特效呈現 的模組 */
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;

    private PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;

    private boolean isFirstLoad = true;                                                                                 // 區分是否第一次請求
    private String uri;                                                                                                 // 資源網址的後半部分網址
    private String nextPageToken;                                                                                       // 下一頁的相關網址

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ButterKnife.bind(this);

        refreshLayout.setEnableHeaderTranslationContent(false);                                                         // 下拉更新時, 内容不偏移
        setThemeColor(android.R.color.holo_orange_light, android.R.color.holo_orange_dark);                                 // 橙色主题

        swipeRefreshLayout.setEnabled(false);                                                                           // 取消下拉更新手勢的偵聽

        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<Bean>(swipeRefreshLayout, recyclerView,
                MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                return R.layout.item_list_news2;                                                                           // RecyclerView item资源id
            }

            @Override
            public String getApi() {
                if (isFirstLoad) {
                    uri = "action/apiv2/news?pageToken=";                                                               // 資源網址的後半部分
                    isFirstLoad = false;
                } else {
                    uri = "action/apiv2/news?pageToken=";                                                               // 資源網址的後半部分
                    uri += nextPageToken;
                }

                return uri;                                                                                             // 接口
            }

            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {                          // 是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法

                return true;
            }
        };

        pullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<Bean>() {  // 設置監聽

            @Override
            public void onRefresh() {                                                                                   // 监听下啦刷新，如果不需要监听可以不重新该方法
                isFirstLoad = true;                                                                                     // 確保上拉刷新, 刷新的網址永遠是第一頁
            }

            @Override
            public void onStart() {                                                                                     // 监听http请求开始，如果不需要监听可以不重新该方法

            }

            @Override
            public void onSuccess(Bean bean, Headers headers) {                                                         // 监听http请求成功，如果不需要监听可以不重新该方法
                nextPageToken = bean.getResult().getNextPageToken();                                                    // 在成功取得當前頁面的資訊後, 同時取得下一頁的相關網址
            }

            @Override
            public void onFailure() {                                                                                   // 监听http请求失败，如果不需要监听可以不重新该方法

            }
        });

        pullToLoadMoreRecyclerView.requestData();                                                                       // 开始请求
    }

    public static class MyRecyclerViewHolder extends BaseRecyclerViewHolder<Bean.ResultBean.ItemsBean> {

        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.body)
        TextView body;
        @BindView(R.id.pubDate)
        TextView pubDate;

        public MyRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);
        }

        /** 绑定数据的方法，在mData获取数据（mData声明在基类中） */
        @Override
        public void onBindRealData() {
            title.setText(mData.getTitle());
            body.setText(mData.getBody());
            pubDate.setText(mData.getPubDate());
        }
    }

    private void setThemeColor(int colorPrimary, int colorPrimaryDark) {
        refreshLayout.setPrimaryColorsId(colorPrimary, android.R.color.white);
        if (Build.VERSION.SDK_INT >= 21) {                                                                             // 如果Android版本 5.0以上
            getWindow().setStatusBarColor(ContextCompat.getColor(this, colorPrimaryDark));
        }
    }
}
