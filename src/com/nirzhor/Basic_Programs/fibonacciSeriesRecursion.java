package com.nirzhor.Basic_Programs;

import java.util.Scanner;

public class fibonacciSeriesRecursion {

    public static void main(String[] args) {

        int value = 0;

        System.out.print(" Enter Range of Fibonacci : ");
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        for( int i =1 ; i <= range ; i++){
            // Call function
            value = fibbo(i);
            System.out.println(value);
        }

    }

    static int fibbo(int position){

         if( position == 1 || position == 2){
             return 1;
         }

         else {
             return fibbo(position - 1 ) + fibbo(position - 2 );
         }
    }

}
