package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] barcode = new int[12];
        int digitCount = 1;
        for (int i = 0; i < barcode.length; i++) {
            System.out.println("Enter barcode digit " + digitCount);
            barcode[i] = input.nextInt();
            digitCount++;
        }
        System.out.println(Arrays.toString(barcode));
        int everyOtherNumber = 0;
        for (int i = 1; i < barcode.length; i+= 2) {
            everyOtherNumber += barcode[i];
        }
        System.out.println("Step 2: " + everyOtherNumber);            //end of step 2

        everyOtherNumber = everyOtherNumber * 3;
        System.out.println("Step 3: " + everyOtherNumber);            //end of step 3

        int everyOtherNumber2 = 0;
        for (int i = 0; i < barcode.length; i+=2) {
            everyOtherNumber2 += barcode[i];
        }
        System.out.println("Step 4: " + everyOtherNumber2);          //end of step 4

        everyOtherNumber =  everyOtherNumber + everyOtherNumber2;
        System.out.println("Step 5: " + everyOtherNumber);           //end of step 5

        int checkDigit = 10 - (everyOtherNumber%10);
        System.out.println("Final check digit: " + checkDigit);      //end of step 6
    }
}
