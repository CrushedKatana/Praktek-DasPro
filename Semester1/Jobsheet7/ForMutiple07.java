package Semester1.Jobsheet7;

import java.util.Scanner;

public class ForMutiple07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int multiple, sum=0, counter=0;

    System.out.println("Input the multiple = ");
    multiple = input.nextInt();

    for(int i=1;i<=50;i++){
        if(i%multiple == 0){
            sum = sum + i;
            counter++;
            //System.out.print(i+"-");
        }
    }

    System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
    System.out.printf("The Sum from all multiple of %d in range 1 to 50 is %d. \n" , multiple, sum);
    }
}

