package com.xyy.ec.model;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: xyy-ec-ehcache
 * @Package com.xyy.ec.model
 * @Description: TODO
 * @date Date : 2018年10月20日 19:08
 */
public class User {

    /**
     * 用户唯一识别号
     */
    private String id;
    /**
     * 用户ID号
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户存款、余额
     */
    private String balance;

//    /** 来自于哪里，默认来自于数据库 */
//    private String from = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance='" + balance + '\'' +
                '}';
    }
}
