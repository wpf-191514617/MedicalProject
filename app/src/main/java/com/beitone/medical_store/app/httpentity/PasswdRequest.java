package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.helper.UserHelper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class PasswdRequest extends BaseRequestEntity {

    public String newPasswd;
    public String userId;
    public String code;
    public String phone;

    @Override
    public String getUrl() {
        return "inqApi/qdp-user/update/passwdByPhone";
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
        params.put("newPasswd" , newPasswd);
        params.put("userId" , userId);
        params.put("code" , code);
        params.put("phone" , phone);
        return params;
    }
}
