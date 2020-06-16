package com.beitone.medical_store.app.httpentity;


import com.beitone.medical_store.app.MedicalApplication;
import com.beitone.medical_store.app.helper.UserHelper;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.http.request.BasePostStrRequestEntity;

/**
 * 病情描述请求实体
 */

public class ConditionDesPostStrRequest extends BasePostStrRequestEntity {

    public QueryParams queryParams;

    public int  allergy;

    public int subsequentVisit;

    public List<String> imgsList;

    @Override
    public String getUrl() {
        return "inqApi/hyj-inquiry/inquiry/patient/symptom/add";
    }

    @Override
    public LinkedHashMap<String, String> getHead() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        /*map.put("Authorization", UserHelper.getInstance().getAccessToken(MedicalApplication.getContext()));*/
        return map;
    }

    @Override
    public String getQuery() {
        return queryParams.toString();
    }

    @Override
    public String getParams() {
        return toString();
    }

    @Override
    public String toString() {
        return new GsonBuilder().registerTypeAdapter(ConditionDesPostStrRequest.class,
                new GsonTypeAdapter()).create().toJson(this);
    }

    class GsonTypeAdapter extends TypeAdapter<ConditionDesPostStrRequest> {

        @Override
        public void write(JsonWriter out, ConditionDesPostStrRequest value) throws IOException {
            out.beginObject();
            //按自定义顺序输出字段信息
            out.name("allergy").value(value.allergy);
            out.name("subsequentVisit").value(value.subsequentVisit);
            if (AdapterUtil.isListNotEmpty(imgsList)){
                out.name("imgsList");
                out.beginArray();
                for (String s : imgsList) {
                    out.value(s);
                }
                out.endArray();
            }
            /*if (imgsList != null && imgsList.length() > 0) {
                out.name("imgsList").value(new JsonParser().parse(GsonUtil.GsonString(imgsList)).getAsJsonArray().toString());
            }*/
            out.endObject();
        }

        @Override
        public ConditionDesPostStrRequest read(JsonReader in) throws IOException {
            return null;
        }
    }

    public static class QueryParams{
        public String userId;

        public String orderType;

        public String symptom;

        @Override
        public String toString() {
            return "userId=" + userId +
                    "&orderType=" + orderType +
                    "&symptom=" + symptom;
        }
    }

}
