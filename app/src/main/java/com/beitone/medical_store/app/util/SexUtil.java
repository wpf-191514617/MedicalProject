package com.beitone.medical_store.app.util;

public class SexUtil {

    public static String getSexName(int sex){
        if (sex == 1){
            return "男";
        } else if (sex == 2){
            return "女";
        }
        return "";
    }


    public static int getSexByName(String sex){
        if (sex.equals("男")){
            return 1;
        } else if (sex.equals("女")){
            return 2;
        }
        return 0;
    }

}
