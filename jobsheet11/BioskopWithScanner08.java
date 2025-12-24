package jobsheet11;
import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        
                        boolean kursiValid = false;
                        while (!kursiValid) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); // consume newline

                            // Validasi indeks array (Pertanyaan 3)
                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Warning: Kursi tidak tersedia! Silakan masukkan baris/kolom yang benar.");
                            } 
                            // Validasi kursi sudah terisi (Pertanyaan 4)
                            else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Warning: Kursi sudah terisi oleh penonton lain! Silakan pilih kursi lain.");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                kursiValid = true;
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                
                case 2:
                    System.out.println("--- DAFTAR PENONTON ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Ganti null dengan *** (Pertanyaan 5)
                            String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.print(namaPenonton + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih.");
                    return; // Keluar dari program
                
                default:
                    System.out.println("Menu tidak valid.");
            }
            sc.close();
        }
    }
}

