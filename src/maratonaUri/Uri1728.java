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
public class Uri1728 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String entrada = "";
        do {
            entrada = input.nextLine();
            String aux[] = entrada.split("\\+");
            String n1 = aux[0];
            String n2 = aux[1].split("=")[0];
            String n3 = aux[1].split("=")[1];
            n1 = new StringBuffer(n1).reverse().toString();
            n2 = new StringBuffer(n2).reverse().toString();
            n3 = new StringBuffer(n3).reverse().toString();
            int a1 = Integer.parseInt(n1);
            int a2 = Integer.parseInt(n2);
            int a3 = Integer.parseInt(n3);
            if(a1+a2 == a3) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            
            
        }while(!entrada.equals("0+0=0"));
        
    }
    
}
