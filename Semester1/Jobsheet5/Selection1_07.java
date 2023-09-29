package Semester1.Jobsheet5;

import java.util.Scanner;

public class Selection1_07 {
  public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);
    
    System.out.print("Input a number = ");
    int number = input07.nextInt();
    
    String hasil;
    hasil = (number%2==0) ? "is even number" : "is an odd number";
    System.out.println(number + hasil);

    /*if (number%2 == 0){
      System.out.println(number+" is an even number!");
    }else{
      System.out.println(number+" is an odd number!");
    }*/

  }  
}
