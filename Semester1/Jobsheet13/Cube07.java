package Semester1.Jobsheet13;

import java.util.Scanner;

public class Cube07 {
    static double calculateArea(int side){
        double area = 0;
        area = 6*side*side;
        return area;
    }
    public static void main(String[] args) {
        double area = calculateArea(10);
        double volume = calculateVolume(10);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input side = ");
        int side = sc.nextInt();
        area = calculateArea(side);
        volume = calculateVolume(side);
        System.out.println("Area = "+ area);
        System.out.println("Volume = "+ volume );
    }

     static double calculateVolume(int side){
        double volume = 0;
        volume = side*side*side;
        return volume;
    }   
}