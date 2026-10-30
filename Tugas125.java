import java.util.Scanner;
/**
 * Tugas125
 */
public class Tugas125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n<1) {
            System.out.println("n minimal 1");
        }
    }while (n < 1);
    int total = 0;
    for (int i = 1; i <= n;i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
            total++;
        }
        System.out.println();
    }
    System.out.println("total angka tercetak: " + total);
    sc.close();
    }
}