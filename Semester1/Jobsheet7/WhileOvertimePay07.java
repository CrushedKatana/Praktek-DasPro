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
        if (position.equalsIgnoreCase("t")) {
            break; 
        }
        System.out.print ("Employee "+(i+1)+" overtime hours =");
        ovetimeHours = input.nextInt();
        i++;
        
        if(position.equalsIgnoreCase("director")){
            continue;
        }else if(position.equalsIgnoreCase("manager")){
            overtimePay= ovetimeHours*100000;
        }else if (position.equalsIgnoreCase("staff")){
            overtimePay=ovetimeHours*75000;
        }

        totalOvertimePay += overtimePay;
    }

    System.out.println("Total of Ovetime Pay ="+totalOvertimePay);
}   
}
