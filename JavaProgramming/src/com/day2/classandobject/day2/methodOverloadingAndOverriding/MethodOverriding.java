package com.day2.classandobject.methodOverloadingAndOverriding;

public class MethodOverriding {

    public static void main(String[] args){
        Dog obj = new Dog();
        Dog obj1 = new GermanShepherd();
        obj.bark();
        obj1.bark();
    }
}

class Dog{
    public  void bark(){
        System.out.println("woof");
    }
}

class GermanShepherd extends Dog{
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}