package jobsheet14;

public class PengunjungCafe08 {

    // Fungsi menggunakan VarArgs
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        // Modifikasi menggunakan for-each loop sesuai Pertanyaan No 2
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        // Pemanggilan dengan berbagai jumlah argumen
        daftarPengunjung("Ali", "Budi", "Citra");
        System.out.println("------------------------");
        daftarPengunjung("Andi");
        System.out.println("------------------------");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih"); 
    }
}