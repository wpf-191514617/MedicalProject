package com.beitone.medical_store.app.entity.response;

import java.util.List;

import cn.betatown.mobile.beitonelibrary.http.BaseResponse;

public class AuthLoginResponse extends BaseResponse {


    /**
     * access_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
     * .eyJ0ZW5hbnRfaWQiOiIwMDAwMDEiLCJ1c2VySW5mbyI6eyJwYXNzd29yZCI6IjMxYjUxMWI4MGYwYmFkYjVmYjhkYTQxMzQ0ZjU4MjY0IiwidXNlcm5hbWUiOiJ1MjI5OTAwIiwiYXV0aG9yaXRpZXMiOlt7ImF1dGhvcml0eSI6InVzZXIifV0sImFjY291bnROb25FeHBpcmVkIjp0cnVlLCJhY2NvdW50Tm9uTG9ja2VkIjp0cnVlLCJjcmVkZW50aWFsc05vbkV4cGlyZWQiOnRydWUsImVuYWJsZWQiOnRydWUsInVzZXJJZCI6IjEyNjgxMDQ3NjM1ODU1OTc0NDIiLCJ0ZW5hbnRJZCI6IjAwMDAwMSIsIm5hbWUiOiJ1MjI5OTAwIiwicmVhbE5hbWUiOm51bGwsImFjY291bnQiOiJ1MjI5OTAwIiwiZGVwdElkIjoiMTI1Nzk1OTczNjc0MjAzMTM2MiIsInJvbGVJZCI6IjEyNjA4MzI1NjU3MjM4NDg3MDUiLCJyb2xlTmFtZSI6InVzZXIiLCJhdmF0YXIiOiIiLCJmaXJzdCI6ZmFsc2V9LCJjb2RlIjoyMDAsInVzZXJfbmFtZSI6InUyMjk5MDAiLCJyZWFsX25hbWUiOm51bGwsImF2YXRhciI6IiIsImF1dGhvcml0aWVzIjpbInVzZXIiXSwiY2xpZW50X2lkIjoid2VhcHAiLCJ0b2tlbiI6ImV5SmhiR2NpT2lKSVV6STFOaUlzSW5SNWNDSTZJa3BYVkNKOS5leUpsZUhBaU9qRTFPVEV4Tnpnek16WXNJblZ6WlhKZmJtRnRaU0k2SW5VeU1qazVNREFpTENKaGRYUm9iM0pwZEdsbGN5STZXeUoxYzJWeUlsMHNJbXAwYVNJNklqQmtNRFJqWm1NekxXVTVaVEF0TkdObU9TMWlaVGRoTFRCak9EUTFNbVF4TW1ZeU9DSXNJbU5zYVdWdWRGOXBaQ0k2SW5kbFlYQndJaXdpYzJOdmNHVWlPbHNpWVd4c0lsMTkuZzRhNTVEcng3SVJpZ3U5Y09zdXJUaDdIR0JrXzNfcXlCODhOZ1luVUpyRSIsInJvbGVfbmFtZSI6InVzZXIiLCJpc0ZpcnN0IjpmYWxzZSwibGljZW5zZSI6InBvd2VyZWQgYnkgY3h6eCIsInVzZXJfaWQiOiIxMjY4MTA0NzYzNTg1NTk3NDQyIiwicm9sZV9pZCI6IjEyNjA4MzI1NjU3MjM4NDg3MDUiLCJzY29wZSI6WyJhbGwiXSwibmlja19uYW1lIjoidTIyOTkwMCIsImV4cCI6MTU5MTE3ODMzNiwiZGVwdF9pZCI6IjEyNTc5NTk3MzY3NDIwMzEzNjIiLCJqdGkiOiIwZDA0Y2ZjMy1lOWUwLTRjZjktYmU3YS0wYzg0NTJkMTJmMjgiLCJhY2NvdW50IjoidTIyOTkwMCJ9.4-cveJ1xojIKCv9pTLzH8QOArYGFfMtonVhZBsjUB4s
     * token_type : bearer
     * refresh_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
     * .eyJ0ZW5hbnRfaWQiOiIwMDAwMDEiLCJ1c2VySW5mbyI6eyJwYXNzd29yZCI6IjMxYjUxMWI4MGYwYmFkYjVmYjhkYTQxMzQ0ZjU4MjY0IiwidXNlcm5hbWUiOiJ1MjI5OTAwIiwiYXV0aG9yaXRpZXMiOlt7ImF1dGhvcml0eSI6InVzZXIifV0sImFjY291bnROb25FeHBpcmVkIjp0cnVlLCJhY2NvdW50Tm9uTG9ja2VkIjp0cnVlLCJjcmVkZW50aWFsc05vbkV4cGlyZWQiOnRydWUsImVuYWJsZWQiOnRydWUsInVzZXJJZCI6IjEyNjgxMDQ3NjM1ODU1OTc0NDIiLCJ0ZW5hbnRJZCI6IjAwMDAwMSIsIm5hbWUiOiJ1MjI5OTAwIiwicmVhbE5hbWUiOm51bGwsImFjY291bnQiOiJ1MjI5OTAwIiwiZGVwdElkIjoiMTI1Nzk1OTczNjc0MjAzMTM2MiIsInJvbGVJZCI6IjEyNjA4MzI1NjU3MjM4NDg3MDUiLCJyb2xlTmFtZSI6InVzZXIiLCJhdmF0YXIiOiIiLCJmaXJzdCI6ZmFsc2V9LCJjb2RlIjoyMDAsInVzZXJfbmFtZSI6InUyMjk5MDAiLCJyZWFsX25hbWUiOm51bGwsImF2YXRhciI6IiIsImF1dGhvcml0aWVzIjpbInVzZXIiXSwiY2xpZW50X2lkIjoid2VhcHAiLCJ0b2tlbiI6ImV5SmhiR2NpT2lKSVV6STFOaUlzSW5SNWNDSTZJa3BYVkNKOS5leUpsZUhBaU9qRTFPVEV4Tnpnek16WXNJblZ6WlhKZmJtRnRaU0k2SW5VeU1qazVNREFpTENKaGRYUm9iM0pwZEdsbGN5STZXeUoxYzJWeUlsMHNJbXAwYVNJNklqQmtNRFJqWm1NekxXVTVaVEF0TkdObU9TMWlaVGRoTFRCak9EUTFNbVF4TW1ZeU9DSXNJbU5zYVdWdWRGOXBaQ0k2SW5kbFlYQndJaXdpYzJOdmNHVWlPbHNpWVd4c0lsMTkuZzRhNTVEcng3SVJpZ3U5Y09zdXJUaDdIR0JrXzNfcXlCODhOZ1luVUpyRSIsInJvbGVfbmFtZSI6InVzZXIiLCJpc0ZpcnN0IjpmYWxzZSwibGljZW5zZSI6InBvd2VyZWQgYnkgY3h6eCIsInVzZXJfaWQiOiIxMjY4MTA0NzYzNTg1NTk3NDQyIiwicm9sZV9pZCI6IjEyNjA4MzI1NjU3MjM4NDg3MDUiLCJzY29wZSI6WyJhbGwiXSwibmlja19uYW1lIjoidTIyOTkwMCIsImF0aSI6IjBkMDRjZmMzLWU5ZTAtNGNmOS1iZTdhLTBjODQ1MmQxMmYyOCIsImV4cCI6MTU5MTc3OTUzNiwiZGVwdF9pZCI6IjEyNTc5NTk3MzY3NDIwMzEzNjIiLCJqdGkiOiJkMmE0YjE2ZS0xOTQ1LTQ0ZTYtOGU2YS1jYTRkYzQ3NDEwYzAiLCJhY2NvdW50IjoidTIyOTkwMCJ9.cvYpwOqwk6iNc8nKKKmalPSISdmDrayWWj-KzzVCnp4
     * expires_in : 3599
     * scope : all
     * tenant_id : 000001
     * userInfo : {"password":"31b511b80f0badb5fb8da41344f58264","username":"u229900",
     * "authorities":[{"authority":"user"}],"accountNonExpired":true,"accountNonLocked":true,
     * "credentialsNonExpired":true,"enabled":true,"userId":"1268104763585597442",
     * "tenantId":"000001","name":"u229900","realName":null,"account":"u229900",
     * "deptId":"1257959736742031362","roleId":"1260832565723848705","roleName":"user",
     * "avatar":"","first":false}
     * code : 200
     * user_name : u229900
     * real_name : null
     * avatar :
     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
     * .eyJleHAiOjE1OTExNzgzMzYsInVzZXJfbmFtZSI6InUyMjk5MDAiLCJhdXRob3JpdGllcyI6WyJ1c2VyIl0sImp0aSI6IjBkMDRjZmMzLWU5ZTAtNGNmOS1iZTdhLTBjODQ1MmQxMmYyOCIsImNsaWVudF9pZCI6IndlYXBwIiwic2NvcGUiOlsiYWxsIl19.g4a55Drx7IRigu9cOsurTh7HGBk_3_qyB88NgYnUJrE
     * role_name : user
     * isFirst : false
     * license : powered by cxzx
     * user_id : 1268104763585597442
     * role_id : 1260832565723848705
     * nick_name : u229900
     * dept_id : 1257959736742031362
     * account : u229900
     * jti : 0d04cfc3-e9e0-4cf9-be7a-0c8452d12f28
     */

    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String tenant_id;
    private UserResponse userInfo;
    private String user_name;
    private Object real_name;
    private String avatar;
    private String token;
    private String role_name;
    private boolean isFirst;
    private String license;
    private String user_id;
    private String role_id;
    private String nick_name;
    private String dept_id;
    private String account;
    private String jti;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public UserResponse getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserResponse userInfo) {
        this.userInfo = userInfo;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Object getReal_name() {
        return real_name;
    }

    public void setReal_name(Object real_name) {
        this.real_name = real_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public boolean isIsFirst() {
        return isFirst;
    }

    public void setIsFirst(boolean isFirst) {
        this.isFirst = isFirst;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

}
