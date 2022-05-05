package com.day2.classandobject.day3.composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelArt(int x, int y, String color){
        System.out.println("Drawing Pixel at " + x + "," + y + " and color " + color);
    }
}
