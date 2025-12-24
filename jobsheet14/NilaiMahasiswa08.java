package jobsheet14;

import java.util.Scanner;

public class NilaiMahasiswa08 {

    // Fungsi untuk menginput nilai array
    public static void inputNilai(int[] nilai, Scanner sc) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    // Fungsi untuk menampilkan nilai array
    public static void tampilNilai(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    // Fungsi untuk menghitung total nilai
    public static int hitungTotal(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }
    
    // Fungsi tambahan untuk menghitung rata-rata
    public static double hitungRataRata(int total, int jumlahElement) {
        return (double) total / jumlahElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMahasiswa = new int[n];

        // Pemanggilan fungsi-fungsi
        inputNilai(nilaiMahasiswa, sc);
        tampilNilai(nilaiMahasiswa);
        
        int total = hitungTotal(nilaiMahasiswa);
        double rata = hitungRataRata(total, n);

        System.out.println("\nTotal Nilai Mahasiswa: " + total);
        System.out.println("Rata-rata Nilai Mahasiswa: " + rata);
    }
}