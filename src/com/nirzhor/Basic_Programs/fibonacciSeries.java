package com.nirzhor.Basic_Programs;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {

        int n1,n2,n3;

        n1 =1;
        n2 =1;
        System.out.print(" Enter Range of Fibonacci : ");
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2 ; i < range ; i++){

            n3 = n1 + n2 ;
            System.out.println(n3);

            n1 = n2;
            n2 = n3;
        }
    }
}
