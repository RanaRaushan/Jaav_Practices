package com.day1.rana;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted =5;
        int bonus = 100;

        calculateScore(true,5,800,100);
        calculateScore(true,8,10000,200);

    }

    public  static void calculateScore(boolean gameOver, int levelCompleted, int score, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 2000;
            System.out.println("Your final score was "+ finalScore);
        }
    }
}
