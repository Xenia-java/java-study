package com.zhang.self2;

public class MateTest {
    public static void main(String[] args) {
        Mate[] arr = new Mate[4];
        Mate m1 = new Mate("zhang",20,'女',"摄影");
        Mate m2 = new Mate("li",21,'女',"绘画");
        Mate m3 = new Mate("wang",22,'女',"弹钢琴");
        Mate m4 = new Mate("wu",25,'女',"健身");
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        arr[3] = m4;
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            Mate mate =arr[i];
            sum +=mate.getAge();
        }
        int avg = sum / arr.length;
        System.out.println("几个朋友平均年龄为："+avg);
        for (int i = 0; i < arr.length; i++) {
            Mate mate = arr[i];
            if(mate.getAge() < avg){
                count++;
            }
        }
        System.out.println("一共有"+count+"个同伴小于平均年龄");
        for (int i = 0; i < arr.length; i++) {
            Mate mate = arr[i];
            if(mate.getAge() < avg){
                System.out.println(mate.getName()+","+mate.getAge()+","+mate.getGender()+","+mate.getHobby());
            }
        }

    }
}
