package Semester1.Jobsheet6;

import java.util.Scanner;

public class Selection2Exp1_07 {
    public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);

    int year;

    System.out.print("Input year: ");
    year= input07.nextInt();

    if (year % 4 == 0) {
        if (year % 100 == 0) 
            if (year % 400 == 0) 
                System.out.println("Leap year");
            } else 
                System.out.println("Not leap year");  
}
}



/*if(year%4==0){
        
        if(year%100 !=0){
            System.out.println("Leap year");
        }
    else 
    System.out.println("Not leap year");
    }*/