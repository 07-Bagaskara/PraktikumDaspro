package jobsheet11;
import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Modifikasi: Input jumlah siswa dan mata kuliah secara dinamis
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlSiswa = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlSiswa][jmlMatkul];

        // Input nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Output rata-rata per siswa
        System.out.println("\n-----------------------------------");
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + " total nilai: " + totalPerSiswa + ", Rata-rata: " + (totalPerSiswa / jmlMatkul));
        }

        // Output rata-rata per mata kuliah
        System.out.println("\n-----------------------------------");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jmlSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / jmlSiswa));
        }
        sc.close();
    }
}