package Semester1.Jobsheet7;

import java.util.Scanner;

public class WhileMultiples07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;

        System.out.println("Input the multiple = ");
        multiple = input.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
            i++;
        }

        double average = (double) sum / counter;

        System.out.printf("There are %d numbers that are multiples of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The Sum from all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        System.out.printf("The Average of all multiples of %d in range 1 to 50 is %.2f. \n", multiple, average);
    }
}

