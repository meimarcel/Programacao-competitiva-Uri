/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20171;


import java.util.*;
/**
 *
 * @author meimarcel
 */

class Cidade {
    public int cidade;
    public int peso;
    public boolean cor;
    public List<Estrada> vizinhos = new ArrayList<>();
    
    public Cidade(int c, int peso,boolean cor) {
        this.cidade = c;
        this.cor = cor;
        this.peso = peso;
    }
    
    public void add_vizinho(Cidade v, int dist) {
        this.vizinhos.add(new Estrada(v,dist));
    }
    
}

class Estrada {
    public Cidade c;
    public int dist;
    
    public Estrada(Cidade c, int dist) {
        this.c = c;
        this.dist = dist;
    }
}

class DFS {
    public int cc;
    
    public DFS(int c) {
        this.cc = c;
    }
    
    public long dfs(Cidade pai) {
        long distancia = 0;
        pai.cor = false;
            for(Estrada i : pai.vizinhos) {
                if(i.c.cor){
                    distancia += dfs(i.c);
                    distancia += (2 * Math.floor(((i.c.peso + this.cc - 1) / this.cc)) * i.dist);
                    pai.peso += i.c.peso;
                }
            }
        return distancia;
    }
}

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = input.nextInt();
        DFS dfs = new DFS(c);
        Cidade[] grafo = new Cidade[n];
        
        for(int i = 0; i < n; ++i) {
            int peso = input.nextInt();
            grafo[i] = new Cidade(i,peso,true);
        }
        
        for(int i = 1; i < n; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            int d = input.nextInt();
            grafo[(a-1)].add_vizinho(grafo[(b-1)], d);
            grafo[(b-1)].add_vizinho(grafo[(a-1)], d);
        }
        
        long distancia = dfs.dfs(grafo[0]);
        System.out.println(distancia);
        input.close();
       
    }
}