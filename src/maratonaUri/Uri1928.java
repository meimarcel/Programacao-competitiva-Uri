/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author meimarcel
 */

class Carta {
    public int carta;
    public int nivel;
    public boolean visitado = false;
    public List<Carta> linha;
    
    public Carta(int carta, int nivel) {
        this.carta = carta;
        this.nivel = nivel;
        this.linha = new ArrayList<>();
    }
}



public class Uri1928 {
    
    public static List<Carta> grafo;
    public static int casa[] = new int[26000];
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        grafo = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = input.nextInt();
            grafo.add(new Carta(a,0));
        }

        for(int i = 1; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            grafo.get(x-1).linha.add(grafo.get(y-1));
            grafo.get(y-1).linha.add(grafo.get(x-1));
        }
//        for(int i = 0; i < n; i++) {
//            System.out.println(grafo.get(i).carta);
//            for(Carta c : grafo.get(i).linha) {
//                System.out.print("-"+c.carta);
//            }
//            System.out.println();
//        }
        
        int pontos = 0;
        int cont = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grafo.get(j).visitado = false;
            }
            
            if(grafo.get(i).carta == cont) {
                pontos += bfs(grafo.get(i));
                cont++;
                i = 0;
            }
        }
        
        System.out.println(pontos);
    }
    
    public static int bfs(Carta init) {
        Stack<Carta> fronteira = new Stack<>();
        init.nivel = 0;
        fronteira.add(init);
        while(!fronteira.isEmpty()) {
            Carta atual = fronteira.pop();
            atual.visitado = true;
            casa[atual.carta] = 1;
            for(Carta c : atual.linha) {
                c.nivel = atual.nivel + 1;
                if(!c.visitado) {
                    if(c.carta == init.carta) {
                        //System.out.println(c.carta);
                        return c.nivel;
                    }
                    fronteira.add(c);
                }
            }
        }
        return 0;
    }
    
}
