package com.day2.classandobject.day2;

import com.day2.classandobject.Car;

public class TestMain {

    public static void main(String[] args){

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");

        System.out.println(porsche.getModel());


    }
}
