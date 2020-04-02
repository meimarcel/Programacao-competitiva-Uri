/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri2372 {
    
    public static long grafo[][];
    public static long caminho[];
    public static boolean visited[];
    
    public static void dijkstra(int init) {
        for(int i = 0; i < caminho.length; i++) {
            caminho[i] = grafo[init][i];
        }
        visited[init] = true;
        while(true) {
            long menor = Long.MAX_VALUE;
            int indice = -1;
            for(int i = 0; i < caminho.length; i++) {
                if(caminho[i] < menor && !visited[i]) {
                    menor = caminho[i];
                    indice = i;
                }
            }
            if(indice != -1) {
                visited[indice] = true;
                for(int i = 0; i < caminho.length; i++) {
                    if(grafo[indice][i] != Long.MAX_VALUE) {
                        if(menor + grafo[indice][i] < caminho[i]) 
                            caminho[i] = menor + grafo[indice][i];

                    }
                }
            } else {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        grafo = new long[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(grafo[i], 0, n, Long.MAX_VALUE);
        }

        for(int i = 0; i < m; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            grafo[x][y] = z;
            grafo[y][x] = z;
        }

        
        long res = Long.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            caminho = new long[n];
            visited = new boolean[n];
            dijkstra(i);
            long maior = 0;
            for(int j = 0; j < n; j++) {
                if(j != i) {
                    if(caminho[j] > maior) 
                        maior = caminho[j];
                }  
            }
            res = Math.min(res, maior);
        }
        System.out.println(res);
 
    }
    
    
}