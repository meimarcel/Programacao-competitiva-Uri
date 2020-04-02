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
public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input. nextInt();
        int[] vetor = new int[n];
        for(int i = 0; i < n; ++i) {
            vetor[i] = input.nextInt();
        }
        
        Arrays.sort(vetor);
        
        for(int i = (n - k - 1); i >= 0; --i) {
            if (vetor[i] == vetor[i + 1]){
                k++;
            } else {
                break;
            }
        }
        System.out.println(k);
    }
    
}
