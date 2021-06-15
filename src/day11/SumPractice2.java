package day11;

import java.util.Scanner;

public class SumPractice2 {

    public static void main(String[] args) {
        //#1 - Write a program that can ask the user enter a number for five times and returns the sum of those five numbers
        int i=0;
        int n=0;
        int sum=0;
        int average;
        System.out.println("Type five number");
        for (i=0; i<5; i++){
            Scanner scnr=new Scanner(System.in);
            n=scnr.nextInt();
            sum+=n;
        }
        average=sum;
        System.out.println("Sum of numbers are : " +sum);
    }

}





