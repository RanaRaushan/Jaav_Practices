package com.day2.classandobject.day3.staticInstanceMethod;

class Dog{
    public void bark(){
        System.out.println("woof! woof!");
    }
}

public class InstanceMethod {

    public static void main(String argsp[]){
        Dog obj = new Dog();    // Create Instance
        obj.bark();             // Call Instance Method
    }

}
