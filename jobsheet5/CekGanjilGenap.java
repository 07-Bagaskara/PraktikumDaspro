package jobsheet5;

import java.util.Scanner;

public class CekGanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan sebuah angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Output: Genap");
        } else {
            System.out.println("Output: Ganjil");
        }

        input.close();
    }
}