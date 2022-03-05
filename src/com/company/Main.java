package com.company;

import java.util.Scanner;

public class Main {

    public static int addition(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int substraction(int num1,int num2){
        int sub = num1 - num2;
        return sub;
    }

    public static int multiply(int num1,int num2){
        int mul = num1 * num2;
        return mul;
    }

    public static int divide(int num1,int num2){
        int dev = num1 / num2;
        return dev;
    }

    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("What do you want to do ?");
        System.out.println();
        System.out.println("Press number 1 for addition");
        System.out.println("Press number 1 for subtraction");
        System.out.println("Press number 1 for multiplication");
        System.out.println("Press number 1 for division");
        System.out.println();

        System.out.print("Enter your option......");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        System.out.println();
        System.out.print("Enter the first number:");
        int number1 = input.nextInt();
        System.out.print("Enter the second number:");
        int number2 = input.nextInt();
        System.out.println();

        if(option==1){
            System.out.println("Answer is :"+addition(number1,number2));
        }
        else if(option==2){
            System.out.println("Answer is :"+substraction(number1,number2));
        }
        else if(option==3){
            System.out.println("Answer is :"+multiply(number1,number2));
        }
        else if(option==4){
            System.out.println("Answer is :"+divide(number1,number2));
        }
        else{
            System.out.println("Invalid...");
        }





    }
}
