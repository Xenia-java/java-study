package com.zhang.self2;

public class GoodsTest {
    public static void main(String[] args){
        Goods[] arr = new Goods[3];  //不知道商品具体，用动态初始化
        Goods g1 = new Goods("001","华为P40",5999,100);  //快捷键ctrl+p 提示对象属性
        Goods g2 = new Goods("002","保温杯",59.9,50);
        Goods g3 = new Goods("003","口红",69,200);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //遍历数组并打印
        for(int i = 0;i < arr.length;i++){
            Goods good = arr[i];
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getCount());
        }
    }
}
