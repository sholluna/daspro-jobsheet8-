import java.util.Scanner;
/**
 * tugas325
 */
public class tugas325 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko:");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("jumlah toko minimal 1");
            }
        }while (jumlahToko < 1);
        int totalSemuaBarang = 0;
        int barangTertinggi = -1;
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
        System.out.println ("toko" + toko);
        int jumlahPelanggan;
        do {
            System.out.print("jumlah pelanggan: ");
            jumlahPelanggan = sc.nextInt();
            if (jumlahPelanggan < 0) {
                System.out.println("tidak boleh negatif");
             }
         }while (jumlahPelanggan < 0);
         int totalBarangToko = 0;
         for (int p = 1; p <= jumlahPelanggan; p++) {
         int barang;
         do {
            System.out.print("barang yang dibeli pelanggan");
            barang = sc.nextInt();
            if (barang < 0) {
                System.out.println("tidak boleh negatif");
            }
                }while (barang < 0);
                    totalBarangToko += barang; 
                }
                System.out.println("toko" + toko + " - pelanggan:" + jumlahPelanggan + ",total barang: " +totalBarangToko);
                totalSemuaBarang += totalBarangToko;
                if (totalBarangToko > barangTertinggi) {
                barangTertinggi = totalBarangToko;
                tokoTerbanyak = toko;
                }
            }
            System.out.println("total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("toko dengan barang terbanyak: " + tokoTerbanyak);
        }
    }
    
