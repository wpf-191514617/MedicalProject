package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.request.BasePostStrRequestEntity;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;

public class PatientUpdateRequest extends BasePostStrRequestEntity {

    public String addressStr;
    public String idCard;
    public String patientId;
    public String patientName;
    public String userId;
    public int sex;


    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/patient/update";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Authorization", UserHelper.getInstance().getUserToken(MedicalApplication.getContext()));
        return map;
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public Object getParams() {
        return GsonUtil.GsonString(this);
    }
}
