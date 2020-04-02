/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiMaratonaDeProgramacaoDoNorte2019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author meimarcel
 */

class Cidade {
    public int cidade;
    public boolean cor;
    public List<Estrada> vizinhos = new ArrayList<>();
    
    public Cidade(int c) {
        this.cidade = c;
        this.cor = cor;
    }
    
    public void add_vizinho(Cidade v) {
        this.vizinhos.add(new Estrada(v));
    }
    
}

class Estrada {
    Cidade c;
    
    public Estrada(Cidade c) {
        this.c = c;
    }
}

class BFS1 {

    Queue<Cidade> fronteira;
    public BFS1() {

    }
    
    public void bfs(Cidade inicial,List<Integer> cidades) {
        this.fronteira = new LinkedList<>();
        this.fronteira.add(inicial);
        while(!this.fronteira.isEmpty()) {
            Cidade atual = this.fronteira.poll(); 
            for(Estrada e : atual.vizinhos){
                this.fronteira.add(e.c);
                if(cidades.indexOf(e.c.cidade) != -1) {
                    cidades.remove(e.c.cidade);
                }
                for(Estrada a: inicial.vizinhos) {
                    if(a.c.cidade == e.c.cidade) {
                        inicial.vizinhos.remove(a);
                    }
                }
            }
        }

    }
}


public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BFS1 BFS = new BFS1();
        int v = input.nextInt();
        int e = input.nextInt();
        int s = input.nextInt();
        List<Integer> cidade = new ArrayList<>();
        Cidade inicial = new Cidade(s);
        int cont = 0;
        for(int i = 0; i < e; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if(x != v) {
                cidade.add(x);
            } else {
                inicial.add_vizinho(new Cidade(y));
                cont++;
            }
        }
        for(int i : cidade) {
            inicial.add_vizinho(new Cidade(i));
            BFS.bfs(inicial, cidade);
        }
        
        System.out.println(inicial.vizinhos.size() - cont);
        
    }
    
}
