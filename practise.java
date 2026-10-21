package com.zhang.self1;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class practise {
}

class plane{    //第一题
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
            if(Objects.equals(type, "头等舱")){
                price*=0.9;
            }else if(Objects.equals(type, "经济舱")){
                price*=0.85;
            }else{
                System.out.println("输入座位类型有误，请重新输入");
                continue;
            }
        }else if((season>=11&&season<=12)||season>=1&&season<=4){
            if(Objects.equals(type, "头等舱")){
                price*=0.7;
            }else if(Objects.equals(type, "经济舱")){
                price*=0.65;
            }else{
                System.out.println("输入座位类型有误，请重新输入");
                continue;
            }
        }else{
            System.out.println("输入的月份有误，请重新输入");
            continue;
        }
        System.out.println("机票最终价格为："+price);
        flag = false;
     }
    }
}

class planeMethod{   //第一题方法
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

class isPrime{     //判断101~200内的质数
    static void main() {
        int count =0;
            for (int i = 101; i <= 200; i++) {
                boolean flag = true;   //写在循环里，每次都假设这个数是质数
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i + "是质数");
                    count++;
                }
            }
        System.out.println("总共有"+count+"个质数");
        }
    }

class code{           //生成五位验证码，前四位随机字母（大小写），最后一位数字
    public static void main(String[] args){
        char[] arr = new char[52];   //A65.a97
        for(int i = 0;i<=25;i++){
            arr[i] = (char)(65+i);
    }
        for(int i = 26;i<52;i++){
            arr[i] = (char)(97+i-26);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            code += arr[index];
        }
        int num = r.nextInt(10);
        System.out.println(code+num);
}
}

class Sign{
    public static void main(String[] args) {
        String name = "张三";
        String keyword = "12345678";
        Scanner n = new Scanner(System.in);
        for(int i = 0;i<3;i++) {          //ctrl+ail+T  把选中部分用循环包裹起来
            System.out.println("请输入用户名：");
            String userName = n.next();
            System.out.println("请输入密码：");
            String userKey = n.next();
            boolean na = name.equals(userName);
            boolean key = keyword.equals(userKey);
            if(na && key){
                System.out.println("登陆完成");
                break;
            }else if(na && !key){
                System.out.println("密码错误");
            }else if(!na && key){
                System.out.println("用户名错误");
            }else{
                System.out.println("用户名和密码均出现错误");
            }

            if(i == 2){
                System.out.println("次数用完，请稍后再试");
            }else{
                System.out.println("还剩"+(2-i)+"次机会");
            }
        }
    }
}

