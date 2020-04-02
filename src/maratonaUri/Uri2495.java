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
public class Uri2495 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextInt()) {
            int n = input.nextInt();
            int cont = 0;
            boolean pos[] = new boolean[n];
            String[] entrada;
            input.nextLine();
            while(true) {
                entrada = input.nextLine().split(" ");
                for(String a : entrada ) {
                    pos[Integer.parseInt(a) - 1] = true;
                }
                cont += entrada.length;
                if(cont == n - 1) {
                    break;
                }
            }
            for(int i = 0; i < n; i++) {
                if(pos[i] == false) {
                    System.out.println(i+1);
                } 
            }
        }   
    }
}
