package com.day2.classandobject.day3.staticInstanceMethod;

/*
    Should a method be static? Does it use any field(instance variables) or instance method?
    If yes, it should be an instance method
    Else, it should be a static method
 */

class calculator{

    public static void sum(int a, int b){
        System.out.println("Sum = "+ (a+b));
    }
}

public class StaticMethod {

    public static void main(String args[]){
        /*
        Static Method are called as ClassName.MethodName(); or methodName();
        only if in the same class
         */
        calculator.sum(10,15);
        printHello("Rana");     // Shorter form of main.printHello();
    }

    public static void printHello(String name){
        System.out.println("hello, " + name);
    }
}
