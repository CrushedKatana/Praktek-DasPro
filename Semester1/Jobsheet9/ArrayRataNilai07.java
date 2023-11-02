package Semester1.Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalLulus= 0, totalTdkLulus= 0;
        double rata2Lulus, rata2TdkLulus;
        int mahasiswaLulus=0;
        int mahasiswaTdklulus=0;
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke - " + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }for (int  i= 0; i < nilaiMhs.length;i++ ){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mahasiswaLulus++;
            } else if (nilaiMhs[i] <= 70) {
                totalTdkLulus += nilaiMhs[i];
                mahasiswaTdklulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus adalah : "  + mahasiswaLulus);
        rata2Lulus = totalLulus/mahasiswaLulus;
        System.out.println("Rata - rata nilai Lulus = " + rata2Lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus adalah : "  + mahasiswaTdklulus);
        rata2TdkLulus = totalTdkLulus/mahasiswaTdklulus;
        System.out.println("Rata - rata nilai Lulus = " + rata2TdkLulus);
    }
}
