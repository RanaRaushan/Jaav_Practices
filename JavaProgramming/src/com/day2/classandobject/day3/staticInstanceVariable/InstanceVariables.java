package com.day2.classandobject.day3.staticInstanceVariable;


class DogInstanceV{

    private String name;

    public DogInstanceV(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }

}

public class InstanceVariables {

    public static void main(String[] args){
        DogInstanceV rex = new DogInstanceV("rex");       // create instance (rex)
        DogInstanceV fluffy = new DogInstanceV("fluffy"); // create instance (fluffy)
        rex.printName();
        fluffy.printName();
        System.out.println("Main method");

    }
}
