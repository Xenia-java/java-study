package com.zhang.self2;

public class Student {
    private String name;
    private int age;
//空参构造方法
    public Student(){
        System.out.println("没有写构造方法则虚拟机自动加空参构造方法");
    }
    //构造方法，能在定义里直接传递参数
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
