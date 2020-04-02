/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1249 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) 'a';
        int z = (int) 'z';
        int A = (int) 'A';
        int Z = (int) 'Z';
         while(input.hasNextLine()) {
            String entrada = input.nextLine();
            for(int i = 0; i < entrada.length(); i++) {
                int letra = (int) entrada.charAt(i);
                if(letra >= a && letra <= z) {
                    if((letra + 13 > z)) {
                        System.out.print((char) (a + (letra + 13) - z - 1));
                    } else {
                        System.out.print((char) (letra + 13));
                    }
                }
                else if (letra >= A && letra <= Z) {
                     if((letra + 13 > Z)) {
                        System.out.print((char) (A + (letra + 13) - Z - 1));
                    } else {
                        System.out.print((char) (letra + 13));
                    }
                }
                else {
                    System.out.print(entrada.charAt(i));
                }
            }
            System.out.println();
        }
        
    }
    
}
