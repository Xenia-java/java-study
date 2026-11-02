package com.zhang.self2;

public class BoyfriendTest2 {
    public static void main(String[] args){
        //第一个男朋友
        Boyfriend2 boy1 = new Boyfriend2();
        boy1.setName("Jason") ;
        boy1.setAge(26);
        boy1.setGender("年上男");
        boy1.setHeight(187.7);
        System.out.println(boy1.getName());
        System.out.println(boy1.getAge());
        System.out.println(boy1.getGender());
        System.out.println(boy1.getHeight());

        boy1.action2();
        boy1.job2();
        System.out.println("======================");
        //第二个男朋友
        Boyfriend2 boy2 = new Boyfriend2();
        boy2.setName("Tomas") ;
        boy2.setAge(20);
        boy2.setGender("年下男");
        boy2.setHeight(184.2);
        System.out.println(boy2.getName());
        System.out.println(boy2.getAge());
        System.out.println(boy2.getGender());
        System.out.println(boy2.getHeight());

        boy2.action2();
        boy2.job2();
    }
}
