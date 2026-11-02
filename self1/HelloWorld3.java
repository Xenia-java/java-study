package com.zhang.self1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld3 {  //ArrayList开始，list,file,stream
}
class Array{   //增删改查
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  //只能用引用数据类型，打印出[]包裹数据  <泛型>
        //添加
        list.add("aaa");  //不需要返回，无论如何都会添加成功返回true
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);  //[aaa,aaa,bbb,ccc]
        //删除
        list.remove("aaa");  //删除成功则返回true,元素不存在删除失败返回false
        System.out.println(list);  //[aaa,bbb,ccc]
        String b = list.remove(2);  //索引删除
        System.out.println(list);  //[aaa,bbb]
        System.out.println(b);  //返回的是被删除的元素
        //修改
        String a = list.set(0,"ddd");
        System.out.println(list); //[ddd,bbb]
        System.out.println(a); //返回被覆盖的元素
        //查询
        String check = list.get(1);
        System.out.println(check);
        System.out.println("=============");
        //遍历，长度size()
        for (int i = 0; i < list.size(); i++) {    //list.fori
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println(list.size());  //长度
    }
}

class pack{    //int->Integer,char->Character,......
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();  //包装
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() -1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
// windows:\反斜线    Linus:/正斜线
class FileDemo1{      //File对象表示路径，绝对路径带盘符，相对路径为该项目下
    public static void main(String[] args) {
        //第一种构造
        String str = "E:\\selfstudy\\idea\\a.txt";  //父级路径E:\selfstudy\idea，子级路径a.txt
        File f1 = new File(str);
        System.out.println(f1);  //E:\selfstudy\idea\a.txt
        //第二种构造
        String parent ="E:\\selfstudy\\idea";
        String child = "a.txt";
        File f2 = new File(parent,child);
        //
        System.out.println(f2);  //E:\selfstudy\idea\a.txt
        File f3 = new File(parent+"\\"+child);//自己拼接
        System.out.println(f3);
        //第三种构造
        File parent2 = new File("E:\\selfstudy\\idea");
        String child2 ="a.txt";
        File f4 = new File(parent2,child2);
        System.out.println(f4);
        System.out.println("============================================");
        //判断
        File f5 = new File("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\第1章 习题.pdf");
        System.out.println(f5.isDirectory());//文件夹返回true，文件返回false
        System.out.println(f5.isFile());  //判断是否为文件
        System.out.println(f5.exists()); //判断是是否存在
        //获取
        long len = f5.length();//只能获取文件的字节，如果要换大单位，可以除以1024
        System.out.println(len);//143246
        System.out.println(f5.getAbsolutePath());//获取绝对路径
        System.out.println(f5.getPath());//定义文件时写的路径（写啥打啥）
        System.out.println(f5.getName());//文件->返回“文件名.扩展名”，文件夹->返回最后一个文件夹
        System.out.println(f5.lastModified());//返回文件最后修改时间（毫秒值）
    }
}
class FileDemo2{
    public static void main(String[] args) throws IOException {
        //创建和删除
        //创建文件
        File f1 = new File("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\a.txt");
        boolean a = f1.createNewFile();//不存在true,已存在false,父级路径不存在false。如果不写后缀，那创建的文件也不带后缀
        System.out.println(a);
        //创建单级文件夹
        File f2 = new File("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\a");
        boolean a1 = f2.mkdir();
        System.out.println(a1); //路径唯一性
        //创建多级文件夹
        File f3 = new File("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\aa\\bb");
        boolean a2 = f3.mkdirs();  //多级+单级
        System.out.println(a2);
        //删除 .delete()
        //删除文件和空文件夹，不走回收站 ；对有内容的文件夹删除失败
        //....
        //获取路径下所有内容（显示路径）listFiles方法
        File f4 = new File("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy");
        File[] files = f4.listFiles();  //把返回内容放到数组里
        for(File file : files){  //for强化，（类型 命名）， 括号里的file是新命名
            System.out.println(file);
        }
    }
}

class ByteStreamDemo1{    //FileOutputStream相关基础知识
    public static void main(String[] args) throws IOException {
        //若文件存在，则会清空原有内容        参数是字符串表示的路径或者File对象都可以
        FileOutputStream fos = new FileOutputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\a.txt");
        fos.write(97); //一次写一个字节数据，文件里显示的是ASCII对应的字符
        fos.close(); //释放资源，不释放则代码一直占用
        //父级路径存在，子级路径不存在则创建
        FileOutputStream fos1 = new FileOutputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\b.txt");
        byte[] bytes = {97,98,99,100,101};  //建立字节数组
        fos1.write(bytes);
        fos1.close();   //abcde
        FileOutputStream fos2 = new FileOutputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\bb.txt");
        fos2.write(bytes,1,2); //1索引，2个字节长度   bc
        fos2.close();
        //打开续写开关，运行几次在下面那写几次，默认为false
        FileOutputStream fos3 = new FileOutputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\bbb.txt",true);
        String str = "ilovestudyjava";
        byte[] bytes1 = str.getBytes();  //把字符串拆成字节，返回字节数组
        fos3.write(bytes1);
        String wrap = "\r\n";  //换行
        byte[] byte2 = wrap.getBytes();
        fos3.write(byte2);
        String str2 = "doyoulikeit";
        byte[] bytes3 = str2.getBytes();
        fos3.write(bytes3);
        fos3.close();
    }
}

class ByteStreamDemo2{   //FileInputStream相关知识
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\b.txt");
        int a = fis1.read();
        System.out.println((char)a);  //读出来的是ASCII值，可强转
        //文件读到末尾再调用read会返回-1
        //循环打印
        int b;
        while((b = fis1.read()) != -1){
            System.out.print((char)b);  //已经读过的就不再读了
        }
        fis1.close();
        //（小）文件拷贝
        long start = System.currentTimeMillis();
        FileInputStream fis2 = new FileInputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\desktop.mp4");
        FileOutputStream fos2 = new FileOutputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\a\\copydesktop.mp4");
        int c;
        while((c = fis2.read()) != -1){
            fos2.write(c);
        }
        fos2.close();
        fis2.close();  //先写的后关闭
        long end = System.currentTimeMillis(); //
        System.out.println(end-start);  //181ms
    }
}

