package com.zhang.self2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("华为",7999,"紫色");
        Phone p2 = new Phone("小米",3999,"粉色");
        Phone p3 = new Phone("苹果",12999,"白色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        int avg = sum / arr.length;   //小数点被直接砍掉
        System.out.println(avg);
    }
}
