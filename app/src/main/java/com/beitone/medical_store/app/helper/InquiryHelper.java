package com.beitone.medical_store.app.helper;

import android.content.Context;

import com.beitone.medical_store.app.MedicalApplication;

import cn.betatown.mobile.beitonelibrary.util.PreferencesUtils;

public class InquiryHelper {

    private static final String KEY_SERIALID = "SerialId";
    private static final String KEY_PATIENTID = "patientId";

    private InquiryHelper(){}

    public static void inputInquirRegisterId(String serialId){
        PreferencesUtils.putString(MedicalApplication.getContext(),KEY_SERIALID, serialId);
    }

    public static void inputInquiryPatientId(String patientId){
        PreferencesUtils.putString(MedicalApplication.getContext() ,KEY_PATIENTID, patientId);
    }


    public static String getInquirRegisterId(){
        return PreferencesUtils.getString(MedicalApplication.getContext() , KEY_SERIALID);
    }

    public static String getInquiryPatientId(){
        return PreferencesUtils.getString(MedicalApplication.getContext() , KEY_PATIENTID);
    }

}
