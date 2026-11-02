package com.zhang.self2;

public class BoyfriendTest {
      public static void main(String[] args){
            //第一个男朋友
            Boyfriend boy1 = new Boyfriend();
            boy1.name = "慕言";
            boy1.age = 26;
            boy1.gender = "年上男";
            boy1.height = 186;
            System.out.println(boy1.name);
            System.out.println(boy1.age);
            System.out.println(boy1.gender);
            System.out.println(boy1.height);

            boy1.action();
            boy1.job();
            System.out.println("=================");
            //第二个男朋友
            Boyfriend boy2 = new Boyfriend();
            boy2.name = "江寒";
            boy2.age = 20;
            boy2.gender = "年下男";
            boy2.height = 183.6;
            System.out.println(boy2.name);
            System.out.println(boy2.age);
            System.out.println(boy2.gender);
            System.out.println(boy2.height);

            boy2.action();
            boy2.job();
      }
}
