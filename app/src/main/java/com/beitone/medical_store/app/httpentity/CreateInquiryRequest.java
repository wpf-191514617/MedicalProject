package com.beitone.medical_store.app.httpentity;

import android.text.TextUtils;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class CreateInquiryRequest extends BaseRequestEntity {

    public String doctorId;
    public String registerId;

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/inquiry/patient/symptom/updateDoctor";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Authorization",
                UserHelper.getInstance().getUserToken(MedicalApplication.getContext()));
        return map;
    }

    @Override
    public String getQuery() {
        return toString();
    }

    @Override
    public Object getParams() {
        return null;
    }


    @Override
    public String toString() {
        return "doctorId=" + doctorId +
                "&registerId=" + registerId;
    }
}
