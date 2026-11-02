package com.zhang.self2;

public class Boyfriend2 {
    private String name2;
    private int age2;
    private String gender2;
    private double height2;

    public void setName(String n){
        name2 = n ;
    }
    public String getName(){
        return name2;
    }
    public void setAge(int a){
        if(a >= 18 && a <= 40){
            age2 = a;
        }else{
            System.out.println("年龄不合适");
        }
    }
    public int getAge(){
        return age2;
    }
    public void setGender(String gender2){
        this.gender2 = gender2 ;
    }  //this用法
    public String getGender(){
        return gender2;
    }
    public void setHeight(double h){
        if(h>= 178 && h<= 200){
            height2 = h;
        }else{
            System.out.println("年龄不合适");
        }
    }
    public double getHeight(){
        return height2;
    }

    public void action2(){
        System.out.println("他正在工作");
    }
    public void job2(){
        System.out.println("他是公司总裁");
    }
}
