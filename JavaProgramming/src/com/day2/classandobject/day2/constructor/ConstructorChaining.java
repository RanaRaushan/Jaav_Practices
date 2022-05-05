package com.day2.classandobject.day2.constructor;

public class ConstructorChaining {
    //Let take an example of Rectangle for Constructor Chaining

    private int x;
    private int y;
    private int height;
    private int width;

    public ConstructorChaining() {
        this(0, 0);
        System.out.println("No Parameter Constructor called");
    }

    public ConstructorChaining(int width, int height) {
        this(0, 0, width, height);
        System.out.println("Parameter with 2 , Constructor called");
    }

    public ConstructorChaining(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        System.out.println("Parameter with 4 , Constructor called");
        System.out.println(x);
        System.out.println(y);
        System.out.println(height);
        System.out.println(width);

    }

}
