package com.zhang.self2;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Jason",25); //有参构造形式  这个s就是对象，student类
        System.out.println(s.getName());
        System.out.println(s.getAge());
        Student m = new Student(); //调用无参构造    这个m就是对象
        //带参和无参在一起属于重载
    }
}
