package com.briup.apps.cms.bean;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.ID
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.USERNAME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.PASSWORD
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.TELEPHONE
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.REALNAME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.GENDER
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.BIRTH
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.REGISTER_TIME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private Date registerTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.STATUS
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.USER_FACE
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    private String userFace;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.ID
     *
     * @return the value of cms_user.ID
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.ID
     *
     * @param id the value for cms_user.ID
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.USERNAME
     *
     * @return the value of cms_user.USERNAME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.USERNAME
     *
     * @param username the value for cms_user.USERNAME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.PASSWORD
     *
     * @return the value of cms_user.PASSWORD
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.PASSWORD
     *
     * @param password the value for cms_user.PASSWORD
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.TELEPHONE
     *
     * @return the value of cms_user.TELEPHONE
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.TELEPHONE
     *
     * @param telephone the value for cms_user.TELEPHONE
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.REALNAME
     *
     * @return the value of cms_user.REALNAME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.REALNAME
     *
     * @param realname the value for cms_user.REALNAME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.GENDER
     *
     * @return the value of cms_user.GENDER
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.GENDER
     *
     * @param gender the value for cms_user.GENDER
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.BIRTH
     *
     * @return the value of cms_user.BIRTH
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.BIRTH
     *
     * @param birth the value for cms_user.BIRTH
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.REGISTER_TIME
     *
     * @return the value of cms_user.REGISTER_TIME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.REGISTER_TIME
     *
     * @param registerTime the value for cms_user.REGISTER_TIME
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.STATUS
     *
     * @return the value of cms_user.STATUS
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.STATUS
     *
     * @param status the value for cms_user.STATUS
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.USER_FACE
     *
     * @return the value of cms_user.USER_FACE
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public String getUserFace() {
        return userFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.USER_FACE
     *
     * @param userFace the value for cms_user.USER_FACE
     *
     * @mbg.generated Wed Nov 13 16:46:58 CST 2019
     */
    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }
}