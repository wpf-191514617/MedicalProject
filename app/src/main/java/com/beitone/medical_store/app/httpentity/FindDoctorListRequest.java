package com.beitone.medical_store.app.httpentity;

import android.text.TextUtils;

import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;

import java.util.LinkedHashMap;

import cn.betatown.mobile.beitonelibrary.http.HttpRequestMethod;
import cn.betatown.mobile.beitonelibrary.http.request.BaseRequestEntity;

public class FindDoctorListRequest extends BaseRequestEntity {

    public String hospitalId;

    public QueryParams queryParams = new QueryParams();

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/doctor/findDoctorList";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Authorization",
                UserHelper.getInstance().getAccessToken(MedicalApplication.getContext()));
        if (!TextUtils.isEmpty(hospitalId)) {
            map.put("hospitalId", hospitalId);
        }
        return map;
    }

    @Override
    public HttpRequestMethod getMethod() {
        return HttpRequestMethod.GET;
    }

    @Override
    public String getQuery() {
        return queryParams.toString();
    }

    @Override
    public Object getParams() {
        return null;
    }

    public static class QueryParams {
        public String business = "";
        public int current;
        public String deptId = "";
        public String deptName = "";
        public String doctorName = "";
        public String hospitalGrade = "";
        public String hospitalName = "";
        public String level = "";
        public int size = 10;
        public int sortBy = 1;
        public String keyWord = "";

        @Override
        public String toString() {
            return "business=" + business +
                    "&current=" + current +
                    "&deptId=" + deptId +
                    "&deptName=" + deptName +
                    "&doctorName=" + doctorName +
                    "&hospitalGrade=" + hospitalGrade +
                    "&hospitalName=" + hospitalName +
                    "&level=" + level +
                    "&size=" + size +
                    "&sortBy=" + sortBy +
                    "&keyWord=" + keyWord;
        }
    }


}
