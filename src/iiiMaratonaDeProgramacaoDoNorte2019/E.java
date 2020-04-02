/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiMaratonaDeProgramacaoDoNorte2019;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */

class Vertice {
    int ano;
    
    public Vertice(int ano) {
        this.ano = ano;
    }
}

class BFS {
    int a[];
    int b[];
    Queue<Vertice> fronteira;
    
    public BFS(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }
    
    public String bfs(Vertice inicial, int fim, int maxP, int maxF, int max) {
        this.fronteira = new LinkedList<>();
        boolean futuro = true;
        Vertice atual = inicial;
        this.fronteira.add(atual);
        
        while(!this.fronteira.isEmpty() && max >= 0) {
            atual = this.fronteira.poll();
            if(futuro) {
                for(int i : this.a) {
                    Vertice novo = new Vertice(atual.ano+i);
                    if(novo.ano == fim) {
                        return "S";
                    }
                    if(Math.abs(novo.ano - fim) <= maxP){
                        this.fronteira.add(novo);
                    }
                }
            } else {
                for(int i : this.b) {
                    Vertice novo = new Vertice(atual.ano-i);
                    if(novo.ano == fim) {
                        return "S";
                    }
                    if(Math.abs(novo.ano - fim) <= maxF){
                        this.fronteira.add(novo);
                    } 
                }
            }
            futuro = !futuro;
            max--;
        }    

        return "N";
    }
}

public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nA, nB;
        nA = input.nextInt();
        nB = input.nextInt();
        
        int[] a = new int[nA];
        int[] b = new int[nB];
        
        for(int i = 0; i < nA; i++ ) {
            a[i] = input.nextInt();
        }
        
        for(int i = 0; i < nB; i++ ) {
            b[i] = input.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int maxF = a[a.length - 1];
        int maxP = b[b.length - 1];

        
        BFS BFS = new BFS(a,b);
        
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            int anoI = input.nextInt();
            int anoF = input.nextInt();
            Vertice inicial = new Vertice(anoI);
            int max = Math.abs(anoI - anoF);
            System.out.println(BFS.bfs(inicial, anoF, maxP, maxF, max*2));
            
            
        }
        
        
        
    }
    
}
