package com.zhang.self2;

public class BloodGameTest {
    public static void main(String[] args) {
        BloodGame r1 = new BloodGame("小乔", 100);
        BloodGame r2 = new BloodGame("安琪拉", 100);
        while (true) {
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"击败了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+"击败了"+r1.getName());
                break;
            }
        }
    }
}
