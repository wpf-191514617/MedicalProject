package com.beitone.medical_store.app.entity.response;

import androidx.annotation.Nullable;

import java.util.List;

public class TreeFloorResponse {


    /**
     * children : [{"id":"66600","tenantId":"000001","parentId":"4","parentName":null,
     * "deptName":"发热门诊","fullName":"发热门诊","deptType":"mz","sort":0,"remark":"","isDefault":null}]
     * id : 66600
     * tenantId : 000001
     * parentId : 4
     * parentName : null
     * deptName : 发热门诊
     * fullName : 发热门诊
     * deptType : mz
     * sort : 0
     * remark :
     * isDefault : null
     */

    private String id;
    private String tenantId;
    private String parentId;
    private Object parentName;
    private String deptName;
    private String fullName;
    private String deptType;
    private int sort;
    private String remark;
    private String isDefault;
    private List<ChildrenBean> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Object getParentName() {
        return parentName;
    }

    public void setParentName(Object parentName) {
        this.parentName = parentName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public List<ChildrenBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenBean> children) {
        this.children = children;
    }

    public static class ChildrenBean {
        /**
         * id : 66600
         * tenantId : 000001
         * parentId : 4
         * parentName : null
         * deptName : 发热门诊
         * fullName : 发热门诊
         * deptType : mz
         * sort : 0
         * remark :
         * isDefault : null
         */

        private String id;
        private String tenantId;
        private String parentId;
        private String parentName;
        private String deptName;
        private String fullName;
        private String deptType;
        private int sort;
        private String remark;
        private String isDefault;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTenantId() {
            return tenantId;
        }

        public void setTenantId(String tenantId) {
            this.tenantId = tenantId;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getParentName() {
            return parentName;
        }

        public void setParentName(String parentName) {
            this.parentName = parentName;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getDeptType() {
            return deptType;
        }

        public void setDeptType(String deptType) {
            this.deptType = deptType;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(String isDefault) {
            this.isDefault = isDefault;
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            ChildrenBean childrenBean = (ChildrenBean) obj;
            return childrenBean.id.equals(id);
        }
    }
}
