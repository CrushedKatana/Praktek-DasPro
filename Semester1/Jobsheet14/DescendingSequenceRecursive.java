package Semester1.Jobsheet14;

import java.util.Scanner;

public class DescendingSequenceRecursive {

    static void rowDescendingRecursive  (int x) {
        if (x >= 0) {
            System.out.println(x);
            rowDescendingRecursive(x - 1);
        }
    }

    static void rowDescendingIteratif (int x) {
        for (int i = x; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of x: ");
        int n = sc.nextInt();
        System.out.println("Sequences using Recursive:");
        rowDescendingRecursive(n);
        System.out.println("Sequence Using Iterative: ");
        rowDescendingIteratif(n);
    }
}

