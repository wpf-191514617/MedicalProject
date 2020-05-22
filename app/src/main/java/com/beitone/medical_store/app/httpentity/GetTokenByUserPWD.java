package com.beitone.medical_store.app.httpentity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class GetTokenByUserPWD extends BaseRequestEntity {

    public String phone;
    public String password;

    @Override
    public String getUrl() {
        return "inqApi/platform-auth/auth/getTokenByUserPWD";
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
        params.put("userName" , phone);
        params.put("isRememberMe" , "true");
        params.put("password" , password);
        return params;
    }
}
