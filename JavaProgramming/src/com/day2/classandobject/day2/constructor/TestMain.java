package com.day2.classandobject.day2.constructor;

public class TestMain {

    public static void main(String[] args){

//        Account sjAccount = new Account("1234", "S Jaiswal", "jswl0402@gmaol.com", "(+91) 1234567890", 1000);
//
//        System.out.println(sjAccount.getCustomerName() + " with account number " + sjAccount.getNumber() );
//        sjAccount.withdraw(100);
//
//        sjAccount.deposit(50);
//        sjAccount.withdraw(100);
//
//        sjAccount.deposit(51);
//        sjAccount.withdraw(100);


        ConstructorChaining rectangle = new ConstructorChaining(10, 15, 100, 150);
        ConstructorChaining rectangle1 = new ConstructorChaining(10, 15);
        ConstructorChaining rectangle2 = new ConstructorChaining();



    }
}
