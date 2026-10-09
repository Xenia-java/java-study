package com.zhang.github;

import java.util.Objects;
import java.util.Scanner;

public class github1 { //第一题方法
        static void main() {
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while(flag){
                System.out.println("请输入机票价格：");
                double price = sc.nextDouble();
                System.out.println("请输入出行月份：");
                int season = sc.nextInt();   //数字+回车，读掉数字
                sc.nextLine();      //读回车并吃掉，next不吃
                System.out.println("请输入座位类型（经济舱or头等舱）：");
                String type = sc.nextLine();
                if(season>=5 && season<=10){
                    price = compute1(type,price,0.9,0.85);
                }else if((season>=11&&season<=12)||season>=1&&season<=4){
                    price = compute1(type,price,0.7,0.65);
                }else{
                    System.out.println("输入的月份有误，请重新输入");
                    continue;
                }
                if(!type.equals("头等舱")&&!type.equals("经济舱")) {
                    System.out.println("输入座位类型有误，请重新输入");
                    continue;
                }
                System.out.println("机票最终价格为："+price);
                flag = false;
            }
        }
        static double compute1(String num1,double num2,double first,double economy) {
            if(Objects.equals(num1,"头等舱")) {
                num2 *= first;
            }else if(Objects.equals(num1,"经济舱")) {
                num2 *= economy;
            }
            return num2;
        }
    }
