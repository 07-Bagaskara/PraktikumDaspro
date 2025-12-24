package jobsheet14;

import java.util.Scanner;

public class HitungBalok08 {

    // Fungsi hitung Luas
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    // Fungsi hitung Volume
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        // Memanggil fungsi hitungLuas
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        // Memanggil fungsi hitungVolume
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);
        
        input.close();
    }
}