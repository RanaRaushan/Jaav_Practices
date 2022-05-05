package com.day2.classandobject.day3.composition.homeChallenge;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public String getStyle() {
        return style;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public boolean isBatteries() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
