package com.beitone.medical_store.app.httpentity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class GetTokenByPhoneCodeRequest extends BaseRequestEntity {

    public String phone;

    public String authCode;

    @Override
    public String getUrl() {
        return "inqApi/qdp-auth/oauth/token";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> hashMap = new LinkedHashMap();
        hashMap.put("Authorization" , "Basic d2VhcHA6d2VhcHBfc2VjcmV0");
        return hashMap;
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public Object getParams() {
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("phone" , phone);
        params.put("grant_type" , "sms");
        params.put("code" , authCode);
        return params;
    }
}
