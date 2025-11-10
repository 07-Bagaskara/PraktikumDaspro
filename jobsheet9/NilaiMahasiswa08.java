package jobsheet9;

import java.util.Scanner;

public class NilaiMahasiswa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");

        int n = sc.nextInt();
        int[] nilai = new int[n];
        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai [i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i] > tertinggi){
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah){
                terendah = nilai[i];
            }   
        }

        double rataRata = (double) total / n;
        System.out.println("\nRata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("\nDaftar nilai:");
        for (int val : nilai) System.out.print(val +" ");

        sc.close();

    }
}
