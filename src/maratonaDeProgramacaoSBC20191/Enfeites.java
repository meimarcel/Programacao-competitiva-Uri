/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20191;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Enfeites {
    
    public static int array[],resposta[];
    public static int matriz[][];
    public static int maior, n;
    
    public static void TSP(int curPos, int bitmask, int cost) {
        if(bitmask == (1 << n) - 1) {
            if(cost > maior) {
                maior = cost;
                resposta = Arrays.copyOf(array, array.length);
            }
        }
        for(int i = 0; i < n; i++) {
            if((bitmask & (1<<i)) == 0) {
                array[i] = curPos + 1;
                TSP(curPos + 1, bitmask | (1<<i), cost * matriz[curPos][i]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        matriz = new int[n][n];
        array = new int[n];
        resposta = new int[n];
        maior = 0;
        for(int i = 0;i < n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        TSP(0,0,1); 
  
        for(int i = 0; i < n-1; i++) {
            System.out.printf("%d ",resposta[i]);
        }
        System.out.println(resposta[n-1]);
        
        
    }
    
}
