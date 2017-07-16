package com.tensun.smartrefreshlayoutdemo3;

import com.itheima.retrofitutils.ItheimaHttp;

/**
 * Created by Administrator on 2017/7/15.
 */

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ItheimaHttp.init(this, "http://www.oschina.net/");
    }
}
