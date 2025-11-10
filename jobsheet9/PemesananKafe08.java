package jobsheet9;

import java.util.Scanner;

public class PemesananKafe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[n];
        double[] harga = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga: ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
            total += harga[i];
        }

        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < n; i++) {
            System.out.println(namaPesanan[i] + " - Rp" + harga[i]);
        }
        System.out.println("Total biaya: Rp" + total);

        sc.close();
    }
}