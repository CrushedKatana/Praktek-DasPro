package Semester1.Jobsheet14;

import java.util.Scanner;

public class Fibonacci {
    static int guineaPigRecursive(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return guineaPigRecursive(x - 1) + guineaPigRecursive(x - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number of Months : ");
        int N = sc.nextInt();

        System.out.print("The number of Guinea pig pairs is : ");
        System.out.println(guineaPigRecursive(N));
    }
}
