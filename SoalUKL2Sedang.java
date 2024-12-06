import java.util.Scanner;
public class SoalUKL2Sedang {
    public static void main(String[] args) {
        int i=1,jumlahUang, UangPerbulan, uang ,totalUang=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Uang Perbulan : ");
        UangPerbulan = in.nextInt();
        System.out.println("Masukan Total Uang : ");
        totalUang = in.nextInt();
        

        while (1<totalUang) {
          System.out.println("Masukan total uang :");
          uang = in.nextInt();
          totalUang*=uang;
          i++;  
        }
          
        
        jumlahUang=UangPerbulan*totalUang;
        System.out.println("Total Nilai dari "+jumlahUang+":"+totalUang);
          System.out.println("Jumlah Uang "+jumlahUang);
         


    }
}
