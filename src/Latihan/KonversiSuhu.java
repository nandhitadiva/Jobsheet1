/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
     Scanner masukan = new Scanner(System.in);
     float R, F, K;
     System.out.print("Masukkan nilai suhu dari celcius : ");
     float C = masukan.nextInt();
     System.out.print("pilih konvers ke K, R, F : ");
     String pilihan = masukan.next();
     switch (pilihan) {
         case "K" :
         System.out.println("Hasil : " + (K = C+273));
         break;
         case "R" :
         System.out.println("Hasil : " + (R = C*4/5));
         break;
         case "F" :
         System.out.println("Hasil : " + (F = C*9/5+32));
         break;
    }
    }
}
