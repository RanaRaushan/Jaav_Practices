package com.day2.classandobject.day3.staticInstanceVariable;


class Dog{

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }

}

public class StaticVariables {

    public static void main(String[] args){
        Dog rex = new Dog("rex");       // create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
        rex.printName();
        fluffy.printName();

    }
}
