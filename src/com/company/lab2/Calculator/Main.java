package com.company.lab2.Calculator;


public class Main {
    public static void main(String[] args) {
        printMyName();

        System.out.println("Rezultatul este:" + sum(5,8));
        System.out.println("Rezultatul este:" + reduction(6,4));
        System.out.println("Rezultatul este:" + multiply(3,4));
        System.out.println("Rezultatul este:" + division(6, 2));

    }

    public static void printMyNmae() {
        System.out.println("Hallo \n Stefan");

    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static int reduction(int a, int b){
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b){
        int result = a * b;
        return result;
    }

    public static int division(int a, int b){
        int result = a / b;
        return result;
    }

    public static void printMyName(){
        System.out.println("Hallo \n Stefan");
    }


    public static void printMode1(){
        System.out.println("      J      a    v     v    a      ");
        System.out.println("      J     a a    v   v    a a     ");
        System.out.println("   J  J    aaaaa    V V    aaaaa    ");
        System.out.println("    JJ    a     a    V    a     a   ");
    }


    public static int avarageNumber(int a, int b, int c){
        int result = (a + b + c) / 3;
        return result;
    }





    public static void printMode2(){
        System.out.println("   +'''''+     ");
        System.out.println(" [ | o o | ]   ");
        System.out.println("   |  ^  |     ");
        System.out.println("   | '_' |     ");
        System.out.println("   +-----+     ");

    }




}



