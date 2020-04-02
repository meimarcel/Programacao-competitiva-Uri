/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baloesDaSerra;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1979 {
    
    public static List<Aluno> grafo;
    
    public static String bfs(Aluno init) {
        Queue<Aluno> front = new ArrayDeque<>();
        init.sala = 1;
        init.visited = true;
        front.add(init);
        while(!front.isEmpty()) {
            Aluno atual = front.poll();
            for(Aluno a : atual.amigos) {
                if(!a.visited) {
                    if(a.sala == atual.sala) {
                        return("NAO");
                    } else {
                        a.sala = atual.sala * -1;
                        front.add(a);
                    }
                }
            }
            atual.visited = true;
        }
        return "SIM";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        while(n != 0) {
            grafo = new ArrayList<>();
            for(int i = 0; i < n; ++i) {
                grafo.add(new Aluno(0));
            }
            for(int i = 0; i < n; ++i) {
                int aluno = input.nextInt() - 1;
                input.nextLine();
                String amigos[] = input.nextLine().split(" ");
                for(String a : amigos) {
                    grafo.get(aluno).amigos.add(grafo.get(Integer.parseInt(a) - 1));
                }
            }
            System.out.println(bfs(grafo.get(0)));
            n = input.nextInt();
        }
        
    }
    
}

class Aluno {
    public int sala;
    public boolean visited;
    public List<Aluno> amigos = new ArrayList<>();
    public Aluno(int sala) {
        this.sala = sala;
        this.visited = false;
    }
    
}