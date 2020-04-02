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
public class Uri1257 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0) {
            int t = input.nextInt();
            input.nextLine();
            int soma = 0;
            for(int i = 0; i < t; i++) {
                char entrada[] = input.nextLine().toCharArray();
                for(int j = 0; j < entrada.length; j++) {
                    soma += (int)(entrada[j] - 'A') + i + j;
                }
            }
            System.out.println(soma);
            --n;
        }
        
        
    }
    
}
