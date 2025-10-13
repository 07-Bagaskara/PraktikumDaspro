package jobsheet5;

import java.util.Scanner;

public class AksesWiFiKampus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String jenisPengguna;
        int jumlahSKS;

        System.out.println("--- Sistem Pengecekan Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (Dosen / Mahasiswa / Lainnya): ");
        jenisPengguna = input.nextLine();

        // Pengecekan kondisi bertingkat (if-else if-else)
        // Method .equalsIgnoreCase() digunakan agar input tidak peka huruf besar/kecil
        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Output: Akses WiFi diberikan (dosen)");
        } 
        else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            // Jika pengguna adalah Mahasiswa, tanya jumlah SKS
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            jumlahSKS = input.nextInt();
            
            // Pengecekan SKS (nested if)
            if (jumlahSKS >= 12) {
                System.out.println("Output: Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Output: Akses ditolak, SKS kurang dari 12");
            }
        } 
        else {
            // Jika bukan Dosen maupun Mahasiswa
            System.out.println("Output: Akses ditolak");
        }

        input.close();
    }
}