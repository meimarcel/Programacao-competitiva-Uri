/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20171;

/**
 *
 * @author meimarcel
 */

import java.util.Arrays;
import java.util.Scanner;

public class A {
    
    public static int maiorFreq(int[] intervalo) {
        int freq_atual = 1;
        int freq_max = 1;
        Arrays.sort(intervalo);
        int maior = intervalo[intervalo.length - 1];
        
        for(int i = 1; i < intervalo.length; i++) {
            if(intervalo[i] == intervalo[i - 1]) {
                freq_atual++;
            } else {
                if (freq_atual >= freq_max) {
                    freq_max = freq_atual;
                    maior = intervalo[i-1];
                }
                freq_atual = 1;
            }
        }
        if (freq_atual >= freq_max) {
            freq_max = freq_atual;
            maior = intervalo[intervalo.length-1];
        }
        
        
        return maior;
    }
    
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        int n, q;
        String[] entrada = input.nextLine().split(" ");
        n = Integer.parseInt(entrada[0]);
        q = Integer.parseInt(entrada[1]);  
        int[] piano = new int[n];
        Arrays.fill(piano, 1);
        
        for(int i = 0; i < q; i++) {
            entrada = input.nextLine().split(" ");
            int a = Integer.parseInt(entrada[0]);
            int b = Integer.parseInt(entrada[1]);
            int[] intervalo = Arrays.copyOfRange(piano, a, b+1);
            int freq = maiorFreq(intervalo);
            for(int j = a; j <= b; j++) {
                piano[j] = (piano[j] + freq) % 9;

            }   
        }
        
        for(int i : piano) {
            System.out.println(i);
        }
        input.close();
      
        
    }
}
