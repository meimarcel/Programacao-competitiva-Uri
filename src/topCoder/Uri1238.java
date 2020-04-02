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
public class Uri1238 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++) {
            String entrada[] = input.nextLine().split(" ");
            String palavra1[] = entrada[0].split("");
            String palavra2[] = entrada[1].split("");
            int maior = Math.max(palavra1.length, palavra2.length);
            for(int j = 0; j < maior; j++) {
                if(j < palavra1.length) {
                    System.out.print(palavra1[j]);
                }
                if(j < palavra2.length) {
                    System.out.print(palavra2[j]);
                }
            }
            System.out.println();
        }
        
    }
    
}
