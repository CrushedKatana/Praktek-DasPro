package Semester1.Jobsheet7;

import java.util.Scanner;

public class DoWhileLeaveEntillement07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jatahCuti, jumlahHari;
    String konfirmasi;

    do{
        System.out.println("Apakah Anda ingim mengambil cuti (y/t)?");
        konfirmasi = input.next();
        
        if(konfirmasi.equalsIgnoreCase("y")){
            System.out.println("Jumlah hari: ");
            jumlahHari = input.nextInt();

            if(jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: "+jatahCuti);
            } else{
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                break;
            }
        }
    }while (jatahCuti > 0);
    
}  
}
