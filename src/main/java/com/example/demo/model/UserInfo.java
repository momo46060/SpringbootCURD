package com.example.demo.model;

public class UserInfo {
    private Short autocode;

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public UserInfo(Short autocode, String nameEn, String nameAr, String userName, int alpha_code, Short companyId, String email, String mobile, Short roleid, String roledesc, String uid) {
        this.autocode = autocode;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.userName = userName;
        this.alpha_code = alpha_code;
        this.companyId = companyId;
        this.email = email;
        this.mobile = mobile;
        this.roleid = roleid;
        this.roledesc = roledesc;
        this.uid = uid;
    }

    private String nameEn;
    private String nameAr;
    private String userName;
    private int alpha_code;
    private Short companyId;
    private String email;
    private String mobile;
    private Short roleid;
    private String roledesc;
    private String uid;

    public UserInfo() {
    }


    public int getAutocode() {
        return autocode;
    }

    public void setAutocode(Short autocode) {
        this.autocode = autocode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAlpha_code() {
        return alpha_code;
    }

    public void setAlpha_code(int alpha_code) {
        this.alpha_code = alpha_code;
    }

    public Short getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Short companyId) {
        this.companyId = companyId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Short getRoleid() {
        return roleid;
    }

    public void setRoleid(Short roleid) {
        this.roleid = roleid;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
