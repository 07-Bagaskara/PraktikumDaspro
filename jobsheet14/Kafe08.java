package jobsheet14;

import java.util.Scanner;

public class Kafe08 {

    // Fungsi Menu dengan parameter nama, boolean member, dan kode promo (Modifikasi Percobaan 2 & Pertanyaan)
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // Pengecekan Kode Promo (Modifikasi dari Pertanyaan Percobaan 2 No. 6)
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% dari Kode Promo.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30% dari Kode Promo.");
        } else {
            System.out.println("Kode promo tidak valid atau tidak digunakan.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    // Fungsi hitungTotalHarga dengan nilai kembalian (Percobaan 3)
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        // Menghitung harga dasar
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Logika Diskon Kode Promo (Modifikasi dari Pertanyaan Percobaan 3 No. 3)
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal * 50 / 100; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal * 70 / 100; // Diskon 30% (Bayar 70%)
        } else {
            // Tidak ada diskon tambahan
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data Pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Apakah Member (true/false): ");
        boolean member = sc.nextBoolean();
        sc.nextLine(); // membersihkan buffer
        System.out.print("Masukkan Kode Promo (jika ada): ");
        String promo = sc.nextLine();

        // Memanggil Fungsi Menu
        Menu(nama, member, promo);

        // Loop untuk pemesanan (agar bisa pesan banyak menu sekaligus)
        int totalKeseluruhan = 0;
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            // Memanggil fungsi hitungTotalHarga
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, promo);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            String konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("n")) {
                lanjut = false;
            }
        }

        // Jika member, hitung diskon member (10%) dari total keseluruhan
        if (member) {
            totalKeseluruhan = totalKeseluruhan - (totalKeseluruhan * 10 / 100);
            System.out.println("Diskon member 10% diterapkan.");
        }

        System.out.println("Total keseluruhan harga pesanan Anda: Rp" + totalKeseluruhan);
        sc.close();
    }
}
