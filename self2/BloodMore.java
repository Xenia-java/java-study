package com.zhang.self2;

import java.util.Random;

public class BloodMore {
    private String name;
    private int blood;
    private char gender;
    private String character;  //随机
    //空参构造方法
    public BloodMore(){
    }
    //有参构造方法
    public BloodMore(String name,int blood,char gender){
        this.name=name;
        this.blood=blood;
        this.gender = gender;
        setCharacter(gender);
    }
//性格描述
    String[] boy= {"温文尔雅","气宇轩昂","相貌英俊","武力高强","五官端正"};
    String[] girl= {"温柔大方","呆萌可爱","气势十足","权势滔天","亭亭玉立"};
//攻击描述
    String[] attacks_desc={
            "%s使用了一技能，击飞%s。",
        "%s使用了二技能，对%s造成眩晕。",
        "%s使用了大招，对%s造成高额伤害。"
};
//受伤描述
    String[] injures_desc={
            "%s走位，躲避了该技能",
        "给%s造成少许伤害",
        "%s受到伤害，继续使用技能",
        "%s被击中到残血状态"
};
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(char gender) {
        Random r = new Random();
        if(gender == '女'){
            int index = r.nextInt(girl.length);
            this.character = girl[index];
        }else if(gender == '男'){
            int index = r.nextInt(boy.length);
            this.character = boy[index];
        }else{
            this.character = "平平无奇";
        }
    }

    public void show(){
        System.out.println("姓名为："+getName());
        System.out.println("性别为："+getGender());
        System.out.println("血量为："+getBlood());
        System.out.println("性格为："+getCharacter());
        System.out.println("==========================READY!");
    }

    //定义一个方法，用于发生攻击
    public void attack(BloodMore role) {
        //定义造成伤害的血量，1~20随机数
        Random r = new Random();
        //随机生成攻击和受击状态
        int index = r.nextInt(attacks_desc.length);
        String Kunfu = attacks_desc[index];
        System.out.printf(Kunfu, this.getName(), role.getName());
        System.out.println();
        //随机受到伤害点数，计算剩余血量
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        //根据血量多少判断进入哪一个受击状态
        if (remainBlood > 75) {
            System.out.printf(injures_desc[0], role.getName());
        } else if (remainBlood > 50) {
            System.out.printf(injures_desc[1], role.getName());
        } else if (remainBlood > 25) {
            System.out.printf(injures_desc[2], role.getName());
        } else {
            System.out.printf(injures_desc[3], role.getName());
        }
        System.out.println();
    }
}
