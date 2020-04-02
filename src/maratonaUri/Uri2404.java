/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */


public class Uri2404 {
    public static PriorityQueue<EstradaB> conjunto;
    
    public static int parent[];
    
    public static int kruskal(int n) {
        int tam = 0;
        int soma = 0;
        while(!conjunto.isEmpty()) {
            if(tam  == n) {
                return soma;
            }
            
            
            EstradaB atual = conjunto.poll();
            
            if(find(atual.origem) != find(atual.destino)) {
                soma += atual.peso;
                tam++;
                union(atual.origem, atual.destino);
            }

        }
        return soma;
    }
    
    public static int find(int index) {
         if(parent[index] != index) {
             return find(parent[index]);
         }
         return parent[index];
    }
    
    public static void union(int x, int y) {
        int index_x = find(x);
        int index_y = find(y);
        parent[index_y] = index_x;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        parent = new int[n+1];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        conjunto = new PriorityQueue<EstradaB>();
        for(int i = 0; i < m; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            conjunto.add(new EstradaB(x,y,z));
        }
        System.out.println(kruskal(n-1));
 
        
        
    }
    
}


class EstradaB implements Comparable<EstradaB>{
    public int origem;
    public int destino;
    public int peso;
    public EstradaB(int origem, int destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int compareTo(EstradaB e) {
        return (this.peso < e.peso) ? -1 : 1;
    }
    
}
