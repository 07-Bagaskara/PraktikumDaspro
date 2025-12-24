package jobsheet11;

import java.util.Scanner;

public class Survey08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Deklarasi Array (Sesuai Flowchart Step 2)
        int[][] survey = new int[10][6];
        
        // 2. Input Data Survey (Sesuai Flowchart Step 3)
        System.out.println("--- INPUT DATA ---");
        for (int i = 0; i < 10; i++) { // Loop Baris (Responden)
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) { // Loop Kolom (Pertanyaan)
                System.out.print("Nilai Pertanyaan " + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        // 3. Menampilkan Rata-rata per Responden (Sesuai Flowchart Step 4)
        System.out.println("\n--- RATA-RATA PER RESPONDEN ---");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata2 = total / 6;
            System.out.println("Rata-rata Responden " + (i + 1) + ": " + rata2);
        }

        // 4. Menampilkan Rata-rata per Pertanyaan (Sesuai Flowchart Step 5)
        System.out.println("\n--- RATA-RATA PER PERTANYAAN ---");
        for (int j = 0; j < 6; j++) { // Loop kolom di luar
            double total = 0;
            for (int i = 0; i < 10; i++) { // Loop baris di dalam
                total += survey[i][j];
            }
            double rata2 = total / 10;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + rata2);
        }

        // 5. Menampilkan Rata-rata Keseluruhan (Sesuai Flowchart Step 6)
        System.out.println("\n--- RATA-RATA KESELURUHAN ---");
        double grandTotal = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                grandTotal += survey[i][j];
            }
        }
        double rata2Total = grandTotal / 60; // 60 adalah total elemen (10 * 6)
        System.out.println("Rata-rata Total: " + rata2Total);
        sc.close();
    }
}