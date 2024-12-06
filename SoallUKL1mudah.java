import java.util.Scanner;
public class SoallUKL1mudah {
    public static void main(String[] args) {
        double totalBelanja, totalHargaBelanja, totalNilai;
        String namaPelanggan;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Nama Pelanggan : ");
        namaPelanggan = in.nextLine();
         System.out.println("Masukan Nilai Harga : ");
        totalNilai = in.nextDouble();
         System.out.println("Masukan Total Belanja : ");
        totalBelanja = in.nextDouble();
        System.out.println("Masukan Total Harga Belanja  : ");
        totalHargaBelanja = in.nextDouble();

        //total belanja 0%,total belanja 10%, total harga 20%
        totalHargaBelanja = (0.0*totalNilai)+(0.1*totalNilai)+(0.2*totalNilai);
        System.out.println("Total Nilai dari "+namaPelanggan+" adalah "+totalHargaBelanja);






    }
}
