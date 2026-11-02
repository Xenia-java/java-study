package com.zhang.self2;

import java.util.Scanner;

public class CarTest {             //定义数组存储三部汽车对象，通过键盘录入把数据存入
    public static void main(String[] args) {
        Car[] arr=new Car[3];  //三个类型的车
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            Car c = new Car();   //创建车的对象，写在循环里
            System.out.println("请输入汽车类型：");
            String brand = sc.next();
            c.setBrand(brand);  //set存；c是我赋予新车的名字，给这个新车一个车牌
            System.out.println("请输入汽车价格：");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车颜色：");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;  //类型相同；把创建的新车放进数组对应一个类型车各种里
        }
        //遍历数组
        for(int i = 0;i<arr.length;i++){
            Car car =arr[i];  //相当于给一个名字方便我调用
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }
    }
}
