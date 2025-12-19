package jobsheet8;
import java.util.Scanner;

public class JumlahKuadrat08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int total = 0;
        String deret = ""; 

        for(int i = 1; i <= n; i++){
            
            int kuadrat = 0;
            for(int j = 1; j <= i; j++){
                kuadrat += i; 
            }
            
            total += kuadrat;
            
            deret += kuadrat;
            if(i < n) {
                deret += "+";
            }
        }
        System.out.println("n=" + n + " jumlah kuadrat = " + deret + "=" + total);
        sc.close();
    }
}