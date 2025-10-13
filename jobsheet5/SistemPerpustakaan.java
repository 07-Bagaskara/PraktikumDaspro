package jobsheet5;

import java.util.Scanner;

public class SistemPerpustakaan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel untuk menampung input
        boolean bawaKartuMahasiswa;
        boolean sudahRegistrasiOnline;

        System.out.println("--- Sistem Pengecekan Izin Masuk Perpustakaan ---");

        // Meminta input dari pengguna
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        bawaKartuMahasiswa = input.nextBoolean();

        System.out.print("Apakah sudah melakukan registrasi online? (true/false): ");
        sudahRegistrasiOnline = input.nextBoolean();

        // Pengecekan kondisi menggunakan operator OR (||)
        // Jika salah satu atau kedua kondisi bernilai true, maka hasilnya true
        if (bawaKartuMahasiswa || sudahRegistrasiOnline) {
            System.out.println("Output: Silakan Masuk");
        } else {
            System.out.println("Output: Ditolak Masuk");
        }

        input.close();
    }
}