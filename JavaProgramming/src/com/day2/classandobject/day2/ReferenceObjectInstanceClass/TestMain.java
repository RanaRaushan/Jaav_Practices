package com.day2.classandobject.day2.ReferenceObjectInstanceClass;

public class TestMain {

    public static void main(String args[]){
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;
        System.out.println("anotherHouse pointing to blueHouse");
        System.out.println("blueHouse : "+ blueHouse.getColor());
        System.out.println("anotherHouse : "+anotherHouse.getColor());

        System.out.println("--------------After set blueHouse color: red-----------------");
        anotherHouse.setColor("red");
        System.out.println("blueHouse : "+ blueHouse.getColor());
        System.out.println("anotherHouse : "+anotherHouse.getColor());


        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        System.out.println("Now anotherHouse pointing to greenHouse");
        System.out.println("--------------After set greenHouse color: green-----------------");
        System.out.println("blueHouse : " + blueHouse.getColor());
        System.out.println("anotherHouse : " + anotherHouse.getColor());
        System.out.println("greenHouse : " + greenHouse.getColor());

    }
}
