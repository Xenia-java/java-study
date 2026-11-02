package com.zhang.self3;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {  //用到ArrayList的JavaBean知识
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan",23); //ctrl+d向下复制一行
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
        //②
        ArrayList<Student> li = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            Scanner s = new Scanner(System.in);
            System.out.print("请输入学生姓名：");
            String name = s.next();
            System.out.print("请输入学生年龄");
            int age = s.nextInt();
            stu.setName(name);  //将变量传到对象里
            stu.setAge(age);
            li.add(stu);  //传到ArrayList里
        }
        System.out.println(li.size());
        for (int i = 0; i < list.size(); i++) { //遍历
            Student stu = li.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
