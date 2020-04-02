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
public class Uri1253 {  
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int A = (int) 'A';
        int Z = (int) 26;
        int n = input.nextInt();
        input.nextLine();
        while(n > 0) {     
            String entrada = input.nextLine();
            int t = input.nextInt();
            input.nextLine();
            for(int i = 0; i < entrada.length(); i++) {
                int a = (int) (entrada.charAt(i) - A) - t;
                if(a < 0) {
                    System.out.print(letras[Z + a]);
                } else {
                    System.out.print(letras[a]);
                }
            }
            System.out.println();
            --n;
        }

        
    }
    
}
