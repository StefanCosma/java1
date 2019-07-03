package com.company.lab5.Calculator;
public class main {

    //Tema 13, ex 2
    public int[] getArrayToHundred() {
        int[] myArray = new int[100];

        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }


    public int[] getEvenArray() {
        int[] myArray = new int[51];
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[count] = i;
                count++;
            }
        }
        return myArray;
    }


    public float getAverageArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return (sum / myArray.length);

    }


    public void checkIfNumberInArray(int[] myArray, int x) {
        boolean check = false;
        for (int i = 0; i < myArray.length; i++) {
            if (x == myArray[i]) {
                check = true;
            }
            System.out.println(check);
        }


        public int checkIfNumberInArrayIndex (int[] myArray, int x){
            int a = -1;
            for (int i = 0; i < myArray.length; i++)
                if (x == myArray[i]) {
                    a = i;
                    break;

                }

            return a;
        }


        public void showCharactersArray() {
            char[] myArray = {'-', '-', '-', '-', '-', '-', '-'};
            for (int i = 0; i < 6; i++) {
                System.out.println();

                for (int j = 0; j < myArray.length; j++) {
                    System.out.print(myArray[j] + " ");
                }
            }
        }


    }
}



















