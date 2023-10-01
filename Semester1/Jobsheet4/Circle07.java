package Semester1.Jobsheet4;

import java.util.Scanner;

public class Circle07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r;
    double circumference, area;
    float phi =3.14F;
    
    System.out.println("input radius: ");
    r = input .nextInt();
    area = phi*r*r;
    circumference = 2*phi*r;

    System.out.println("Area: "+area);
    System.out.println("Circumference: "+circumference);
    
    }
}

