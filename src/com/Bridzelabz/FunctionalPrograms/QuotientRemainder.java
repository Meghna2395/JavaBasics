package com.Bridzelabz.FunctionalProgram;
import java.util.Scanner;
public class QuotientRemainder{

public static void main(String[] args) {

    int dividend = 25, divisor = 4;
     int x, y, t;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of X and Y");
       x = sc.nextInt();
       y = sc.nextInt();
       System.out.println("before swapping numbers: "+x +"  "+ y);

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
  
       t = x;
       x = y;
       y = t;
       System.out.println("After swapping: "+x +"   " + y);
       System.out.println();
    }

}
