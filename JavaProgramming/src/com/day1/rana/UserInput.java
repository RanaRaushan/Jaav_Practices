package com.day1.rana;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Year of Birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); //Handle  next line character (Enter Key)
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        int age = 2021 - yearOfBirth;
        System.out.println("Your name is: "+name + " and you are "+ age + " old");

        scanner.close();
    }
}
