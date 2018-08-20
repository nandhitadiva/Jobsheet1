/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PratikumLanjutan;

/**
 *
 * @author WINDOWS 10
 */
public class HurufH {
    public static void main(String[] args){
        int a, b, c, d;
        for(d=1; d<=4; d++){
            for(b=1; b<=1; b++){
                System.out.print("@");
            }
            for(c=2; c<=3; c++){
                if(b==d){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(a=1; a<=1; a++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
