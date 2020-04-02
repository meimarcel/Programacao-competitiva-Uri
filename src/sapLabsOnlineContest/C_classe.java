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
public class C_classe {
    public static List<Cenario> grafo = new ArrayList<>();
    
    public static void reset() {
        for(Cenario c : grafo) {
            c.state = -1;
            c.dif = Long.MAX_VALUE;
        }
    }
    
    public static void dijckstra(Cenario init) {
        init.dif = 0;
        init.state = 0;
        PriorityQueue<Cenario> front = new PriorityQueue<>();
        front.add(init);
        while(!front.isEmpty()) {
            Cenario atual = front.poll();
            if(atual.state != 1) {
                for(LinhaA l : atual.v) {
                    if(l.c.state != 1) {
                        if(atual.dif + l.peso < l.c.dif) {
                            l.c.state = 0;
                            l.c.dif = atual.dif + l.peso;
                            front.add(l.c);
                        }
                    }
                }
                atual.state = 1;
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
            grafo.clear();
            for(int j = 0; j < c; j++) {
                grafo.add(new Cenario(j,Long.MAX_VALUE,-1));
            }

            for(int j = 0; j < t; j++) {
                int x = input.nextInt();
                int y = input.nextInt();
                long z = input.nextLong();
                grafo.get(x-1).v.add(new LinhaA(grafo.get(y-1), z));
            }
            dijckstra(grafo.get(0));
            tempo += grafo.get(c-1).dif;
        }
        System.out.println(tempo);

        
        
    }
    
}

class Cenario implements Comparable<Cenario>{
    public int c;
    public long dif;
    public int state;
    public List<LinhaA> v = new ArrayList<>();
    
    public Cenario(int c, long dif, int state) {
        this.c = c;
        this.dif = dif;
        this.state = -1;
    } 
    public Cenario() {
        
    }

    @Override
    public int compareTo(Cenario c) {
        return (this.dif < c.dif) ? -1 : 1;
    }
    
}

class LinhaA {
    public Cenario c;
    public long peso;
    
    public LinhaA(Cenario c, long peso) {
        this.c = c;
        this.peso = peso;
    }
    
}
