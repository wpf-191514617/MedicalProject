package com.beitone.medical_store.app.entity.response;

import java.util.List;

public class FindDocResponse {


    /**
     * records : [{"doctorId":"1269837091915698177","doctorName":"王苟长","phone":null,"level":"",
     * "specialty":"","evaluate":null,"collection":null,"reply":null,"tag":null,
     * "practitioners":"","resume":"","createTime":null,"updateTime":null,"createUser":null,
     * "updateUser":null,"doctorPic":"","certificatePic":null,"licensePic":null,"idCard":null,
     * "nation":null,"isDeleted":0,"sex":1,"birthDate":null,"certificate":null,
     * "certificateNo":null,"certificateDate":null,"practisingCertificateNo":null,
     * "openingDate":null,"employmentDate":null,"registrationDate":null,
     * "haveCertificateUrl":null,"havePractisingCertificateUrl":null,"doctorStatus":null,
     * "education":null,"deptId":"1267653486841958401","deptName":"内科","hospitalId":"000003",
     * "hospitalName":"怡心园医院","hyjDeptId":null,"business":"[1,3]","storeId":0,"commonId":null,
     * "textPrice":0.01,"videoPrice":0.01,"voicePrice":0.01,"textInqNumber":0,"voiceInqNumber":0,
     * "videoInqNumber":0,"similarity":0,"grade":"二甲医院","auditStatus":null,"deptIdJson":null},{
     * "doctorId":"1269836945932947458","doctorName":"周大成","phone":null,"level":"",
     * "specialty":"擅长精神类相关的","evaluate":null,"collection":null,"reply":null,"tag":null,
     * "practitioners":"","resume":"","createTime":null,"updateTime":null,"createUser":null,
     * "updateUser":null,"doctorPic":"","certificatePic":null,"licensePic":null,"idCard":null,
     * "nation":null,"isDeleted":0,"sex":1,"birthDate":null,"certificate":null,
     * "certificateNo":null,"certificateDate":null,"practisingCertificateNo":null,
     * "openingDate":null,"employmentDate":null,"registrationDate":null,
     * "haveCertificateUrl":null,"havePractisingCertificateUrl":null,"doctorStatus":null,
     * "education":null,"deptId":"1263424810726318082","deptName":"精神科","hospitalId":"000003",
     * "hospitalName":"怡心园医院","hyjDeptId":null,"business":"[1,3]","storeId":0,"commonId":null,
     * "textPrice":0.01,"videoPrice":0.01,"voicePrice":0.01,"textInqNumber":0,"voiceInqNumber":0,
     * "videoInqNumber":0,"similarity":0,"grade":"二甲医院","auditStatus":null,"deptIdJson":null},{
     * "doctorId":"1269836845970100225","doctorName":"陈广发","phone":null,"level":"",
     * "specialty":"专门进行心理咨询和辅导","evaluate":null,"collection":null,"reply":null,"tag":null,
     * "practitioners":"","resume":"","createTime":null,"updateTime":null,"createUser":null,
     * "updateUser":null,"doctorPic":"","certificatePic":null,"licensePic":null,"idCard":null,
     * "nation":null,"isDeleted":0,"sex":1,"birthDate":null,"certificate":null,
     * "certificateNo":null,"certificateDate":null,"practisingCertificateNo":null,
     * "openingDate":null,"employmentDate":null,"registrationDate":null,
     * "haveCertificateUrl":null,"havePractisingCertificateUrl":null,"doctorStatus":null,
     * "education":null,"deptId":"1263424619340226562","deptName":"心理科","hospitalId":"000003",
     * "hospitalName":"怡心园医院","hyjDeptId":null,"business":"[1,2,3]","storeId":0,"commonId":null,
     * "textPrice":30,"videoPrice":30,"voicePrice":30,"textInqNumber":0,"voiceInqNumber":0,
     * "videoInqNumber":0,"similarity":0,"grade":"二甲医院","auditStatus":null,"deptIdJson":null},{
     * "doctorId":"1269837091915698177","doctorName":"王苟长","phone":null,"level":"",
     * "specialty":"","evaluate":null,"collection":null,"reply":null,"tag":null,
     * "practitioners":"","resume":"","createTime":null,"updateTime":null,"createUser":null,
     * "updateUser":null,"doctorPic":"","certificatePic":null,"licensePic":null,"idCard":null,
     * "nation":null,"isDeleted":0,"sex":1,"birthDate":null,"certificate":null,
     * "certificateNo":null,"certificateDate":null,"practisingCertificateNo":null,
     * "openingDate":null,"employmentDate":null,"registrationDate":null,
     * "haveCertificateUrl":null,"havePractisingCertificateUrl":null,"doctorStatus":null,
     * "education":null,"deptId":"1263424619340226562","deptName":"心理科","hospitalId":"000003",
     * "hospitalName":"怡心园医院","hyjDeptId":null,"business":"[1,2,3]","storeId":0,"commonId":null,
     * "textPrice":30,"videoPrice":30,"voicePrice":30,"textInqNumber":0,"voiceInqNumber":0,
     * "videoInqNumber":0,"similarity":0,"grade":"二甲医院","auditStatus":null,"deptIdJson":null}]
     * total : 4
     * size : 10
     * current : 1
     * orders : []
     * hitCount : false
     * searchCount : true
     * pages : 1
     */

