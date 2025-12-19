package jobsheet7;

import java.util.Scanner;

public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahMahasiswa = 10;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 1; i <=jumlahMahasiswa; i++){
            System.out.print("Masukkan Nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >=60) {
                jumlahLulus++;
            }else {
                jumlahTidakLulus++;
            }
        }    
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang LULUS = " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang TIDAK LULUS = " + jumlahTidakLulus);
        sc.close();
    }
}
