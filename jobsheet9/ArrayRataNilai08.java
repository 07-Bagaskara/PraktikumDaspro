package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        double rata = total / (double) nilaiMhs.length;

        System.out.println("\nRata-rata nilai: " + rata);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        sc.close();
    }
}