package com.zhang.self4practise;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {       //查看id是否存在，返沪ture,false
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("202601","zhangsan","123");
        Student stu2 = new Student("202602","lisi","456");
        Student stu3 = new Student("202603","wangwu","789");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("请输入id:");
            String s = sc.next();
            boolean flag = check(list, s);
            System.out.println(flag);
        }
    }
    public static boolean check(ArrayList<Student> l,String id){
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
