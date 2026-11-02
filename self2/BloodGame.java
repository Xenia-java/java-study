package com.zhang.self2;
import java.util.Random;

public class BloodGame {
    private String name;
    private int blood;
    //空参构造方法
    public BloodGame(){
    }
    //有参构造方法
    public BloodGame(String name,int blood){
        this.name=name;
        this.blood=blood;
    }
//方法，封装
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return blood;
    }
    //定义一个方法，用于发生攻击
    public void attack(BloodGame role){
        //定义造成伤害的血量，1~20随机数
        Random r = new Random();
        int hurt =r.nextInt(20)+1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName()+"攻击了"+role.getName()+"并造成"+hurt+"点伤害," +
                role.getName()+"还剩"+remainBlood+"血量");
    }
}
