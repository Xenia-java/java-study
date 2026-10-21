package com.zhang.self1;
import java.util.Random; //235行导包
import java.util.Scanner;

public class HelloWorld {    //快捷输入
    public static void main(String[] args) {  //psvm

        System.out.println("HelloWorld");         //sout

        for (int i = 0; i < 100; i++) {   //100.fori

        }

        int[] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {     //数组名.fori

        }

        String s = new String("123");
        for (int i = 0; i < s.length(); i++) {     //字符串名.length().fori
            
        }
        for (int length = s.length(); length > 0; length--) {   //字符串名.length().forr => 倒着遍历
            // shift+F6 批量修改
        }
    }
    }


class plan{   //switch循环，输入周几输出计划
    public static void main(String[] args){
        System.out.println("请输入周几：");
        Scanner sc = new Scanner(System.in);
        String week = sc.nextLine().trim();
        switch (week){
            case"周一":
                System.out.println("跑步");
                break;
            case"周二":
                System.out.println("游泳");
                break;
            case"周三":
                System.out.println("慢走");
                break;
            case"周四":
                System.out.println("动感单车");
                break;
            case"周五":
                System.out.println("拳击");
                break;
            default:
                System.out.println("周末不进行活动");
                break;
        }
    }
}

class even{        //计算1~100偶数之和
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}

class putrange{    //键盘录入两个数字，计算在这个范围内既能被3整除又能被5整除的数字个数
    static void main() {
        System.out.println("请输入两个整数表示范围：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int start=num1,end=num2;
        if(num1>num2){
            start = num2;
            end = num1;
        }
        int s = 0;
        for(int i = start;i>=start&&i<=end;i++){
            if(i%3==0&&i%5==0){
                s+=1;
            }
        }
        System.out.println(s);
    }
}

class whilecycle{     //打印1~100
    static void main() {
        int i = 1;
        while(i <=100) {
            System.out.println(i);
            i++;
        }
    }
}

class hill{      //将纸折叠到山峰高的次数
    static void main() {
        double paper =0.1;
        int count = 0;
        while(paper<=8844430){
            count++;
            paper*=2;
        }
        System.out.println(count);
    }
}

class huiwen{      //判断是否为回文数
    static void main() {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = 0;
        int temp1 = num;
        int temp = 0;
        while(num != 0) {
            ge = num % 10;
            num /= 10;
            temp = temp * 10 + ge;
        }
        if(temp1==temp){
            System.out.println(temp1+"为回文数");
        }else{
            System.out.println("该数字不是回文数");
        }
    }
}

class devide{      //给定被除数和除数，不用*/%计算出商和余数
    static void main() {
        System.out.println("请输入被除数:");
        Scanner sc = new Scanner(System.in);
        int devidend = sc.nextInt();
        System.out.println("请输入除数:");
        int devided = sc.nextInt();
        int count = 0;
        while(devidend>=devided){
            devidend-=devided;
            count++;
        }
        System.out.println("商为："+count);
        System.out.println("余数为："+devidend);
    }
}

class seven{     //1~100遇到7或7的倍数就过
    static void main() {
        for(int i = 1;i<=100;i++){
            if(i%10==7 || i/10%10==7 || i%7==0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}

class square1{       //计算数字平方根 自己编写
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数求其平方根：");
        int num = sc.nextInt();
        if(num>=0){
            int i = 0;
            for(i=0;num>=i*i;i++) {
                if (num < (i+1) *(i+1)) {
                    break;
                }
            }
            System.out.println(i);
        }else{
            System.out.println("打印数据无法计算平方根");
        }
    }
}

class square2 {       //计算数字平方根 Teacher版
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数求其平方根：");
        int num = sc.nextInt();
        for (int i = 0;i<=num ; i++) {
            if (num == i * i) {
                System.out.println(i);
                break;
            }else if (num < i * i) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}

class square3{       //计算数字平方根 精简版
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数求其平方根：");
        int num = sc.nextInt();
        int i =0;
        while(num>=i*i){
            i++;
        }
        System.out.println(i-1);
    }
}

class prime1{     //输入一个数判断是否为质数 个人编写
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数判断是否为质数：");
        int prime = sc.nextInt();
        int i = 2;
        for(i = 2;i<prime;i++){
            if(prime%i == 0){
                System.out.println(prime+"不是质数");
                break;
            }
        }
        if(i == prime) {
            System.out.println(prime + "是质数");
        }
    }
}

class prime2{       //判断质数 Teacher版，添加标签版
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数判断是否为质数：");
        int prime = sc.nextInt();
        int i = 2;
        boolean flag = true;
        for(i = 2;i<prime;i++){   //此处限制条件可以小于等于平方根，后续再学
            if(prime%i == 0){
                flag = false;
                break;
            }
            }
        if (flag){
            System.out.println(prime+"是一个质数");
        }else{
            System.out.println(prime+"不是一个质数");
        }
        }
}

class Ram{       //生成随机数知识点
    static void main() {
        Random r = new Random();   //随机数 需要导包，在最上面
        int out = r.nextInt(5);  //从0~4,包左不包右
        System.out.println(out);
        int move = r.nextInt(7)+4;      //4~10    bound=末-首+1，最后+首
        System.out.println(move);
    }
}

class newarr{                 //定义数组计算3的倍数有几个
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            int num = arr[i];
            if(num%3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

class comput{              //数组里偶数/2，奇数*2
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                arr[i]/=2;
            }else{
                arr[i]*=2;
            }
            System.out.println(arr[i]);  //尽量写进新的循环，建议一个循环只干一件事
        }
    }
}