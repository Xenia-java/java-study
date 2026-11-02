package com.zhang.self1;
import java.util.Objects;   //判断字符串内容是否相等，null不报错
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

class Sign{           //核对用户名和密码，最多三次
    public static void main(String[] args) {
        String name = "张三";
        String keyword = "12345678";
        Scanner n = new Scanner(System.in);
        for(int i = 0;i<3;i++) {          //ctrl+alt+T  把选中部分用循环包裹起来
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

class StringRome{       //对于小于等于长度9的纯数字字符串变成罗马数字，有0则跳过
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = s.nextLine();
            if (str.length() > 9) {
                System.out.println("超出限制，字符串长度需小于等于9");
                return;    //卫语句，推出整个方法（这里是main）
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c > '0' && c <= '9') {
                    int num = c -'0';
                    System.out.print(Rome(num));
                } else if(c =='0') {

                }else {
                    System.out.println("字符串只能存放数字");
                    break;  //或return
                }
        }
    }

    public static String Rome(int num){
        String[] arr = {"Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[num - 1];
    }
}

class StringRomeTeacher {          //教师标准版
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入字符串：");
            str = s.next();
            boolean flag = check(str);
            if (flag) {
                break;
            } else {
                System.out.println("数据有误，请重新输入");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - '0';
            sb.append(changeRome(num));
        }
        System.out.println(sb);  //自动调用toString
        /*或者String result = sb.toString;
             system.out.println(result);*/
    }

    public static boolean check(String s) {       //判断输入的字符串是否符合条件
        if(s.length() > 9){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c <'0' || c >'9'){
                return false;
            }
        }
        return true;
    }
    public static String changeRome(int num){       //替换（同时包括0变成空字符的情况）
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[num];
    }
}

class StringMoveLast{    //头移到尾，直到两字符串相等
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        boolean flag = true;
        int count = 0;
        while(flag){
            StringBuilder sb = new StringBuilder();
            for (int i = A.length()-1; i >0; i--) {
                char c = A.charAt(i);
                sb.append(c);
            }
                sb.reverse();
                sb.append(A.charAt(0));
            A = sb.toString();
            if(A.equals(B)){
                break;
            }
            count++;
            if(count > A.length()-1){
                flag = false;
            }
           }
        System.out.println(flag);
        }
    }

    class SMoveLastOne{        //同上题，用substring截取
        public static void main(String[] args) {
            String A = "abcde";
            String B = "cdeab";
            boolean flag = check(A,B);
            System.out.println(flag);
        }
        public static String rotate(String str){
                char c = str.charAt(0);
                String last = str.substring(1);
                return last + c;
        }
        public static boolean check(String A,String B){
            if(A.length() != B.length()){
                return false;
            }
            if(A.equals(B)){
                return true;
            }
            for(int count = 0;count<A.length();count++) {
                A = rotate(A);
                if(A.equals(B)){
                    return true;
                }
            }
            return false;
        }
    }

    class SMoveLastTwo{   //同上题，用数组
        public static void main(String[] args) {
            String A = "abcde";
            String B = "cdeab";
            boolean flag = check(A,B);
            System.out.println(flag);
        }
        public static String rotate(String str){
            char[] arr = str.toCharArray();   //把字符串变成数组
            char first = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = first;
            String s = new String(arr);
            return s;
        }
        public static boolean check(String A,String B){
            if(A.length() != B.length()){
                return false;
            }
            if(A.equals(B)){
                return true;
            }
            for(int count = 0;count<A.length();count++) {
                A = rotate(A);
                if(A.equals(B)){
                    return true;
                }
            }
            return false;
        }
        }