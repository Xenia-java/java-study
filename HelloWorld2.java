package com.zhang.self1;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class HelloWorld2 {
    //println打印完自动换行
}

class game{      //猜测系统随机生成的1~100的一个数字
    public static void main(String[] args) {
        Random r = new Random();
        int know = r.nextInt(100)+1;
        System.out.println("已生成1~100任意一个随机数，请猜测：");
        Scanner sc = new Scanner(System.in);
        while(true){
        int putin = sc.nextInt();
        if(know > putin){
            System.out.println("猜小了");
        }else if(know  < putin){
            System.out.println("猜大了");
        }else{
                System.out.println("猜对了");
                break;
            }
    }
}
}

class arrayAdd{    //1~100随机取10个录入数组，取平均值，求比平均值小的元素个数
    public static void main(String[] args){
        Random r = new Random();
        int[] arr = new int[10];
        System.out.println("系统随机生成的数组为：");
        int i =0;
        for (i = 0; i < arr.length; i++) {
            int sys = r.nextInt(100) + 1;
            arr[i] = sys;
            System.out.print(arr[i]+" ");
        }
        System.out.println();         //强制换行
        int sum = 0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            sum+=arr[i1];
        }
        double average = (double)sum/arr.length;      //强转
        System.out.println("该数组平均值为:"+average);
        int count = 0;
        for (int i2 = 0; i2 < arr.length; i2++) {
            if(arr[i2]<average){
                count++;
            }
        }
        System.out.println("比平均值小的元素个数有"+count+"个");
    }
}

class change{       //将数组里的元素倒过来输出
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

class mess{         //打乱数组内元素
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int move = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[move];      //move是下标
            arr[move]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");     //此处打印语句要与上面的循环分开写
        }
    }
}

class method{        //学习了定义方法，此处为计算举例
    public static void main(String[] args) {
        getSum(10,30);    //方法的调用
    }    //此处为实参
   //方法的定义
    public static void getSum(int num1,int num2){
        int result = num1+num2;  //定义了形参
        System.out.println(result);
    }    //形参和实参必须一一对应
}

class arrMethod{                //利用方法对数组进行遍历
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        arrCopy(arr);  //调用方法
        int result = arrMax(arr);    //返回值调用
        System.out.println("该数组最大值为"+result);
        boolean exit = exitNum(arr,12);   //布尔类型
        System.out.println(exit);
    }
    public static void arrCopy(int[] arr){       //遍历数组并打印一行
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) {
                System.out.print(arr[i]); //打印最后一个元素的时候不打印逗号
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
    public static int arrMax(int[] arr){      //方法：求数组中元素最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;    //返回值与类型相关联
    }
    public static boolean exitNum(int[] arr,int number){     //判断该数（number,自己随便给的数，让他判断)是否存在与数组中
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;    //返回后直接退出整个方法
            }
        }
        return false;  //全遍历完再返回错误
    }
}

class bring{                //把数组按索引取出元素放入新数组
    public static void main(String[] args) {
        int[] arr = {1,23,45,8,9,34,87,36,70,13};
        int[] newArr = copyOfRange(arr,3,7);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }

    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] next = new int[to-from];
        for (int i = from,j=0; i < to; i++,j++) {
            next[j] = arr[i];
        }
        return next;
    }
}

class op{    //占位符
    public static void main(String[] args) {
        System.out.printf("%s击败了%s","小乔","安琪拉");  //souf
        System.out.println();
        System.out.printf("你好%s","Xenia");   //不会换行
    }
}

class StringDemo{          //对于不同定义方法中地址的理解
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("判断定义变量和对象地址是否一致：");
        System.out.println(s1 == s2); //地址
        boolean result1 = s1.equals(s2);  //判断是否完全相同
        System.out.println("判断s1和s2的内容是否一致：");
        System.out.println(result1);
        System.out.println("请输入字符串：");
        Scanner c = new Scanner(System.in);
        String s3 = c.next();  //手动输入abc
        System.out.println("判断手动输入的字符串和定义变量的地址是否一致：");
        System.out.println(s1 == s3);  //地址
        String s4 = "Abc";
        boolean result2 = s1.equalsIgnoreCase(s4);  //判断内容是否相同（不区分大小写）
        System.out.println("不区分大小写的判断：");
        System.out.println(result2);
    }
}

