/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1193 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int caso = 1;
        input.nextLine();
        while(n > 0) {
            String entrada[] = input.nextLine().split(" ");
            if(entrada[1].equals("bin")) {
                int dec = Integer.parseInt(entrada[0],2);
                String hex = Integer.toHexString(dec);
                System.out.println("Case "+(caso++)+":");
                System.out.println(dec+" dec");
                System.out.println(hex+" hex");
            }
            else if(entrada[1].equals("dec")) {
                String bin = Integer.toBinaryString(Integer.parseInt(entrada[0]));
                String hex = Integer.toHexString(Integer.parseInt(entrada[0]));
                System.out.println("Case "+(caso++)+":");
                System.out.println(hex+" hex");
                System.out.println(bin+" bin");
            } else {
                int dec = Integer.parseInt(entrada[0],16);
                String bin = Integer.toBinaryString(dec);
                System.out.println("Case "+(caso++)+":");
                System.out.println(dec+" dec");
                System.out.println(bin+" bin");
            }
            System.out.println();
            n--;
        }
        
    }
    
}
