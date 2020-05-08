package cn.betatown.mobile.beitonelibrary.http;

import com.bt.http.OkHttpUtils;
import com.bt.http.builder.OkHttpRequestBuilder;

import java.util.Map;
import java.util.Set;

public class HttpRequest {

    private Object tag;
    private HttpRequestMethod method;
    private String url;
    private Map<String, String> head;
    private Map<String, String> query;
    private Map<String, String> params;

    private String BaseUrl = "http://demo.hyj91.com/inqApi/platform-auth";

    private HttpRequest(HttpRequestBuilder builder) {
        this.tag = builder.tag;
        this.method = builder.method;
        this.url = builder.url;
        this.head = builder.head;
        this.query = builder.query;
        this.params = builder.params;
    }

    public OkHttpRequestBuilder build() {
        OkHttpRequestBuilder requestBuilder = null;
        switch (method) {
            case GET:
                requestBuilder = OkHttpUtils.get();
                break;
            default:
                requestBuilder = OkHttpUtils.post();
                break;
        }
        requestBuilder.tag(tag);
        // addHead
        requestBuilder.addHeader("User-Agent" , "android-okhttp");
        requestBuilder.addHeader("Client-Auth",
                "aW5xdWlyeV91aTozM2Y5NDY3OC00NjgwLTVlZDItYTkyZS1iOTk4MzFhOGJlMDM=");
        if (head != null){
            requestBuilder.getHeaders().putAll(head);
        }
        if (query != null){
            StringBuilder builder = new StringBuilder(url);
            builder.append("?");
            Set<String> stringSet = query.keySet();
            for (String key : stringSet) {
                builder.append(key).append("=").append(query.get(key)).append("&");
            }
            url = builder.substring(0 , builder.length()-1).toString();
        }
        requestBuilder.url(BaseUrl + url);
        requestBuilder.getParams().putAll(params);
        return requestBuilder;
    }

    public static class HttpRequestBuilder {
        private final Object tag;
        private final HttpRequestMethod method;
        private final String url;
        private Map<String, String> head;
        private Map<String, String> query;
        private Map<String, String> params;

        public HttpRequestBuilder(Object tag, HttpRequestMethod method, String url) {
            this.tag = tag;
            this.method = method;
            this.url = url;
        }

        public HttpRequestBuilder addHeads(Map<String, String> head){
            this.head = head;
            return this;
        }

        public HttpRequestBuilder addQueryParams(Map<String, String> query){
            this.query = query;
            return this;
        }

        public HttpRequestBuilder addParams(Map<String, String> params){
            this.params = params;
            return this;
        }

        public HttpRequest build(){
            return new HttpRequest(this);
        }

    }


}
