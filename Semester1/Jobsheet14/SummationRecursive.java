package Semester1.Jobsheet14;

import java.util.Scanner;

public class SummationRecursive {
    static int sumRecursive (int x) {
        if (x == 0) {
            return(0);
        } else  {
            return (x + sumRecursive(x - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value : ");
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(N + " = ");
        System.out.println(sumRecursive(N));
    }
}