    private int total;
    private int size;
    private int current;
    private boolean hitCount;
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

    public boolean isHitCount() {
        return hitCount;
    }

    public void setHitCount(boolean hitCount) {
        this.hitCount = hitCount;
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
         * doctorId : 1269837091915698177
         * doctorName : 王苟长
         * phone : null
         * level :
         * specialty :
         * evaluate : null
         * collection : null
         * reply : null
         * tag : null
         * practitioners :
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
         * isDeleted : 0
         * sex : 1
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
         * doctorStatus : null
         * education : null
         * deptId : 1267653486841958401
         * deptName : 内科
         * hospitalId : 000003
         * hospitalName : 怡心园医院
         * hyjDeptId : null
         * business : [1,3]
         * storeId : 0
         * commonId : null
         * textPrice : 0.01
         * videoPrice : 0.01
         * voicePrice : 0.01
         * textInqNumber : 0
         * voiceInqNumber : 0
         * videoInqNumber : 0
         * similarity : 0
         * grade : 二甲医院
         * auditStatus : null
         * deptIdJson : null
         */

        private String doctorId;
        private String doctorName;
        private Object phone;
        private String level;
        private String specialty;
        private Object evaluate;
        private Object collection;
        private Object reply;
        private Object tag;
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
        private int isDeleted;
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
        private Object doctorStatus;
        private Object education;
        private String deptId;
        private String deptName;
        private String hospitalId;
        private String hospitalName;
        private Object hyjDeptId;
        private String business;
        private int storeId;
        private Object commonId;
        private double textPrice;
        private double videoPrice;
        private double voicePrice;
        private int textInqNumber;
        private int voiceInqNumber;
        private int videoInqNumber;
        private int similarity;
        private String grade;
        private Object auditStatus;
        private Object deptIdJson;

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

        public Object getEvaluate() {
            return evaluate;
        }

        public void setEvaluate(Object evaluate) {
            this.evaluate = evaluate;
        }

        public Object getCollection() {
            return collection;
        }

        public void setCollection(Object collection) {
            this.collection = collection;
        }

        public Object getReply() {
            return reply;
        }

        public void setReply(Object reply) {
            this.reply = reply;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
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

        public int getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(int isDeleted) {
            this.isDeleted = isDeleted;
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

        public Object getDoctorStatus() {
            return doctorStatus;
        }

        public void setDoctorStatus(Object doctorStatus) {
            this.doctorStatus = doctorStatus;
        }

        public Object getEducation() {
            return education;
        }

        public void setEducation(Object education) {
            this.education = education;
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

        public Object getHyjDeptId() {
            return hyjDeptId;
        }

        public void setHyjDeptId(Object hyjDeptId) {
            this.hyjDeptId = hyjDeptId;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }

        public int getStoreId() {
            return storeId;
        }

        public void setStoreId(int storeId) {
            this.storeId = storeId;
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

        public double getVideoPrice() {
            return videoPrice;
        }

        public void setVideoPrice(double videoPrice) {
            this.videoPrice = videoPrice;
        }

        public double getVoicePrice() {
            return voicePrice;
        }

        public void setVoicePrice(double voicePrice) {
            this.voicePrice = voicePrice;
        }

        public int getTextInqNumber() {
            return textInqNumber;
        }

        public void setTextInqNumber(int textInqNumber) {
            this.textInqNumber = textInqNumber;
        }

        public int getVoiceInqNumber() {
            return voiceInqNumber;
        }

        public void setVoiceInqNumber(int voiceInqNumber) {
            this.voiceInqNumber = voiceInqNumber;
        }

        public int getVideoInqNumber() {
            return videoInqNumber;
        }

        public void setVideoInqNumber(int videoInqNumber) {
            this.videoInqNumber = videoInqNumber;
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

        public Object getAuditStatus() {
            return auditStatus;
        }

        public void setAuditStatus(Object auditStatus) {
            this.auditStatus = auditStatus;
        }

        public Object getDeptIdJson() {
            return deptIdJson;
        }

        public void setDeptIdJson(Object deptIdJson) {
            this.deptIdJson = deptIdJson;
        }
    }
}
