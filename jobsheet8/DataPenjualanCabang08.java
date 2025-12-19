package jobsheet8;

import java.util.Scanner;

public class DataPenjualanCabang08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int cabang = sc.nextInt();

        int totalPelangganAll = 0;
        int totalItemAll = 0;

        for(int i = 1; i <= cabang; i++){
            System.out.println("\nCabang " + i);

            System.out.print("Jumlah pelanggan hari ini: ");
            int pelanggan = sc.nextInt();
            totalPelangganAll += pelanggan;

            int totalItemCabang = 0;

            for(int p = 1; p <= pelanggan; p++){
                System.out.print("Jumlah item pelanggan ke-" + p + " : ");
                totalItemCabang += sc.nextInt();
            }

            totalItemAll += totalItemCabang;

            System.out.println("Total item terjual cabang " + i + ": " + totalItemCabang);
        }

        System.out.println("\n--- RINGKASAN SELURUH CABANG ---");
        System.out.println("Total pelanggan : " + totalPelangganAll);
        System.out.println("Total item terjual : " + totalItemAll);
        sc.close();
    }
}
