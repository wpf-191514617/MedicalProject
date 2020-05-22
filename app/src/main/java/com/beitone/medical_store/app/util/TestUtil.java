package com.beitone.medical_store.app.util;

import android.content.Context;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.DepartmentEntity;
import com.beitone.medical_store.app.entity.ParentEntity;
import com.beitone.medical_store.app.entity.SortEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtil {

    public static List<String> getTestListData(){
        List<String> strings = new ArrayList<>();
        for (char i = 'A';i < 'Z';i++){
            strings.add(String.valueOf(i));
        }
        return strings;
    }


    public static List<String> getTestListData(int size){
        List<String> strings = new ArrayList<>();
        for (int i =0;i < size;i++){
            strings.add(String.valueOf(i));
        }
        return strings;
    }



    public static List<String> getTestListData(String type){
        List<String> strings = new ArrayList<>();
        for (char i = 'A';i < 'Z';i++){
            strings.add(type + " - "+String.valueOf(i));
        }
        return strings;
    }


    public static List<ParentEntity> getParentData(){
        List<ParentEntity> entities = new ArrayList<>();
        for (char i = 'A'; i < 'K'; i++) {
            ParentEntity parentEntity = new ParentEntity();
            parentEntity.parentName = String.valueOf(i);
            parentEntity.childList = TestUtil.getTestListData(String.valueOf(i));
            entities.add(parentEntity);
        }
        return entities;
    }

    public static List<String> getSortDatas(int size){
        List<String> datas = new ArrayList<>();
        for (int i =0;i < size;i++){
            datas.add(String.valueOf(i));
        }
        return datas;
    }


    public static List<SortEntity> getSortDatas(){
        String[] sortData = {"综合排序","问诊量","价格从低到高","价格从高到低"};
        List<SortEntity> sortEntities = new ArrayList<>();
        for (int i = 0; i < sortData.length; i++) {
            sortEntities.add(new SortEntity(i+1 , sortData[i]));
        }
        return sortEntities;
    }

    public static List<String> getTags(){
        String[] sortData = {"过敏","吸入","食入","注射式过敏" ,"接触式" ,"谁他妈知道","爱啥啥","恶心很","TAG真多"};
        return Arrays.asList(sortData);
    }



    public static List<DepartmentEntity> getDepartmentEntityList(Context context){
        String[] arrayNames = context.getResources().getStringArray(R.array.departmentnames);
        int[] icons = {R.drawable.ic_department1,R.drawable.ic_department2,
                R.drawable.ic_department3,R.drawable.ic_department4,R.drawable.ic_department5,
                R.drawable.ic_department6,R.drawable.ic_department7,R.drawable.ic_department8};
        List<DepartmentEntity> entities = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            entities.add(new DepartmentEntity(icons[i] , arrayNames[i]));
        }
        return entities;
    }

}
