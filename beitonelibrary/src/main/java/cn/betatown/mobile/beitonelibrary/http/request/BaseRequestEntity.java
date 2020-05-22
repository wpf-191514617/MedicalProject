package cn.betatown.mobile.beitonelibrary.http.request;

import java.util.LinkedHashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;

public abstract class BaseRequestEntity {

    public abstract String getUrl();

    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.POST;
    }

    public abstract LinkedHashMap<String, String> getHead();

    public abstract String getQuery();

    public abstract Object getParams();

}
