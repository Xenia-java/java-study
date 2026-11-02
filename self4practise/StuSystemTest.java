package com.zhang.self4practise;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.Files.exists;

public class StuSystemTest {
    public static void main(String[] args) throws IOException {
        ArrayList<StuSystem> list = new ArrayList<>();
        readData(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------欢迎来到XZ学生管理系统------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出学生");
        loop:
        while (true) {
            System.out.print("请输入您的选择：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> {
                    addStudent(list);
                    saveData(list);
                }
                case "2" -> {
                    deleteStudent(list);
                    saveData(list);
                }
                case "3" -> {
                    updateStudent(list);
                    saveData(list);
                }
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出学生");
                    saveData(list);
                    break loop;    //或者System.exit(0) 停止虚拟机运行(=点右上角的差）
                }
                default -> System.out.println("输入数据有误,请重新输入");
            }
        }
    }

    //定义方法对case里要求进行操作
    //添加
    public static void addStudent(ArrayList<StuSystem> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入学生的id:");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id重复，请重新输入");
            } else {
                break;
            }
        }
        System.out.print("请输入学生的姓名:");
        String name = sc.next();
        System.out.print("请输入学生的年龄:");
        int age = sc.nextInt();
        System.out.print("请输入学生的家庭住址:");
        String address = sc.next();
        StuSystem s = new StuSystem(id, name, age, address); //或者new一个空参，再用set方法一个个传递进去
        list.add(s);
    }

    //删除
    public static void deleteStudent(ArrayList<StuSystem> list) {
        System.out.print("请输入要删除的学生的id:");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if(index >= 0){
            list.remove(index);
            System.out.println("id为"+id+"的学生信息删除成功！");
        }else{
            System.out.println("id不存在");
        }
    }

    //修改
    public static void updateStudent(ArrayList<StuSystem> list) {
        System.out.print("请输入要修改的学生的id:");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if(index == -1){
            System.out.println("该id不存在");
            return;
        }
        StuSystem s = list.get(index);
        System.out.print("请输入修改后的姓名:");
        String newName = sc.next();
        s.setName(newName);
        System.out.print("请输入修改后的年龄:");
        int newAge = sc.nextInt();
        s.setAge(newAge);
        System.out.print("请输入修改后的家庭住址:");
        String newAddress = sc.next();
        s.setAddress(newAddress);
        System.out.println("修改成功！");
    }

    //查询
    public static void queryStudent(ArrayList<StuSystem> list) {
        if (list.size() == 0) {
            System.out.println("无学生信息，请添加后再查询");
            return;  //结束方法
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            StuSystem s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    //定义方法判断Id的唯一性
    public static boolean contains(ArrayList<StuSystem> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            StuSystem s = list.get(i);
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list,id) >= 0;
    }
    public static int getIndex(ArrayList<StuSystem> list, String id){
        for (int i = 0; i < list.size(); i++) {
            StuSystem s = list.get(i);
            if(s.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    //定义存数据方法
    public static void saveData(ArrayList<StuSystem> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        for(StuSystem stu :list) {
            String line = stu.getId() + "," + stu.getName() + "," + stu.getAge() + "," + stu.getAddress();
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }

    //读出数据方法
    public static void readData(ArrayList<StuSystem> list) throws IOException {
        File file = new File("student.txt");
        if(!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line ;
        while((line = br.readLine()) != null){
            String[] parts = line.split(",");
            String id = parts[0];
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            String address = parts[3];
            StuSystem stu = new StuSystem(id,name,age,address);
            list.add(stu);
        }
        br.close();
    }
}

