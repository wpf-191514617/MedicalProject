package cn.betatown.mobile.beitonelibrary.http;

import android.content.Context;

import com.bt.http.OkHttpUtils;
import com.bt.http.builder.OkHttpRequestBuilder;
import com.bt.http.builder.PostStringBuilder;

import java.util.LinkedHashMap;
import java.util.Set;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;
import okhttp3.MediaType;

public class HttpRequest {

    private BaseRequestEntity requestEntity;

    private String BaseUrl = "http://demo.hyj91.com/";

    public HttpRequest(BaseRequestEntity requestEntity) {
        this.requestEntity = requestEntity;
    }

    public OkHttpRequestBuilder build(Context context) {
        if (requestEntity == null) {
            return null;
        }
        OkHttpRequestBuilder requestBuilder = null;
        switch (requestEntity.getMethod()) {
            case GET:
                requestBuilder = OkHttpUtils.get();
                break;
            case POST_STR:
                requestBuilder = OkHttpUtils.postString();
                break;
            default:
                requestBuilder = OkHttpUtils.post();
                break;
        }
        requestBuilder.tag(context);
        // addHead
        //requestBuilder.addHeader("Content-Type","application/json");
        if (requestEntity.getHead() != null) {
            Set<String> keyStrings = requestEntity.getHead().keySet();
            for (String keyString : keyStrings) {
                requestBuilder.addHeader(keyString, requestEntity.getHead().get(keyString));
            }
            requestBuilder.getHeaders().putAll(requestEntity.getHead());
        }
        requestBuilder.addHeader("Client-Auth",
                "aW5xdWlyeV91aTozM2Y5NDY3OC00NjgwLTVlZDItYTkyZS1iOTk4MzFhOGJlMDM=");
        String url = requestEntity.getUrl();
        if (requestEntity.getQuery() != null) {
            StringBuilder builder = new StringBuilder(url);
            url = builder.append("?").append(requestEntity.getQuery()).toString();
        }
        requestBuilder.url(BaseUrl + url);
        switch (requestEntity.getMethod()) {
            case POST_STR:
                ((PostStringBuilder) requestBuilder).content((String) requestEntity.getParams())
                        .mediaType(MediaType.parse("application/json; charset=utf-8"));
                break;
            default:
                if (requestEntity.getParams() != null) {
                    requestBuilder.getParams().putAll((LinkedHashMap<String, String>) requestEntity.getParams());
                }
                break;
        }
        return requestBuilder;
    }

}
