/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapLabsOnlineContest;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class H {
    
    public static PriorityQueue<Linha> conjunto = new PriorityQueue<>();
    
    public static List<Pair> lista = new ArrayList<>();
    
    public static int parent[];
    
    public static int find(int index) {
        if(parent[index] != index) {
            return find(parent[index]);
        }
        return index;
    }
    
    public static void union(int x, int y) {
        int index_x = find(x);
        int index_y = find(y);
        parent[index_y] = index_x;
    }
    
    public static double kruskal(int n) {
        int tam = 0;
        double soma = 0;
        while(!conjunto.isEmpty()) {
            if(tam  == n) {
                return soma;
            }
            
            
            Linha atual = conjunto.poll();
            
            if(find(atual.origem) != find(atual.destino)) {
                soma += atual.dist;
                tam++;
                union(atual.origem, atual.destino);
            }

        }
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for(int i = 0; i < n; i++) {
            lista.add(new Pair(i, input.nextInt(), input.nextInt()));
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    conjunto.add(new Linha(
                            lista.get(i).id,
                            lista.get(j).id,
                            Math.hypot((lista.get(i).x - lista.get(j).x), (lista.get(i).y - lista.get(j).y))
                    ));
                }
            }
        }
        double res = kruskal(n-1);
        System.out.println(res);
    }
    
}


class Pair {
    int id;
    int x;
    int y;
    
    public Pair(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    
}

class Linha implements Comparable<Linha>{
    public int origem;
    public int destino;
    public double dist;
    
    public Linha(int origem, int destino, double dist) {
        this.origem = origem;
        this.destino = destino;
        this.dist = dist;
    }

    @Override
    public int compareTo(Linha l) {
        return (this.dist < l.dist) ? -1 : 1;
    }
    
}