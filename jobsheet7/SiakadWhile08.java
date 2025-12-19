package jobsheet7;

import java.util.Scanner;

public class SiakadWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai = sc.nextInt();

            // validasi nilai
            if (nilai < 0 || nilai > 100) { 
                System.out.println("Nilai tidak valid! Masukkan ulang!");
                continue; 
            }

            // kategori nilai
            if (nilai > 80) {
                System.out.println("Kategori: A");
                System.out.println("Bagus, pertahankan nilainya!"); // jawaban nomor 4
            } else if (nilai > 73) {
                System.out.println("Kategori: B+");
            } else if (nilai > 65) {
                System.out.println("Kategori: B");
            } else if (nilai > 60) {
                System.out.println("Kategori: C+");
            } else if (nilai > 50) {
                System.out.println("Kategori: C");
            } else if (nilai > 39) {
                System.out.println("Kategori: D");
            } else {
                System.out.println("Kategori: E");
            }

            i++;  // tetap di akhir perulangan
        }
        sc.close();
    }
}
