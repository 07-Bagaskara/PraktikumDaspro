package jobsheet9;

import java.util.Scanner;

public class SearchNilai08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai ditemukan di indeks ke-" + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
        sc.close();
    }
}
