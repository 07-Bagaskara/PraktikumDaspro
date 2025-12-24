package jobsheet14;

import java.util.Scanner;

public class RekapPenjualan08 {
    // Array global untuk menyimpan nama menu
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    // Fungsi Input Data Penjualan
    public static void inputPenjualan(int[][] data, Scanner sc) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Fungsi Menampilkan Data dalam Tabel
    public static void tampilkanData(int[][] data) {
        System.out.println("\n=== Rekap Penjualan ===");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= data[0].length; i++) System.out.print("H" + i + "\t");
        System.out.println();
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + (menu[i].length() < 8 ? "\t\t" : "\t")); // Formatting tab
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi Menampilkan Menu dengan Penjualan Tertinggi
    public static void menuTertinggi(int[][] data) {
        int maxPenjualan = 0;
        int indexMenu = 0;

        for (int i = 0; i < data.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < data[i].length; j++) {
                totalPerMenu += data[i][j];
            }
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                indexMenu = i;
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menu[indexMenu] + 
                           " dengan total " + maxPenjualan + " terjual.");
    }

    // Fungsi Menampilkan Rata-rata Penjualan Setiap Menu
    public static void rataRataPenjualan(int[][] data) {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < data.length; i++) {
            double total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = total / data[i].length;
            System.out.printf("%s: %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMenu = 5;
        int jumlahHari = 7;
        
        // Array 2D: Baris = Menu, Kolom = Hari
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];

        // Panggil fungsi-fungsi
        inputPenjualan(dataPenjualan, sc);
        tampilkanData(dataPenjualan);
        menuTertinggi(dataPenjualan);
        rataRataPenjualan(dataPenjualan);
    }
}