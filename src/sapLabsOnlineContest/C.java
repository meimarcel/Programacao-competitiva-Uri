/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapLabsOnlineContest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class C {
    
    public static long grafo[][];
    public static long caminho[];
    public static boolean visited[];
    
    public static void dijkstra(int init) {
        for(int i = 0; i < caminho.length; i++) {
            caminho[i] = grafo[init][i];
        }
        caminho[init] = 0;
        visited[init] = true;
        while(true) {
            //System.out.println(Arrays.toString(caminho));
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
                        if(menor + grafo[indice][i] < caminho[i]) {
                            caminho[i] = menor + grafo[indice][i];
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        long tempo = 0;
        for(int i = 0; i < f; i++) {
            int c = input.nextInt();
            int t = input.nextInt();
            grafo = new long[c][c];
            caminho = new long[c];
            visited = new boolean[c];
            for(int j = 0; j < c; j++) {
                Arrays.fill(grafo[j],0,c, Long.MAX_VALUE);
            }
            for(int j = 0; j < t; j++) {
                int x = input.nextInt();
                int y = input.nextInt();
                long z = input.nextLong();
                grafo[x-1][y-1] = z;
            }
            dijkstra(0);
            tempo += caminho[c-2];
        }
        System.out.println(tempo);

    }
    
}
