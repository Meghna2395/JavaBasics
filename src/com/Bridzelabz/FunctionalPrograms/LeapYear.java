package com.Bridzelabz.FunctionalPrograms;
import java.util.Scanner;
public class LeapYear{

    public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the  Year to check if it's leap year or not");
        int year = scanner.nextInt();
         if(year%4==0){
            System.out.println("Given year is leap year");
         }
         else{
         System.out.println("Given year is not a leap year");
        }
    }
}

