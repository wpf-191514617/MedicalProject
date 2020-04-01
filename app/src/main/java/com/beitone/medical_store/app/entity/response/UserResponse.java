package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class UserResponse {


    /**
     * userId : 5477728426887373
     * userName : u868341
     * tenantId : 000001
     * memberId : 5477728426887373
     * memberName : u868341
     * roleIds : ["3"]
     * deptIds : null
     * token : eyJhbGciOiJIUzUxMiJ9
     * .eyJpc3MiOiJaS1lTIiwic3ViIjoiNTQ3NzcyODQyNjg4NzM3MyIsImlhdCI6MTU4NTcyNzY1OCwiZXhwIjoxNTg2MzMyNDU4fQ.x7-E0osaMoFV9DCu19oplhtW478Nep80zAxbYdWCCO7UjVC1t6LN5696__owQKu5HcMxGQZfJGNag1kwc6yHyg
     * desc : null
     * userInfo : {"tenantId":"000001","userId":"5477728426887373","userName":"u868341",
     * "nickName":"u868341","avatar":null,"email":null,"phone":"15529000512","birthday":null,
     * "roleId":"3","deptId":null,"roleName":null,"deptName":null,"createUser":null,
     * "createTime":"2020-04-01 15:54:18","updateUser":null,"updateTime":"2020-04-01 15:54:18",
     * "status":null,"isDeleted":false,"idCard":null,"sex":null,"payOpenId":null,"province":null,
     * "city":null,"country":null,"unionid":null}
     */

    private String userId;
    private String userName;
    private String tenantId;
    private String memberId;
    private String memberName;
    private String deptIds;
    private String token;
    private String desc;
    private UserInfoBean userInfo;
    private List<String> roleIds;

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

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(String deptIds) {
        this.deptIds = deptIds;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public static class UserInfoBean {
        /**
         * tenantId : 000001
         * userId : 5477728426887373
         * userName : u868341
         * nickName : u868341
         * avatar : null
         * email : null
         * phone : 15529000512
         * birthday : null
         * roleId : 3
         * deptId : null
         * roleName : null
         * deptName : null
         * createUser : null
         * createTime : 2020-04-01 15:54:18
         * updateUser : null
         * updateTime : 2020-04-01 15:54:18
         * status : null
         * isDeleted : false
         * idCard : null
         * sex : null
         * payOpenId : null
         * province : null
         * city : null
         * country : null
         * unionid : null
         */

        private String tenantId;
        private String userId;
        private String userName;
        private String nickName;
        private Object avatar;
        private Object email;
        private String phone;
        private Object birthday;
        private String roleId;
        private Object deptId;
        private Object roleName;
        private Object deptName;
        private Object createUser;
        private String createTime;
        private Object updateUser;
        private String updateTime;
        private Object status;
        private boolean isDeleted;
        private Object idCard;
        private Object sex;
        private Object payOpenId;
        private Object province;
        private Object city;
        private Object country;
        private Object unionid;

        public String getTenantId() {
            return tenantId;
        }

        public void setTenantId(String tenantId) {
            this.tenantId = tenantId;
        }

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

        public String getRoleId() {
            return roleId;
        }

        public void setRoleId(String roleId) {
            this.roleId = roleId;
        }

        public Object getDeptId() {
            return deptId;
        }

        public void setDeptId(Object deptId) {
            this.deptId = deptId;
        }

        public Object getRoleName() {
            return roleName;
        }

        public void setRoleName(Object roleName) {
            this.roleName = roleName;
        }

        public Object getDeptName() {
            return deptName;
        }

        public void setDeptName(Object deptName) {
            this.deptName = deptName;
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

        public Object getPayOpenId() {
            return payOpenId;
        }

        public void setPayOpenId(Object payOpenId) {
            this.payOpenId = payOpenId;
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

        public Object getUnionid() {
            return unionid;
        }

        public void setUnionid(Object unionid) {
            this.unionid = unionid;
        }
    }
}
