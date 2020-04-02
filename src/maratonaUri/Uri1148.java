
package maratonaUri;

import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meimarcel
 */
public class Uri1148 {
    
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
        while(n != 0 || m != 0) {
            grafo = new long[n][n];
            
            for(int i = 0; i < n; i++) {
                Arrays.fill(grafo[i], 0, n, Long.MAX_VALUE);
            }
            
            for(int i = 0; i < m; i++) {
                int x = input.nextInt() - 1;
                int y = input.nextInt() - 1;
                int z = input.nextInt();
                grafo[x][y] = z;
                if(grafo[y][x] != Long.MAX_VALUE) {
                    grafo[y][x] = 0;
                    grafo[x][y] = 0;
                }
            }
            
            int c = input.nextInt();
            for(int i = 0; i < c; i++) {
                caminho = new long[n];
                visited = new boolean[n];
                int init = input.nextInt() - 1;
                int fim = input.nextInt() - 1;
                dijkstra(init);
                if(caminho[fim] != Long.MAX_VALUE) {
                    System.out.println(caminho[fim]);
                } else {
                    System.out.println("Nao e possivel entregar a carta");
                }
            }
            System.out.println();
            n = input.nextInt();
            m = input.nextInt();
            
        }
        
    }
    
    
}