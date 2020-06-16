package com.beitone.medical_store.app.httpentity;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class UpdatePatientRequest extends BaseRequestEntity {

    public String patientId;

    public String registerId;

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/inquiry/patient/symptom/updatePatient";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Authorization", UserHelper.getInstance().getAccessToken(MedicalApplication.getContext()));
        return map;
    }

    @Override
    public String getQuery() {
        return "patientId="+patientId+"&registerId=" + registerId;
    }

    @Override
    public Object getParams() {
        return null;
    }



}
