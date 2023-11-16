
package Semester1.Jobsheet11;

import java.util.Scanner;

public class DownTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for(int i = N; i > 0; i--){
            for(int j = N - i; j < N; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
