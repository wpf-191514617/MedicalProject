package com.beitone.medical_store.app.httpentity;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class InquiryOrderPaymentEntity extends BaseRequestEntity {

    public String token;
    public String clientType;
    public String payId;

    @Override
    public String getUrl() {
        return "api/member/buy/virtual/show/payment";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        return null;
    }

    @Override
    public String getQuery() {
        return "token=" + token + "&clientType=" + clientType + "&payId=" + payId;
    }

    @Override
    public Object getParams() {
        return null;
    }

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.POST;
    }


}
