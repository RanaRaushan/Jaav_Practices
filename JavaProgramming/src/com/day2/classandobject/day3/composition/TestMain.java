package com.day2.classandobject.day3.composition;

public class TestMain {

    public static void main(String[] args){

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(1600, 1024));

        Motherboard theMotherboard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        /*
        These are not accessible as the method are private now
         */
//        thePC.getMonitor().drawPixelArt(100,100,"red");
//        thePC.getMotherboard().loadProgram("Window 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

        /* Challenge Scenario
        Create a single room of a house using composition.
        Think about the things that should be included in the room.
        Maybe physical parts of the house but furniture as well
        Add at least one method to access an object via getting and
        then that object public method as we did in the PC class
        then add at least one method to hide the object e.g. not using a getter
        but to access the object used in composition within the main class
        like we did in the PC class
         */






    }
}

