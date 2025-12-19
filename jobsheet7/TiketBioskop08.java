package jobsheet7;

import java.util.Scanner;

public class TiketBioskop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        double totalHarga = 0;
        int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket (negatif = input ulang, 0 = selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) break;
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }

            double harga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                harga *= 0.85;
            } else if (jumlahTiket > 4) {
                harga *= 0.90;
            }

            totalTiket += jumlahTiket;
            totalHarga += harga;
        }

        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalHarga);
        sc.close();
    }
}

