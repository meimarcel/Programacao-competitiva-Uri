/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetex2019;

/**
 *
 * @author meimarcel
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Vertice {
    int i;
    int j;
    public Vertice(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Search {
    int m;
    int n;
    char matriz[][];
    int aux[][];
    int best[][];
    Queue<Vertice> fronteira;
    
    public Search(char matriz[][], int m, int n) {
        this.m = m;
        this.n = n;
        this.aux = new int[m][n];
        this.best = new int[m][n];
        this.matriz = matriz;
        this.fronteira = new LinkedList<>();
    }
    
    public int bfs(int i, int j) {
        int min = 0;
        Vertice atual = new Vertice(i,j);
        this.fronteira.add(atual);
        this.aux = new int[m][n];
        while(!this.fronteira.isEmpty()) {
            atual = this.fronteira.poll();
            
            if(atual.i >= m || atual.i < 0 || atual.j >= n || atual.j < 0) {
                return min;
            }
           
            if (this.aux[atual.i][atual.j] == 1) {
                best[atual.i][atual.j] = min;
                return min;
            }
            if(best[atual.i][atual.j] != 0) {
                return best[atual.i][atual.j];
            }
            char sentido = this.matriz[atual.i][atual.j];
            if((int)sentido == (int)'N') {
                this.fronteira.add(new Vertice(atual.i-1,atual.j));
            }
            else if((int)sentido == (int)'S') {
                this.fronteira.add(new Vertice(atual.i+1,atual.j));
            }
            else if((int)sentido == (int)'E') {
                this.fronteira.add(new Vertice(atual.i,atual.j+1));
            }
            else if((int)sentido == (int)'W') {
                this.fronteira.add(new Vertice(atual.i,atual.j-1));
            }
            this.aux[atual.i][atual.j] = 1;
            min++;
        }
        best[atual.i][atual.j] = min;
        return min;
    }
}


public class C {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
                
        char[][] matriz = new char[m][n];
        
        String entrada = input.nextLine();
        for(int i = 0; i < m; ++i){
            entrada = input.nextLine();
            for(int j = 0; j < n; j++) {
                matriz[i][j] = entrada.toCharArray()[j];
            }
        }
        
        Search BFS = new Search(matriz, m, n);
        int min = 0;
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; j++) {
               min += BFS.bfs(i, j);
            }
        }
        System.out.println(min);
        
    }
    
}
