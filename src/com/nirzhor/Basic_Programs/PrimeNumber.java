package com.nirzhor.Basic_Programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int i ;
        char isPrime = 'Y';

        System.out.print(" Enter number to check : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if( input == 0 || input == 1){
            System.out.println( input + " is not a prime number.");
        }
        else {

            for ( i = 2 ; i <= input/2 ; i++ ){
                if( input % i == 0){
                    System.out.println( input + " is not a prime number.");
                    isPrime = 'N';
                    break;
                }
            }

            if( isPrime == 'Y')
                System.out.println( input + " is a prime number.");

        }

    }
}
