package com.beitone.medical.doctor;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {


    public static List<?> getData(int size){
        List<String> strings = new ArrayList<>();
        for (int i =0;i < size;i++){
            strings.add("");
        }
        return strings;
    }


    public static List<?> getData(){
        return getData(10);
    }

}
