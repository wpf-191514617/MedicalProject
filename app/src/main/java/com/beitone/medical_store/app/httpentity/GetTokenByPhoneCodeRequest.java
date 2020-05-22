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
        return "inqApi/platform-auth/auth/getTokenByPhoneCode";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        return null;
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public Object getParams() {
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("phone" , phone);
        params.put("isRememberMe" , "true");
        params.put("code" , authCode);
        return params;
    }
}
