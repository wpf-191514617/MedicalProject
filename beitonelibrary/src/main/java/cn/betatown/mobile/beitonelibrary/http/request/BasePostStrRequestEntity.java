package cn.betatown.mobile.beitonelibrary.http.request;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;

public abstract class BasePostStrRequestEntity extends BaseRequestEntity{

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.POST_STR;
    }
}
