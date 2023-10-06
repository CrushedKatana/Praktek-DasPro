package Semester1.Jobsheet6;

import java.util.Scanner;

public class Selection2Exp2_07 {
    public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);

    int angle1, angle2, angle3, totalAngel;

    System.out.print("input angle1: ");
    angle1= input07.nextInt();
    System.out.print("input angle2: ");
    angle2= input07.nextInt();
    System.out.print("input angle3: ");
    angle3= input07.nextInt();
    
    totalAngel=angle1+angle2+angle3;

    if(totalAngel ==180){
        if(angle1==90 || angle2==90 || angle3==90)
        System.out.println("Right triangle");
        else if (angle1 == angle2 && angle2 == angle3) 
        System.out.println("Equilateral triangle");
        else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) 
        System.out.println("Isosceles triangle");
        else 
        System.out.println("Scalene triangle");
    }else
    System.out.println("Not a triangle");

    }
}