class ByteStreamDemo3{         //建立字符数组读入文件
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\b.txt");
        byte[] bytes = new byte[2];  //先给一个字符数组，读到满容量或数据读完
        int len = fis1.read(bytes);  //len下面转字符串时会用到
        System.out.println(len);
        String str = new String(bytes,0,len);  //读到最后一个就停止，使读入显示形式标准
        System.out.println(str);
        fis1.close();
    }
}

class ByteStreamDemo4{       //用字节流拷贝大文件
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();  //计算拷贝时间
        FileInputStream fis1 = new FileInputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\pythonlove.mp4");
        byte[] bytes = new byte[1024*1024*5];
        int len;
        FileOutputStream fos1 = new FileOutputStream("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\a\\copypythonlove.mp4");
        while((len = fis1.read(bytes)) != -1){  //byte类型的数组
            fos1.write(bytes,0,len);
        }
        fos1.close();
        fis1.close();
        long end = System.currentTimeMillis(); //
        System.out.println(end-start); //5ms
    }
}

class UTFGBK{
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str = "abc一二三";
        byte[] byte1 = str.getBytes();  //idea默认用UTF-8 (1+1+1+3+3+3)    //ctrl+alt+V自动生成左边
        System.out.println(Arrays.toString(byte1));
        byte[] byte2 = str.getBytes("GBK");  //(1+1+1+2+2+2)
        System.out.println(Arrays.toString(byte2));
        //解码
        String new1 = new String(byte1);  //默认UTF-8
        System.out.println(new1);
        String new2 = new String(byte2,"GBK");  //编码解码方式不同会出现乱码
        System.out.println(new2);
    }
}

class CharStreamDemo1{         //FileReader读取（读到代码里），read方法，文字
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\CharStream1.txt");
                                                                                //可已用字符串或者对象new File("")
        int ch;
        while((ch = fr.read()) != -1){  //空参的read方法
            System.out.print((char)ch);
        }
        fr.close();
        System.out.println();
        //带参    文件关闭后再读取要重新创建一个新对象
        FileReader fr1 = new FileReader("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\CharStream1.txt");
        char[] chars = new char[100];
        int len;
        while((len = fr1.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();


        //write   （使用了续写）   规则和FileOutputStream一致
        FileWriter fw = new FileWriter("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\CharStream1.txt",true);
        String str = new String("\n第一次写入");
        fw.write(str);
        fw.close();
    }
}

class BufferedStreamDemo1{   //字符缓冲（输入/输出）流
    public static void main(String[] args) throws IOException {
        //输入对象(在代码里显示)
        BufferedReader br = new BufferedReader(new FileReader("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\CharStream1.txt"));
        String line = br.readLine();  //读一行，不会读回车换行
        System.out.println(line);    //可以合并，但在while循环里需要用到line
//       /*读取文件所有内容
//       String line;
//       while((line = br.read()) != null){
//           System.out.printlin(line);
//        }*/
        br.close();  //只需要关缓冲流，它里面会把基本流也关闭

        //输出对象（写进文件里，不存在时会创建）
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\HuaweiMoveData\\Users\\张萌萌\\Desktop\\javaStudy\\CharStream1.txt"));
        bw.write("加油");
        bw.newLine();  //跨平台换行法，bw专属
        bw.write("666");
        bw.close();
    }
}