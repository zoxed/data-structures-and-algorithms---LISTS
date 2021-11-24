package com.exercises;

public class App2 {
    public static void main(String[] args) {
//
//            Bank BobAccount = new Bank();
//        //445,545.655, "Mohamed kaabi","simon.kaabi@gmail.com","+212 6 14 82 90 08");
//            BobAccount.withdraw(1223);
//            BobAccount.deposit(1224);
//
//            Bank kaabiAccount = new Bank("kaabi","kaabi@gmail.com","0614829008");
//            System.out.println(kaabiAccount.getAccountNumber() + " name " + kaabiAccount.getCustomerName() + " number " + kaabiAccount.getPhoneNumber() + " balance :" + kaabiAccount.getBalance());
//
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("mohamed",658);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("reda","reda@gmail",8868);
        System.out.println(person3.getName());



    }
}
