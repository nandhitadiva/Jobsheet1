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
public class LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        System.out.print("Masukkan r : ");
                float r = bil.nextFloat();
                System.out.println("Luas Permukaan Bola adalah : "+4*22*r/7*r);   
    }
}
