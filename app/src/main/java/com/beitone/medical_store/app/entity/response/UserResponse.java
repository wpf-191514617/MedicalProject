package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class UserResponse {


    /**
     * userId : 7181776633762244
     * userName : u343385
     * nickName : u343385
     * real_name : null
         * avatar : null
         * email : null
     * phone : 15691003913
         * birthday : null
         * createUser : null
     * createTime : 2020-05-07 10:07:08
         * updateUser : null
     * updateTime : 2020-05-07 10:07:08
         * status : null
         * isDeleted : false
         * idCard : null
         * sex : null
         * province : null
         * city : null
         * country : null
     * roles : [{"id":"3","parentId":"0","tenantId":"000001","roleName":"普通用户","sort":0,
     * "roleAlias":"user","isDeleted":0,"isDefault":1,"parentName":null}]
     * depts : []
     * tenants : [{"tenantId":"000001","tenantName":"系统默认租户","contactNumber":"","address":"",
     * "createUser":"","createTime":"2020-02-28 19:16:56","updateUser":null,
     * "updateTime":"2020-02-28 19:17:05","status":1,"isDeleted":0,"postalCode":"",
     * "images":"","grade":"","introduce":"","linkman":"admin","isDefault":1}]
         */

        private String userId;
        private String userName;
        private String nickName;
    private Object real_name;
        private Object avatar;
        private Object email;
        private String phone;
        private Object birthday;
        private Object createUser;
        private String createTime;
        private Object updateUser;
        private String updateTime;
        private Object status;
        private boolean isDeleted;
        private Object idCard;
        private Object sex;
        private Object province;
        private Object city;
        private Object country;
    private List<RolesBean> roles;
    private List<?> depts;
    private List<TenantsBean> tenants;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

    public Object getReal_name() {
        return real_name;
    }

    public void setReal_name(Object real_name) {
        this.real_name = real_name;
    }

        public Object getAvatar() {
            return avatar;
        }

        public void setAvatar(Object avatar) {
            this.avatar = avatar;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getBirthday() {
            return birthday;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public Object getCreateUser() {
            return createUser;
        }

        public void setCreateUser(Object createUser) {
            this.createUser = createUser;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(Object updateUser) {
            this.updateUser = updateUser;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public boolean isIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(boolean isDeleted) {
            this.isDeleted = isDeleted;
        }

        public Object getIdCard() {
            return idCard;
        }

        public void setIdCard(Object idCard) {
            this.idCard = idCard;
        }

        public Object getSex() {
            return sex;
        }

        public void setSex(Object sex) {
            this.sex = sex;
        }

        public Object getProvince() {
            return province;
        }

        public void setProvince(Object province) {
            this.province = province;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public Object getCountry() {
            return country;
        }

        public void setCountry(Object country) {
            this.country = country;
        }

    public List<RolesBean> getRoles() {
        return roles;
    }

    public void setRoles(List<RolesBean> roles) {
        this.roles = roles;
    }

    public List<?> getDepts() {
        return depts;
    }

    public void setDepts(List<?> depts) {
        this.depts = depts;
    }

    public List<TenantsBean> getTenants() {
        return tenants;
    }

    public void setTenants(List<TenantsBean> tenants) {
        this.tenants = tenants;
    }

    public static class RolesBean {
        /**
         * id : 3
         * parentId : 0
         * tenantId : 000001
         * roleName : 普通用户
         * sort : 0
         * roleAlias : user
         * isDeleted : 0
         * isDefault : 1
         * parentName : null
         */

        private String id;
        private String parentId;
        private String tenantId;
        private String roleName;
        private int sort;
        private String roleAlias;
        private int isDeleted;
        private int isDefault;
        private Object parentName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getTenantId() {
            return tenantId;
        }

        public void setTenantId(String tenantId) {
            this.tenantId = tenantId;
        }

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getRoleAlias() {
            return roleAlias;
        }

        public void setRoleAlias(String roleAlias) {
            this.roleAlias = roleAlias;
        }

        public int getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(int isDeleted) {
            this.isDeleted = isDeleted;
        }

        public int getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(int isDefault) {
            this.isDefault = isDefault;
        }

        public Object getParentName() {
            return parentName;
        }

        public void setParentName(Object parentName) {
            this.parentName = parentName;
        }
    }

    public static class TenantsBean {
        /**
         * tenantId : 000001
         * tenantName : 系统默认租户
         * contactNumber :
         * address :
         * createUser :
         * createTime : 2020-02-28 19:16:56
         * updateUser : null
         * updateTime : 2020-02-28 19:17:05
         * status : 1
         * isDeleted : 0
         * postalCode :
         * images :
         * grade :
         * introduce :
         * linkman : admin
         * isDefault : 1
         */

        private String tenantId;
        private String tenantName;
        private String contactNumber;
        private String address;
        private String createUser;
        private String createTime;
        private Object updateUser;
        private String updateTime;
        private int status;
        private int isDeleted;
        private String postalCode;
        private String images;
        private String grade;
        private String introduce;
        private String linkman;
        private int isDefault;

        public String getTenantId() {
            return tenantId;
        }

        public void setTenantId(String tenantId) {
            this.tenantId = tenantId;
        }

        public String getTenantName() {
            return tenantName;
        }

        public void setTenantName(String tenantName) {
            this.tenantName = tenantName;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCreateUser() {
            return createUser;
        }

        public void setCreateUser(String createUser) {
            this.createUser = createUser;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(Object updateUser) {
            this.updateUser = updateUser;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(int isDeleted) {
            this.isDeleted = isDeleted;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getIntroduce() {
            return introduce;
        }

        public void setIntroduce(String introduce) {
            this.introduce = introduce;
        }

        public String getLinkman() {
            return linkman;
        }

        public void setLinkman(String linkman) {
            this.linkman = linkman;
        }

        public int getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(int isDefault) {
            this.isDefault = isDefault;
        }
    }

}
