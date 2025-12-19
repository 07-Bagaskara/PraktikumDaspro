package jobsheet7;

import java.util.Scanner;

public class Parkir08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, jam;
        int total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Stop): ");
            jenis = sc.nextInt();

            if (jenis == 0) break;

            System.out.print("Masukkan durasi jam parkir: ");
            jam = sc.nextInt();

            int bayar;

            if (jam > 5) {
                bayar = 12500;
            } else {
                if (jenis == 1) {
                    bayar = jam * 3000;
                } else {
                    bayar = jam * 2000;
                }
            }

            total += bayar;
            System.out.println("Biaya parkir: Rp " + bayar);
        }

        System.out.println("Total pemasukan parkir hari ini: Rp " + total);
        sc.close();
    }
}

