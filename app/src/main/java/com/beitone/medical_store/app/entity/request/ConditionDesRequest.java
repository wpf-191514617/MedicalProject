package com.beitone.medical_store.app.entity.request;


import java.util.List;

/**
 * 病情描述请求实体
 */

public class ConditionDesRequest {

    public QueryParams queryParams;

    public String  allergy;

    public String imgsList;

    public String subsequentVisit;

    public static class QueryParams{

        public String orderType;

        public String symptom;

        public String userId;

    }


    @Override
    public String toString() {
        return "{" +
                "allergy='" + allergy + '\'' +
                ", imgsList='" + imgsList + '\'' +
                ", subsequentVisit='" + subsequentVisit + '\'' +
                '}';
    }
}
