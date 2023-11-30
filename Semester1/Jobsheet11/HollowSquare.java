package Semester1.Jobsheet11;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Masukan nilai N: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            System.out.print(N);
            System.out.print(' ');
            for (int j = 1; j < N - 1; j++){
                if (i == 0 || i == N - 1)
                System.out.print(N);
                else
                    for (int j2 = 0; j2 <Integer.toString(N).length(); j2++ )
                    System.out.print(' ');
                System.out.print(' ');
            }
            System.out.print(N);
            System.out.println();
        }
    }
}
