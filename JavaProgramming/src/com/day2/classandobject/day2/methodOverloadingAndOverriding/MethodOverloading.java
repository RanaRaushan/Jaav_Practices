package com.day2.classandobject.day2.methodOverloadingAndOverriding;

public class MethodOverloading {

    public static void main(String[] args){
        int newScore = calculateScore("Rana",500);
        System.out.println("New score is "+newScore);
        System.out.println("New score is "+calculateScore(100));
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points");
        return score*1000;
    }
    private static int calculateScore(int score) {
        System.out.println("Unnamed Player " + " Scored " + score + " points");
        return score*1000;
    }
}
