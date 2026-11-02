package com.zhang.self2;

public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
//快捷键alt+Ins 构造函数和get and set方法
    public User() {
    }
//创建有参构造方法，使在开辟new新空间是可以在括号内直接赋值
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //或者用插件PTG（需要连外网），右键ptg to javabean一键生成
}
