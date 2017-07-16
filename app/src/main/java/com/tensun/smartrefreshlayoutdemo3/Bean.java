package com.tensun.smartrefreshlayoutdemo3;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15.
 */

public class Bean extends BasePageBean<Bean.ResultBean.ItemsBean> {

    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"DockerInfo-Net","body":"Kubernetes 1.8.0 第二个 alpha 版本已发布，相对于 1.7.0版本以来 ，官方做了这些修改，大概有75处修改完善。Kubernetes 1.8.0 alpha.2 下载地址...","commentCount":0,"href":"https://www.oschina.net/news/86806/kubernetes-1-8-0-alpha2","id":86806,"pubDate":"2017-07-16 09:58:10","recommend":true,"title":"Kubernetes 1.8.0-alpha.2 发布","type":6,"viewCount":0},{"author":"王练","body":"软件周刊（07.09 \u2014 07.15）：本周热门软件更新 \u2014 深度操作系统镜像服务新增 Linux Kernel 等镜像站；PostgreSQL 10 Beta 2 发布，Bug 修复；Apa...","commentCount":0,"href":"https://my.oschina.net/editorial-story/blog/1417535","id":1417535,"pubDate":"2017-07-16 08:24:34","recommend":true,"title":"软件周刊 | Fedora 26 & Redis 4.0 正式版发布","type":3,"viewCount":251},{"author":"王练","body":"SpliderApi，是基于 Node+express 的一个网络爬虫 API 接口，包括前端开发日报、知乎日报、前端top框架排行、妹纸福利、搞笑视频、各类视频新闻资讯...","commentCount":0,"href":"https://git.oschina.net/ecitlm/splider","id":86804,"pubDate":"2017-07-16 08:22:37","recommend":true,"title":"码云推荐 |  基于 node+express 的爬虫数据接口","type":0,"viewCount":2},{"author":"王练","body":"MyCAT 支持跨库表 Join，目前版本仅支持跨库两表 Join。虽然如此，已经能够满足我们大部分的业务场景。况且，Join 过多的表可能带来的性能问题也是...","commentCount":1,"href":"https://my.oschina.net/sword4j/blog/1360860","id":1360860,"pubDate":"2017-07-16 08:20:49","recommend":true,"title":"每日一博 | 数据库中间件 MyCAT 源码分析之两表 Join","type":3,"viewCount":422},{"author":"王练","body":"在 Java 的世界发生了什么事？事实上，很多。Java 9 在 9 月将会来临，Jigsaw 终于获批，而 Java 大咖正在给我们提供关于这一编程语言的未来的有价...","commentCount":0,"href":"https://www.oschina.net/translate/java-influencers-interview","id":10003933,"pubDate":"2017-07-16 08:16:27","recommend":true,"title":"协作翻译 | Java 已死？听听这些大咖是怎么说的","type":4,"viewCount":442},{"author":"王练","body":"Ant Motion 是从蚂蚁金服的 Ant Design 中提炼出来的动效语言。它不仅仅是动效语言，同时也是一套 React 框架动效解决方案，提供了单项，组合动画，...","commentCount":0,"href":"https://www.oschina.net/p/ant-motion","id":45617,"pubDate":"2017-07-16 08:15:04","recommend":false,"title":"Ant Motion \u2014\u2014 蚂蚁金服动效语言& 动效解决方案","type":1,"viewCount":146},{"author":"王练","body":"有一种崩溃叫密码输入有误；有一种惊慌叫做账号异地登陆；有一种感情叫隐身对其可见；有一种误会叫人机离线；有一种失落叫没有访问权限；有一种感情...","commentCount":7,"href":"https://my.oschina.net/xxiaobian/blog/1418257","id":1418257,"pubDate":"2017-07-16 08:13:59","recommend":false,"title":"OSChina 周日乱弹 \u2014\u2014水路两栖的老司机","type":3,"viewCount":228},{"author":"局长","body":"Mesa3D 17.1.5 和 17.2.0 已发布，Mesa 是一个三维（3D）图形库的开源集合，其主要目标是在 Linux / UNIX 操作系统下实现各种 API（应用程序编程接...","commentCount":0,"href":"https://www.oschina.net/news/86799/mesa3d-17-1-5","id":86799,"pubDate":"2017-07-16 08:13:46","recommend":false,"title":"Mesa3D 17.1.5 发布，开源 3D 图形库","type":6,"viewCount":109},{"author":"局长","body":"Linux Kernel 一系列稳定分支的内核都发布了更新，其中包括 4.12.2、4.11.11、4.9.38、4.4.77、3.18.61 这几个版本。值得注意的是 Linux Kernel ...","commentCount":1,"href":"https://www.oschina.net/news/86798/linux-kernel-update-20170716","id":86798,"pubDate":"2017-07-16 08:06:40","recommend":false,"title":"Linux Kernel 发布更新，3.18.61 生命周期已结束","type":6,"viewCount":91},{"author":"王练","body":"Jake Wharton 近日在 Twitter 上宣布已从 Square 离职。 Jake Wharton 可以说是当之无愧的 Android 大神 ，对 Retrofit、ButterKnife、OkHttp、V...","commentCount":1,"href":"https://www.oschina.net/news/86797/jake-wharton-departs-square","id":86797,"pubDate":"2017-07-16 08:04:19","recommend":false,"title":"Android 大神 Jake Wharton 宣布从 Square 离职","type":6,"viewCount":238},{"author":"王练","body":"Particle (也称 YouTube+)，对国内用户可能不太熟悉，但在国外可以说是比较流行的一个开源 Chrome 扩展插件。它的功能是允许用户改变 YouTube 部...","commentCount":0,"href":"https://www.oschina.net/news/86796/particle-chrome-extension","id":86796,"pubDate":"2017-07-16 08:02:17","recommend":false,"title":"知名开源 Chrome 扩展 Particle 出售后被改成广告软件","type":6,"viewCount":191},{"author":"王练","body":"今年早些时候，Drupal CMS 项目创始人及领导人 Dries Buytaert 要求知名 Drupal 和 PHP 贡献者 Larry Garfield 离开 Drupal 项目，理由是他的非传统...","commentCount":2,"href":"https://www.oschina.net/news/86795/drupal-lead-fired-larry-garfield","id":86795,"pubDate":"2017-07-16 08:00:44","recommend":false,"title":"Drupal 负责人宣布撤除 Larry Garfield 所有职务","type":6,"viewCount":110},{"author":"局长","body":"FreeBSD 11.1-RC3 已发布，FreeBSD 11.1-RC3 可能是 11.1 版本发布之前的最后一个 RC 版。本次更新主要是一些小的调整和修复。 自 11.1-RC2 以来的...","commentCount":2,"href":"https://www.oschina.net/news/86794/freebsd-11-1-rc3","id":86794,"pubDate":"2017-07-16 07:56:41","recommend":false,"title":"FreeBSD 11.1-RC3 发布，类 Unix 操作系统","type":6,"viewCount":87},{"author":"王练","body":"iOS 端智慧分词软件 Pin 作者前日发布长文指责锤子科技 Big Bang 借用创意并以原创自居，引起广泛热议。该作者表示锤子科技有借用他的创意，就分词...","commentCount":6,"href":"https://www.oschina.net/news/86793/smaerisan-big-bang-respond","id":86793,"pubDate":"2017-07-16 07:54:45","recommend":false,"title":"锤子回应抄袭指责：Big Bang 创意更早，不存在抄袭","type":6,"viewCount":340},{"author":"局长","body":"Libsodium 1.0.13 已发布，新版现在可以在 NuGet 上使用，以及其他的一些变更，详细如下： Javascript: the sumo builds now include all symbols....","commentCount":0,"href":"https://www.oschina.net/news/86792/libsodium-1-0-13-released","id":86792,"pubDate":"2017-07-16 07:42:45","recommend":false,"title":"Libsodium 1.0.13 发布，易用的加密库","type":6,"viewCount":72},{"author":"局长","body":"Revel v0.17 和 v0.17.1 已发布，本次更新没有重大更改，详细如下： v0.17.1 Critical issue identified details here #1200 v0.17 [revel/revel]...","commentCount":0,"href":"https://www.oschina.net/news/86791/revel-0-17-1-released","id":86791,"pubDate":"2017-07-16 07:37:12","recommend":false,"title":"Revel v0.17.1 发布，Go 的全堆栈 Web 框架","type":6,"viewCount":139},{"author":"局长","body":"Elide 3.0.11 发布了，Elide 是一个用 JPA 注释模型轻松搭建 JSON API Web 服务的 Java 库。Elide 可以迅速搭建和部署高性能 Web 服务，将数据模型...","commentCount":0,"href":"https://www.oschina.net/news/86790/elide-3-0-11","id":86790,"pubDate":"2017-07-16 07:31:55","recommend":false,"title":"Elide 3.0.11 发布，基于 JSON API 的 Web 服务","type":6,"viewCount":84},{"author":"局长","body":"Sass 3.5.0 和 3.5.1 已发布。Sass 扩展了 CSS3，增加了规则、变量、混入、选择器、继承等等特性。Sass 生成良好格式化的 CSS 代码，易于组织和维护...","commentCount":1,"href":"https://www.oschina.net/news/86789/sass-3-5-0-and-3-5-1","id":86789,"pubDate":"2017-07-16 07:26:39","recommend":false,"title":"Sass 3.5.0 和 3.5.1 发布，CSS 框架","type":6,"viewCount":51},{"author":"局长","body":"MongooseJS 4.11.3 发布了，MongooseJS 是使用 JavaScript 编程，连接 MongoDB 数据库的软件包，使 MongoDB 的文档数据模型变的优雅起来，方便对 ...","commentCount":0,"href":"https://www.oschina.net/news/86788/mongoose-4-11-3","id":86788,"pubDate":"2017-07-16 06:59:39","recommend":false,"title":"MongooseJS 4.11.3 发布，MongoDB 连接包","type":6,"viewCount":38},{"author":"bixuehujin","body":"Blink 为构建 Web 应用程序提供简洁优雅的API，高可扩展性，允许开发者非常灵活自如的使用，为构建高性能 API 服务而生，同时可完美兼容 Swoole，P...","commentCount":0,"href":"https://www.oschina.net/news/86787/blink-0-3-1","id":86787,"pubDate":"2017-07-16 02:05:25","recommend":false,"title":" PHP 框架 Blink 0.3.1 发布，增强 Session 组件","type":6,"viewCount":104}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":79783}
     * time : 2017-07-16 10:24:01
     */

    private int code;
    private String message;
    private ResultBean result;
    private String time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public List<ResultBean.ItemsBean> getItemDatas() {
        return result.items;
    }

    public static class ResultBean {
        /**
         * items : [{"author":"DockerInfo-Net","body":"Kubernetes 1.8.0 第二个 alpha 版本已发布，相对于 1.7.0版本以来 ，官方做了这些修改，大概有75处修改完善。Kubernetes 1.8.0 alpha.2 下载地址...","commentCount":0,"href":"https://www.oschina.net/news/86806/kubernetes-1-8-0-alpha2","id":86806,"pubDate":"2017-07-16 09:58:10","recommend":true,"title":"Kubernetes 1.8.0-alpha.2 发布","type":6,"viewCount":0},{"author":"王练","body":"软件周刊（07.09 \u2014 07.15）：本周热门软件更新 \u2014 深度操作系统镜像服务新增 Linux Kernel 等镜像站；PostgreSQL 10 Beta 2 发布，Bug 修复；Apa...","commentCount":0,"href":"https://my.oschina.net/editorial-story/blog/1417535","id":1417535,"pubDate":"2017-07-16 08:24:34","recommend":true,"title":"软件周刊 | Fedora 26 & Redis 4.0 正式版发布","type":3,"viewCount":251},{"author":"王练","body":"SpliderApi，是基于 Node+express 的一个网络爬虫 API 接口，包括前端开发日报、知乎日报、前端top框架排行、妹纸福利、搞笑视频、各类视频新闻资讯...","commentCount":0,"href":"https://git.oschina.net/ecitlm/splider","id":86804,"pubDate":"2017-07-16 08:22:37","recommend":true,"title":"码云推荐 |  基于 node+express 的爬虫数据接口","type":0,"viewCount":2},{"author":"王练","body":"MyCAT 支持跨库表 Join，目前版本仅支持跨库两表 Join。虽然如此，已经能够满足我们大部分的业务场景。况且，Join 过多的表可能带来的性能问题也是...","commentCount":1,"href":"https://my.oschina.net/sword4j/blog/1360860","id":1360860,"pubDate":"2017-07-16 08:20:49","recommend":true,"title":"每日一博 | 数据库中间件 MyCAT 源码分析之两表 Join","type":3,"viewCount":422},{"author":"王练","body":"在 Java 的世界发生了什么事？事实上，很多。Java 9 在 9 月将会来临，Jigsaw 终于获批，而 Java 大咖正在给我们提供关于这一编程语言的未来的有价...","commentCount":0,"href":"https://www.oschina.net/translate/java-influencers-interview","id":10003933,"pubDate":"2017-07-16 08:16:27","recommend":true,"title":"协作翻译 | Java 已死？听听这些大咖是怎么说的","type":4,"viewCount":442},{"author":"王练","body":"Ant Motion 是从蚂蚁金服的 Ant Design 中提炼出来的动效语言。它不仅仅是动效语言，同时也是一套 React 框架动效解决方案，提供了单项，组合动画，...","commentCount":0,"href":"https://www.oschina.net/p/ant-motion","id":45617,"pubDate":"2017-07-16 08:15:04","recommend":false,"title":"Ant Motion \u2014\u2014 蚂蚁金服动效语言& 动效解决方案","type":1,"viewCount":146},{"author":"王练","body":"有一种崩溃叫密码输入有误；有一种惊慌叫做账号异地登陆；有一种感情叫隐身对其可见；有一种误会叫人机离线；有一种失落叫没有访问权限；有一种感情...","commentCount":7,"href":"https://my.oschina.net/xxiaobian/blog/1418257","id":1418257,"pubDate":"2017-07-16 08:13:59","recommend":false,"title":"OSChina 周日乱弹 \u2014\u2014水路两栖的老司机","type":3,"viewCount":228},{"author":"局长","body":"Mesa3D 17.1.5 和 17.2.0 已发布，Mesa 是一个三维（3D）图形库的开源集合，其主要目标是在 Linux / UNIX 操作系统下实现各种 API（应用程序编程接...","commentCount":0,"href":"https://www.oschina.net/news/86799/mesa3d-17-1-5","id":86799,"pubDate":"2017-07-16 08:13:46","recommend":false,"title":"Mesa3D 17.1.5 发布，开源 3D 图形库","type":6,"viewCount":109},{"author":"局长","body":"Linux Kernel 一系列稳定分支的内核都发布了更新，其中包括 4.12.2、4.11.11、4.9.38、4.4.77、3.18.61 这几个版本。值得注意的是 Linux Kernel ...","commentCount":1,"href":"https://www.oschina.net/news/86798/linux-kernel-update-20170716","id":86798,"pubDate":"2017-07-16 08:06:40","recommend":false,"title":"Linux Kernel 发布更新，3.18.61 生命周期已结束","type":6,"viewCount":91},{"author":"王练","body":"Jake Wharton 近日在 Twitter 上宣布已从 Square 离职。 Jake Wharton 可以说是当之无愧的 Android 大神 ，对 Retrofit、ButterKnife、OkHttp、V...","commentCount":1,"href":"https://www.oschina.net/news/86797/jake-wharton-departs-square","id":86797,"pubDate":"2017-07-16 08:04:19","recommend":false,"title":"Android 大神 Jake Wharton 宣布从 Square 离职","type":6,"viewCount":238},{"author":"王练","body":"Particle (也称 YouTube+)，对国内用户可能不太熟悉，但在国外可以说是比较流行的一个开源 Chrome 扩展插件。它的功能是允许用户改变 YouTube 部...","commentCount":0,"href":"https://www.oschina.net/news/86796/particle-chrome-extension","id":86796,"pubDate":"2017-07-16 08:02:17","recommend":false,"title":"知名开源 Chrome 扩展 Particle 出售后被改成广告软件","type":6,"viewCount":191},{"author":"王练","body":"今年早些时候，Drupal CMS 项目创始人及领导人 Dries Buytaert 要求知名 Drupal 和 PHP 贡献者 Larry Garfield 离开 Drupal 项目，理由是他的非传统...","commentCount":2,"href":"https://www.oschina.net/news/86795/drupal-lead-fired-larry-garfield","id":86795,"pubDate":"2017-07-16 08:00:44","recommend":false,"title":"Drupal 负责人宣布撤除 Larry Garfield 所有职务","type":6,"viewCount":110},{"author":"局长","body":"FreeBSD 11.1-RC3 已发布，FreeBSD 11.1-RC3 可能是 11.1 版本发布之前的最后一个 RC 版。本次更新主要是一些小的调整和修复。 自 11.1-RC2 以来的...","commentCount":2,"href":"https://www.oschina.net/news/86794/freebsd-11-1-rc3","id":86794,"pubDate":"2017-07-16 07:56:41","recommend":false,"title":"FreeBSD 11.1-RC3 发布，类 Unix 操作系统","type":6,"viewCount":87},{"author":"王练","body":"iOS 端智慧分词软件 Pin 作者前日发布长文指责锤子科技 Big Bang 借用创意并以原创自居，引起广泛热议。该作者表示锤子科技有借用他的创意，就分词...","commentCount":6,"href":"https://www.oschina.net/news/86793/smaerisan-big-bang-respond","id":86793,"pubDate":"2017-07-16 07:54:45","recommend":false,"title":"锤子回应抄袭指责：Big Bang 创意更早，不存在抄袭","type":6,"viewCount":340},{"author":"局长","body":"Libsodium 1.0.13 已发布，新版现在可以在 NuGet 上使用，以及其他的一些变更，详细如下： Javascript: the sumo builds now include all symbols....","commentCount":0,"href":"https://www.oschina.net/news/86792/libsodium-1-0-13-released","id":86792,"pubDate":"2017-07-16 07:42:45","recommend":false,"title":"Libsodium 1.0.13 发布，易用的加密库","type":6,"viewCount":72},{"author":"局长","body":"Revel v0.17 和 v0.17.1 已发布，本次更新没有重大更改，详细如下： v0.17.1 Critical issue identified details here #1200 v0.17 [revel/revel]...","commentCount":0,"href":"https://www.oschina.net/news/86791/revel-0-17-1-released","id":86791,"pubDate":"2017-07-16 07:37:12","recommend":false,"title":"Revel v0.17.1 发布，Go 的全堆栈 Web 框架","type":6,"viewCount":139},{"author":"局长","body":"Elide 3.0.11 发布了，Elide 是一个用 JPA 注释模型轻松搭建 JSON API Web 服务的 Java 库。Elide 可以迅速搭建和部署高性能 Web 服务，将数据模型...","commentCount":0,"href":"https://www.oschina.net/news/86790/elide-3-0-11","id":86790,"pubDate":"2017-07-16 07:31:55","recommend":false,"title":"Elide 3.0.11 发布，基于 JSON API 的 Web 服务","type":6,"viewCount":84},{"author":"局长","body":"Sass 3.5.0 和 3.5.1 已发布。Sass 扩展了 CSS3，增加了规则、变量、混入、选择器、继承等等特性。Sass 生成良好格式化的 CSS 代码，易于组织和维护...","commentCount":1,"href":"https://www.oschina.net/news/86789/sass-3-5-0-and-3-5-1","id":86789,"pubDate":"2017-07-16 07:26:39","recommend":false,"title":"Sass 3.5.0 和 3.5.1 发布，CSS 框架","type":6,"viewCount":51},{"author":"局长","body":"MongooseJS 4.11.3 发布了，MongooseJS 是使用 JavaScript 编程，连接 MongoDB 数据库的软件包，使 MongoDB 的文档数据模型变的优雅起来，方便对 ...","commentCount":0,"href":"https://www.oschina.net/news/86788/mongoose-4-11-3","id":86788,"pubDate":"2017-07-16 06:59:39","recommend":false,"title":"MongooseJS 4.11.3 发布，MongoDB 连接包","type":6,"viewCount":38},{"author":"bixuehujin","body":"Blink 为构建 Web 应用程序提供简洁优雅的API，高可扩展性，允许开发者非常灵活自如的使用，为构建高性能 API 服务而生，同时可完美兼容 Swoole，P...","commentCount":0,"href":"https://www.oschina.net/news/86787/blink-0-3-1","id":86787,"pubDate":"2017-07-16 02:05:25","recommend":false,"title":" PHP 框架 Blink 0.3.1 发布，增强 Session 组件","type":6,"viewCount":104}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 79783
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * author : DockerInfo-Net
             * body : Kubernetes 1.8.0 第二个 alpha 版本已发布，相对于 1.7.0版本以来 ，官方做了这些修改，大概有75处修改完善。Kubernetes 1.8.0 alpha.2 下载地址...
             * commentCount : 0
             * href : https://www.oschina.net/news/86806/kubernetes-1-8-0-alpha2
             * id : 86806
             * pubDate : 2017-07-16 09:58:10
             * recommend : true
             * title : Kubernetes 1.8.0-alpha.2 发布
             * type : 6
             * viewCount : 0
             */

            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
            private String pubDate;
            private boolean recommend;
            private String title;
            private int type;
            private int viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
