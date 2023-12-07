package Semester1.Jobsheet14;

import java.util.Scanner;

public class PrimeCheckingRecursive {
    static boolean primeRecursive(int x) {
        if (x <= 1) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int N = sc.nextInt();

        System.out.print(primeRecursive(N) ? "True" : "False");
        
    }
}
