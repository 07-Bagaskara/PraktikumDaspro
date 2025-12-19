package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelompok = 1;
        double total, rata;

        while(kelompok <= 6){
            System.out.println("Kelompok " + kelompok);
            total = 0;

            for(int j = 1; j <= 5; j++){
                System.out.print("Masukkan nilai penilai ke-" + j + " : ");
                total += sc.nextDouble();
            }

            rata = total / 5;
            System.out.println("Rata-rata : " + rata + "\n");

            kelompok++;
        }
        sc.close();
    }
}
