package Semester1.Jobsheet7;

import java.util.Scanner;

public class WhileOvertimePay07 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int numEmployee, ovetimeHours;
     double overtimePay=0, totalOvertimePay=0;
     String position;

     System.out.print("Employee number = ");
     numEmployee = input.nextInt();

     int i=0;
     while(i<numEmployee){
        System.out.print("Position of employee "+(i+1)+" (director, manager, staff) = ");
        position = input.next();
        System.out.print ("Employee "+(i+1)+" overtime hours =");
        ovetimeHours = input.nextInt();
        i++;
        
        if


    }
}   
}
