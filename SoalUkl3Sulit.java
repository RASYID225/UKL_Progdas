import java.util.Scanner;

public class SoalUkl3Sulit {
  public static void main(String[] args) {
    int jumlahMunculnyaAngka1 = 0;
    int jumlahMunculnyaAngka3 = 0;
    int jumlahMunculnyaAngka7 = 0;
    int jumlahMunculnyaAngka5 = 0;
    int[] nilai = { 3, 7, 3, 1, 7, 7, 5 };
    Scanner in = new Scanner(System.in);
    //System.out.println("Masukan elemen aray 7 dan 3");

    for (int i = 0; i < nilai.length; i++) {
      System.out.println(nilai[i]);
      if (nilai[i] == 1) {
        jumlahMunculnyaAngka1 = jumlahMunculnyaAngka1 + 1;
      } else if (nilai[i] == 3) {
        jumlahMunculnyaAngka3 = jumlahMunculnyaAngka3 + 1;
      } else if (nilai[i] == 5) {
        jumlahMunculnyaAngka5 = jumlahMunculnyaAngka5 + 1;
      } else if (nilai[i] == 7)
        jumlahMunculnyaAngka7 = jumlahMunculnyaAngka7 + 1;
    }

    int jumlahPalingBanyak = 0;
    int nilaiPalingBanyak = 0;
    for (int i = 0; i < nilai.length; i++) {
      if (nilai[i] == 1) {
        if (jumlahPalingBanyak < jumlahMunculnyaAngka1){
          jumlahPalingBanyak = jumlahMunculnyaAngka1;
          nilaiPalingBanyak = 1;
        }
      }
      if (nilai[i] == 3) {
        if (jumlahPalingBanyak < jumlahMunculnyaAngka3){
          jumlahPalingBanyak = jumlahMunculnyaAngka3;
          nilaiPalingBanyak = 3;
        }
      }
      if (nilai[i] == 5) {
        if (jumlahPalingBanyak < jumlahMunculnyaAngka5){
          jumlahPalingBanyak = jumlahMunculnyaAngka5;
          nilaiPalingBanyak = 5;
        }
      }
      if (nilai[i] == 7){
        if (jumlahPalingBanyak < jumlahMunculnyaAngka7){
          jumlahPalingBanyak = jumlahMunculnyaAngka7;
          nilaiPalingBanyak = 7;
        }
      }
    }

    System.out.println("Angka " + nilaiPalingBanyak + ": " + jumlahPalingBanyak);

    

  }
}