class StringIndex{            //输入字符串遍历打印
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);         //遍历字符串
            System.out.println(c);
        }
    }
}

class StringCount{     //输入一个字符串判断大写小写字母和数字的个数
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = s.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            }else if(c >= 'A' && c<= 'Z'){
                bigCount++;
            }else if(c >= '0' && c<= '9'){
                numCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("大写字母个数有："+bigCount);
        System.out.println("小写字母个数有："+smallCount);
        System.out.println("数字个数有："+numCount);
        System.out.println("其他字符个数有："+otherCount);
    }
}

class ArrString{      //用方法将数组转化为字符串并按格式打印
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        String r = ASMethod(arr);
        System.out.println(r);
    }
    public static String ASMethod(int[] arr){
        if(arr == null){
            return "";    //用return时整个方法都会结束 卫语句Guard Clauses
        }
        if(arr.length == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i < arr.length - 1){
                result += ", ";
            }else{
                result += "]";
            }
        }
        return result;
    }
}

class StringMoney{     //阿拉伯数字=>转换成大写=>前面补零=>插入单位 => 《做发票》
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money;   //外部定义，方便后续使用
        while (true) {
            System.out.println("请输入金额：");
            money = s.nextInt();
            if(money >= 0 && money <= 9999999){    //安全范围
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";   //接受转化后的大写数字
        while(true){
            int ge = money % 10;
            String str = GetCapital(ge);  //单个数字用方法变成大写
            money = money / 10;
            moneyStr = str + moneyStr;   //拼接成完整的
            if(money == 0){     //推出，变零之后不必执行循环
                break;
            }
        }
        int count = 7-moneyStr.length();   //在前面补零
        for (int i = 0; i <count; i++) {
            moneyStr = '零' + moneyStr;
        }
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c= moneyStr.charAt(i);
            System.out.print(c);
            System.out.print(arr[i]);
            /*或者用拼接，先在for外定义String result = "";
           然后for循环里把最后两行替换为result = result + c + arr[i];*/
        }
    }
    public static String GetCapital(int num){       //定义方法将数字作为索引返回对应大写数字
        String[] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[num];
    }
}

class StringSub{       //根据身份证号码截取关键信息 + 替换
    public static void main(String[] args) {
        String id = "210463200211068342";
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("个人信息：");
        System.out.println("出生日期："+year+"年"+month+"月"+day+"日");
        char gender = id.charAt(16);  //String gender = id.substring(16,17);  (但是以下代码不能用这个）方法Integer.parseInt()
        //char a = '0';
        //System.out.println(a+0);  ASCII 0 = 48
        System.out.print("性别为：");
        int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("女");
        }else{
            System.out.println("男");
        }
        //②
        System.out.println("======================");
        String phone = "17266238804";
        String result = phone.replace("6623","****");
        System.out.println(result);

        String chat = "美女你好，聊一聊，你长得好美啊，加个微信吧";
        String[] arr ={"加个微信","加个QQ","联系方式","聊一聊"};  //定义敏感词汇
        for (int i = 0; i < arr.length; i++) {
            chat = chat.replace(arr[i],"***");
        }
        System.out.println(chat);
        //StringBuilder
        System.out.println("======================");
        StringBuilder sb = new StringBuilder("abc");
        int len = sb.length();   //获取长度
        System.out.println(len);
        sb.append(2.3);
        sb.append(true);
        sb.append("哈哈");   //添加元素
        System.out.println(sb);
        sb.reverse();    //反转
        System.out.println(sb);
        String str = sb.toString();  //变成字符串，后续可用字符串方法
        System.out.println("变成字符串："+str);
    }
}

class StringMore{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = s.nextLine();
        String result  = new StringBuilder().append(str).reverse().toString();  //链式
        if(str.equals(result)){    //判断字符串相等
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}

class StringJoin{
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");  //分隔符，首，尾
        sj.add("aaa").add("bbb").add("ccc");    //向后添加用add
        int len = sj.length();  //算的是加上添加符号后的总长度
        System.out.println(len);
        System.out.println(sj);
        String str = sj.toString();
        System.out.println(str);
    }
}