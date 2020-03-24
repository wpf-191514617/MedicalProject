package com.beitone.medical_store.app.util;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    public static List<String> getTestListData(){
        List<String> strings = new ArrayList<>();
        for (char i = 'A';i < 'Z';i++){
            strings.add(String.valueOf(i));
        }
        return strings;
    }

}
