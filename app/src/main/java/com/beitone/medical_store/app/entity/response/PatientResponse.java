package com.beitone.medical_store.app.entity.response;

import android.os.Parcel;
import android.os.Parcelable;

public class PatientResponse implements Parcelable {


    /**
     * patientId : 18423591400681745430
     * patientName : wang
     * birthDate : 1991-12-25 00:00:00
     * userId : 7181776633762244
     * idCard : 610323199112255514
     * addressStr : null
     * adress : null
     * detailAdress : null
     * addressPosition : null
     * phone : null
     * createTime : null
     * updateTime : null
     * createUser : null
     * updateUser : null
     * cxbz : null
     * hospitalInstitutionsNo : null
     * sex : 1
     * setDefault : 0
     */

    private String patientId;
    private String patientName;
    private String birthDate;
    private String userId;
    private String idCard;
    private String addressStr;
    private String adress;
    private String detailAdress;
    private String addressPosition;
    private String phone;
    private String createTime;
    private String updateTime;
    private String createUser;
    private String updateUser;
    private String cxbz;
    private String hospitalInstitutionsNo;
    private int sex;
    private int setDefault;



    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddressStr() {
        return addressStr;
    }

    public void setAddressStr(String addressStr) {
        this.addressStr = addressStr;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDetailAdress() {
        return detailAdress;
    }

    public void setDetailAdress(String detailAdress) {
        this.detailAdress = detailAdress;
    }

    public String getAddressPosition() {
        return addressPosition;
    }

    public void setAddressPosition(String addressPosition) {
        this.addressPosition = addressPosition;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getCxbz() {
        return cxbz;
    }

    public void setCxbz(String cxbz) {
        this.cxbz = cxbz;
    }

    public String getHospitalInstitutionsNo() {
        return hospitalInstitutionsNo;
    }

    public void setHospitalInstitutionsNo(String hospitalInstitutionsNo) {
        this.hospitalInstitutionsNo = hospitalInstitutionsNo;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSetDefault() {
        return setDefault;
    }

    public void setSetDefault(int setDefault) {
        this.setDefault = setDefault;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.patientId);
        dest.writeString(this.patientName);
        dest.writeString(this.birthDate);
        dest.writeString(this.userId);
        dest.writeString(this.idCard);
        dest.writeString(this.addressStr);
        dest.writeString(this.adress);
        dest.writeString(this.detailAdress);
        dest.writeString(this.addressPosition);
        dest.writeString(this.phone);
        dest.writeString(this.createTime);
        dest.writeString(this.updateTime);
        dest.writeString(this.createUser);
        dest.writeString(this.updateUser);
        dest.writeString(this.cxbz);
        dest.writeString(this.hospitalInstitutionsNo);
        dest.writeInt(this.sex);
        dest.writeInt(this.setDefault);
    }

    public PatientResponse() {
    }

    protected PatientResponse(Parcel in) {
        this.patientId = in.readString();
        this.patientName = in.readString();
        this.birthDate = in.readString();
        this.userId = in.readString();
        this.idCard = in.readString();
        this.addressStr = in.readString();
        this.adress = in.readString();
        this.detailAdress = in.readString();
        this.addressPosition = in.readString();
        this.phone = in.readString();
        this.createTime = in.readString();
        this.updateTime = in.readString();
        this.createUser = in.readString();
        this.updateUser = in.readString();
        this.cxbz = in.readString();
        this.hospitalInstitutionsNo = in.readString();
        this.sex = in.readInt();
        this.setDefault = in.readInt();
    }

    public static final Parcelable.Creator<PatientResponse> CREATOR = new Parcelable.Creator<PatientResponse>() {
        @Override
        public PatientResponse createFromParcel(Parcel source) {
            return new PatientResponse(source);
        }

        @Override
        public PatientResponse[] newArray(int size) {
            return new PatientResponse[size];
        }
    };
}
