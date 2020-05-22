package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class FindDocResponse {


    /**
     * records : [{"doctorId":"2010","doctorName":"陈笑英","phone":null,"deptId":"668530",
     * "deptName":"内科","hospitalId":"000003","hospitalName":"东莞市滨海湾中心医院","hyjDeptId":"66859",
     * "level":"副主任医生","specialty":"新型冠状病毒，肺炎免费咨询。内科常见病、多发及疑难病症的诊疗，擅侯对呼吸系统、消化系统，泌尿系统等疾病的诊治。",
     * "evaluate":0,"collection":0,"reply":0,"tag":"","practitioners":"20年","resume":"",
     * "createTime":null,"updateTime":null,"createUser":null,"updateUser":null,"doctorPic":"",
     * "certificatePic":null,"licensePic":null,"idCard":null,"nation":null,"isDeleted":null,
     * "status":null,"sex":2,"birthDate":null,"certificate":null,"certificateNo":null,
     * "certificateDate":null,"practisingCertificateNo":null,"openingDate":null,
     * "employmentDate":null,"registrationDate":null,"haveCertificateUrl":null,
     * "havePractisingCertificateUrl":null,"doctorStatus":1,"auditStatus":0,"commonId":null,
     * "textPrice":0.01,"videoPrice":0,"voicePrice":0.01,"textResLeft":0,"videoResLeft":0,
     * "voiceResLeft":0,"storeId":0,"similarity":0,"grade":"三甲医院"},{"doctorId":"2011",
     * "doctorName":"卢贵财","phone":null,"deptId":"668710","deptName":"内科","hospitalId":"000003",
     * "hospitalName":"东莞市滨海湾中心医院","hyjDeptId":"66859","level":"副主任医生",
     * "specialty":"新型冠状病毒，肺炎免费咨询。呼吸系统，消化系统，泌尿系统常见病的诊治。","evaluate":0,"collection":0,"reply":0,
     * "tag":"","practitioners":"20年","resume":"","createTime":null,"updateTime":null,
     * "createUser":null,"updateUser":null,"doctorPic":"","certificatePic":null,
     * "licensePic":null,"idCard":null,"nation":null,"isDeleted":null,"status":null,"sex":1,
     * "birthDate":null,"certificate":null,"certificateNo":null,"certificateDate":null,
     * "practisingCertificateNo":null,"openingDate":null,"employmentDate":null,
     * "registrationDate":null,"haveCertificateUrl":null,"havePractisingCertificateUrl":null,
     * "doctorStatus":1,"auditStatus":0,"commonId":null,"textPrice":0.01,"videoPrice":0,
     * "voicePrice":0.01,"textResLeft":0,"videoResLeft":0,"voiceResLeft":0,"storeId":0,
     * "similarity":0,"grade":"三甲医院"}]
     * total : 2
     * size : 10
     * current : 1
     * orders : []
     * searchCount : true
     * pages : 1
     */

    private int total;
    private int size;
    private int current;
    private boolean searchCount;
    private int pages;
    private List<RecordsBean> records;
    private List<?> orders;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public List<?> getOrders() {
        return orders;
    }

    public void setOrders(List<?> orders) {
        this.orders = orders;
    }

    public static class RecordsBean {
        /**
         * doctorId : 2010
         * doctorName : 陈笑英
         * phone : null
         * deptId : 668530
         * deptName : 内科
         * hospitalId : 000003
         * hospitalName : 东莞市滨海湾中心医院
         * hyjDeptId : 66859
         * level : 副主任医生
         * specialty : 新型冠状病毒，肺炎免费咨询。内科常见病、多发及疑难病症的诊疗，擅侯对呼吸系统、消化系统，泌尿系统等疾病的诊治。
         * evaluate : 0
         * collection : 0
         * reply : 0
         * tag :
         * practitioners : 20年
         * resume :
         * createTime : null
         * updateTime : null
         * createUser : null
         * updateUser : null
         * doctorPic :
         * certificatePic : null
         * licensePic : null
         * idCard : null
         * nation : null
         * isDeleted : null
         * status : null
         * sex : 2
         * birthDate : null
         * certificate : null
         * certificateNo : null
         * certificateDate : null
         * practisingCertificateNo : null
         * openingDate : null
         * employmentDate : null
         * registrationDate : null
         * haveCertificateUrl : null
         * havePractisingCertificateUrl : null
         * doctorStatus : 1
         * auditStatus : 0
         * commonId : null
         * textPrice : 0.01
         * videoPrice : 0
         * voicePrice : 0.01
         * textResLeft : 0
         * videoResLeft : 0
         * voiceResLeft : 0
         * storeId : 0
         * similarity : 0
         * grade : 三甲医院
         */

        private String doctorId;
        private String doctorName;
        private Object phone;
        private String deptId;
        private String deptName;
        private String hospitalId;
        private String hospitalName;
        private String hyjDeptId;
        private String level;
        private String specialty;
        private int evaluate;
        private int collection;
        private int reply;
        private String tag;
        private String practitioners;
        private String resume;
        private Object createTime;
        private Object updateTime;
        private Object createUser;
        private Object updateUser;
        private String doctorPic;
        private Object certificatePic;
        private Object licensePic;
        private Object idCard;
        private Object nation;
        private Object isDeleted;
        private Object status;
        private int sex;
        private Object birthDate;
        private Object certificate;
        private Object certificateNo;
        private Object certificateDate;
        private Object practisingCertificateNo;
        private Object openingDate;
        private Object employmentDate;
        private Object registrationDate;
        private Object haveCertificateUrl;
        private Object havePractisingCertificateUrl;
        private int doctorStatus;
        private int auditStatus;
        private Object commonId;
        private double textPrice;
        private int videoPrice;
        private double voicePrice;
        private int textResLeft;
        private int videoResLeft;
        private int voiceResLeft;
        private int storeId;
        private int similarity;
        private String grade;

        public String getDoctorId() {
            return doctorId;
        }

        public void setDoctorId(String doctorId) {
            this.doctorId = doctorId;
        }

        public String getDoctorName() {
            return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public String getDeptId() {
            return deptId;
        }

        public void setDeptId(String deptId) {
            this.deptId = deptId;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        public String getHospitalId() {
            return hospitalId;
        }

        public void setHospitalId(String hospitalId) {
            this.hospitalId = hospitalId;
        }

        public String getHospitalName() {
            return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        public String getHyjDeptId() {
            return hyjDeptId;
        }

        public void setHyjDeptId(String hyjDeptId) {
            this.hyjDeptId = hyjDeptId;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getSpecialty() {
            return specialty;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        public int getEvaluate() {
            return evaluate;
        }

        public void setEvaluate(int evaluate) {
            this.evaluate = evaluate;
        }

        public int getCollection() {
            return collection;
        }

        public void setCollection(int collection) {
            this.collection = collection;
        }

        public int getReply() {
            return reply;
        }

        public void setReply(int reply) {
            this.reply = reply;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getPractitioners() {
            return practitioners;
        }

        public void setPractitioners(String practitioners) {
            this.practitioners = practitioners;
        }

        public String getResume() {
            return resume;
        }

        public void setResume(String resume) {
            this.resume = resume;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public Object getCreateUser() {
            return createUser;
        }

        public void setCreateUser(Object createUser) {
            this.createUser = createUser;
        }

        public Object getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(Object updateUser) {
            this.updateUser = updateUser;
        }

        public String getDoctorPic() {
            return doctorPic;
        }

        public void setDoctorPic(String doctorPic) {
            this.doctorPic = doctorPic;
        }

        public Object getCertificatePic() {
            return certificatePic;
        }

        public void setCertificatePic(Object certificatePic) {
            this.certificatePic = certificatePic;
        }

        public Object getLicensePic() {
            return licensePic;
        }

        public void setLicensePic(Object licensePic) {
            this.licensePic = licensePic;
        }

        public Object getIdCard() {
            return idCard;
        }

        public void setIdCard(Object idCard) {
            this.idCard = idCard;
        }

        public Object getNation() {
            return nation;
        }

        public void setNation(Object nation) {
            this.nation = nation;
        }

        public Object getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Object isDeleted) {
            this.isDeleted = isDeleted;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public Object getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Object birthDate) {
            this.birthDate = birthDate;
        }

        public Object getCertificate() {
            return certificate;
        }

        public void setCertificate(Object certificate) {
            this.certificate = certificate;
        }

        public Object getCertificateNo() {
            return certificateNo;
        }

        public void setCertificateNo(Object certificateNo) {
            this.certificateNo = certificateNo;
        }

        public Object getCertificateDate() {
            return certificateDate;
        }

        public void setCertificateDate(Object certificateDate) {
            this.certificateDate = certificateDate;
        }

        public Object getPractisingCertificateNo() {
            return practisingCertificateNo;
        }

        public void setPractisingCertificateNo(Object practisingCertificateNo) {
            this.practisingCertificateNo = practisingCertificateNo;
        }

        public Object getOpeningDate() {
            return openingDate;
        }

        public void setOpeningDate(Object openingDate) {
            this.openingDate = openingDate;
        }

        public Object getEmploymentDate() {
            return employmentDate;
        }

        public void setEmploymentDate(Object employmentDate) {
            this.employmentDate = employmentDate;
        }

        public Object getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(Object registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Object getHaveCertificateUrl() {
            return haveCertificateUrl;
        }

        public void setHaveCertificateUrl(Object haveCertificateUrl) {
            this.haveCertificateUrl = haveCertificateUrl;
        }

        public Object getHavePractisingCertificateUrl() {
            return havePractisingCertificateUrl;
        }

        public void setHavePractisingCertificateUrl(Object havePractisingCertificateUrl) {
            this.havePractisingCertificateUrl = havePractisingCertificateUrl;
        }

        public int getDoctorStatus() {
            return doctorStatus;
        }

        public void setDoctorStatus(int doctorStatus) {
            this.doctorStatus = doctorStatus;
        }

        public int getAuditStatus() {
            return auditStatus;
        }

        public void setAuditStatus(int auditStatus) {
            this.auditStatus = auditStatus;
        }

        public Object getCommonId() {
            return commonId;
        }

        public void setCommonId(Object commonId) {
            this.commonId = commonId;
        }

        public double getTextPrice() {
            return textPrice;
        }

        public void setTextPrice(double textPrice) {
            this.textPrice = textPrice;
        }

        public int getVideoPrice() {
            return videoPrice;
        }

        public void setVideoPrice(int videoPrice) {
            this.videoPrice = videoPrice;
        }

        public double getVoicePrice() {
            return voicePrice;
        }

        public void setVoicePrice(double voicePrice) {
            this.voicePrice = voicePrice;
        }

        public int getTextResLeft() {
            return textResLeft;
        }

        public void setTextResLeft(int textResLeft) {
            this.textResLeft = textResLeft;
        }

        public int getVideoResLeft() {
            return videoResLeft;
        }

        public void setVideoResLeft(int videoResLeft) {
            this.videoResLeft = videoResLeft;
        }

        public int getVoiceResLeft() {
            return voiceResLeft;
        }

        public void setVoiceResLeft(int voiceResLeft) {
            this.voiceResLeft = voiceResLeft;
        }

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
        }

        public int getSimilarity() {
            return similarity;
        }

        public void setSimilarity(int similarity) {
            this.similarity = similarity;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }
    }
}
