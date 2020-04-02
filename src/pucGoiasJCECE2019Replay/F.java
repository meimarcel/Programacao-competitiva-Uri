/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucGoiasJCECE2019Replay;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0) {
            int maior = 0;
            int menor = 0;
            int v = 2*n;
            int meio = (v) / 2;
            int[] vetor = new int[v];
            for(int i = 0; i < v; ++i) {
                vetor[i] = input.nextInt();
                
            }
            int[] vetor2 = new int[n];
            v -= 1;
            for(int i = 0; i < n; ++i) {
                vetor2[i] = vetor[i] + vetor[v-i];
            }
            Arrays.sort(vetor2);
            System.out.println(vetor2[n-1] + " " +vetor2[0]);
            n = input.nextInt();
        }
    }
    
}
