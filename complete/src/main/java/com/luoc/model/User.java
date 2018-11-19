package com.luoc.model;

/**
 * @author luoc
 * @date 2018/11/9 0009 17:09
 */
public class User {

    private Integer id;
    private String userName;
    private String passWord;

    private  String  UserImage;

    public String getUserImage() {
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public User() {
    }
    public User(Integer id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
