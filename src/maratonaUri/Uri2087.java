/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri2087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0) {
            input.nextLine();
            String palavras[] = new String[n];
            for(int i = 0; i < n; ++i) {
                palavras[i] = input.nextLine();
            }
            String res = "Conjunto Bom";
            Arrays.sort(palavras, Comparator.comparingInt(String::length));
            bloco:
            for(int i = 0; i < n; ++i) {
                for(int j = i; j < n; ++j) {
                    if(i != j) {
                        String aux = palavras[j].replace(palavras[i], "0");
                        if(aux.charAt(0) == '0') {
                            res = "Conjunto Ruim";
                            break bloco;
                        }
                    } 
                }
            }            
            System.out.println(res);
            n = input.nextInt();
        }
        
    }
    
}
