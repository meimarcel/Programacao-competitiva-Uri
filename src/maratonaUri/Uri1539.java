/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1539 {
    
    public static List<Antena> grafo;
    
    public static void reset() {
        for(Antena a : grafo) {
            a.pai = null;
            a.status = -1;
            a.distancia = Integer.MAX_VALUE;
        }
    }
    
    public static void search(Antena init) {
        PriorityQueue<Antena> front = new PriorityQueue<>();
        init.pai = null;
        init.status = 0;
        init.distancia = 0;
        front.add(init);
        while(!front.isEmpty()) {
            Antena atual = front.poll();
            for(Linha l : atual.linhas) {
                if(l.a.status != 1) {
                    l.a.status = 0;
                    if(atual.distancia + l.dist < l.a.distancia) {
                        l.a.distancia = atual.distancia + l.dist;
                        l.a.pai = atual;
                        front.add(l.a);
                    }
                }
            }
            atual.status = 1;
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        while((n = input.nextInt()) != 0) {
            grafo = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                grafo.add(new Antena(i+1, input.nextInt(), input.nextInt(), input.nextInt(), -1, Integer.MAX_VALUE));
            }
            for(int i = 0; i < n; i++) {
                Antena atual = grafo.get(i);
                for(int j = 0; j < n; j++) {
                    if(i != j) {
                        Antena aux = grafo.get(j);
                        double dist = Math.hypot((atual.x - aux.x), (atual.y - aux.y));
                       
                        if(dist < atual.r) {
                            atual.linhas.add(new Linha(aux,dist));
                        }
                    }
                }
            }
            
            int c = input.nextInt();
            for(int i = 0; i < c; i++) {
                reset();
                int init = input.nextInt();
                int fim = input.nextInt();
                search(grafo.get(init - 1));
                Antena atual = grafo.get(fim - 1);
                
                while(atual.pai != null) {
                    atual = atual.pai;
                }
                int dist = (int) grafo.get(fim - 1).distancia;
                if(atual.id != init) {
                    System.out.println(-1);
                } else {
                    System.out.println(dist);
                }
            }
            
        }
        
    }
}

class Antena implements Comparable<Antena> {
    public int id;
    public int x;
    public int y;
    public int r;
    public int status;
    public Antena pai;
    public double distancia;
    public List<Linha> linhas = new ArrayList<>();
    
    public Antena(int id, int x, int y, int r, int status, int distancia) {
        this.id= id;
        this.x = x;
        this.y = y;
        this.r = r;
        this.status = status;
        this.distancia = distancia;
    }

    @Override
    public int compareTo(Antena a) {
        return (this.distancia < a.distancia) ? -1 : 1;
    }
    
    
    
}

class Linha {
    public Antena a;
    public double dist;
    
    public Linha(Antena a, double dist) {
        this.a = a;
        this.dist = dist;
   }
}