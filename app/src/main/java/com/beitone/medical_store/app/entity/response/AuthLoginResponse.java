package com.beitone.medical_store.app.entity.response;

public class AuthLoginResponse {


    /**
     * userId : 7181776633762244
     * userName : u343385
     * memberId : 7181776633762244
     * memberName : u343385
     * token : 4b5248fd698f1b8fdf823667cc693a64
     * desc : null
     * userInfo : {"userId":"7181776633762244","userName":"u343385","nickName":"u343385",
     * "real_name":null,"avatar":null,"email":null,"phone":"15691003913","birthday":null,
     * "createUser":null,"createTime":"2020-05-07 10:07:08","updateUser":null,
     * "updateTime":"2020-05-07 10:07:08","status":null,"isDeleted":false,"idCard":null,
     * "sex":null,"province":null,"city":null,"country":null,"roles":[{"id":"3","parentId":"0",
     * "tenantId":"000001","roleName":"普通用户","sort":0,"roleAlias":"user","isDeleted":0,
     * "isDefault":1,"parentName":null}],"depts":[],"tenants":[{"tenantId":"000001",
     * "tenantName":"系统默认租户","contactNumber":"","address":"","createUser":"",
     * "createTime":"2020-02-28 19:16:56","updateUser":null,"updateTime":"2020-02-28 19:17:05",
     * "status":1,"isDeleted":0,"postalCode":"","images":"","grade":"","introduce":"",
     * "linkman":"admin","isDefault":1}]}
     * first : true
     */

    private String userId;
    private String userName;
    private String memberId;
    private String memberName;
    private String token;
    private String desc;
    private UserResponse userInfo;
    private boolean first;

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

    public UserResponse getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserResponse userInfo) {
        this.userInfo = userInfo;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }


}
