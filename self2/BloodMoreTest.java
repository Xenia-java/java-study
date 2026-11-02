package com.zhang.self2;

public class BloodMoreTest {
    public static void main(String[] args) {
        BloodMore r1 = new BloodMore("小乔", 100,'女');
        BloodMore r2 = new BloodMore("安琪拉", 100,'女');
        r1.show();
        r2.show();
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
