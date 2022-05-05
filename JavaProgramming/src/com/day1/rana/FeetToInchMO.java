package com.day1.rana;

public class FeetToInchMO {

    public static void main(String[] args){
//        double result = calcFeetAndInchesToCentimeter(6,10);
        double result = calcFeetAndInchesToCentimeter(156);
        if (result > 0)
            System.out.println(result);
        else
            System.out.println("Invalid Parameters");
    }

    private static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if ((feet < 0) || (inches<0 || inches >12)){
            System.out.println("Invalid feet or inches Parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    private static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0)
            return  -1;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(feet+""+remainingInches+""+inches);
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }

}
