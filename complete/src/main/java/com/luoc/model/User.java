package com.luoc.model;

/**
 * @author luoc
 * @date 2018/11/9 0009 17:09
 */
public class User {

    private Integer id;
    private String UserName;
    private String passWord;


    public User(Integer id, String userName, String passWord) {
        this.id = id;
        UserName = userName;
        this.passWord = passWord;
    }

    public User(String userName, String passWord) {
        UserName = userName;
        this.passWord = passWord;
    }

    public User() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
