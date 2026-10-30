import java.util.Scanner;
/**
 * tugas225
 */
public class tugas225 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n<3) {
                System.out.println("n minimal 3");
            }
        }while (n < 3);
        int jumlah = 0;
        for (int i = 1; i <= n;i++) {
            for (int j = 1; j<= n;j++) {
                int hasil = i * j;
                System.out.print(hasil + " \t ");
                jumlah += hasil;
            }   
            System.out.println(); 
         }
         System.out.println("jumlah seluruh angka: " + jumlah);
         sc.close();

    }
}