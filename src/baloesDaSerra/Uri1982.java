/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baloesDaSerra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author meimarcel
 */
public class Uri1982 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int A = input.nextInt();
        int R = input.nextInt();
        while(P != 0 && A != 0 && R != 0) {
            input.nextLine();
            List<String> perolas = new ArrayList<>();
            PriorityQueue<A> lista = new PriorityQueue<>();
            for(int i = 0; i < P; ++i) {
                perolas.add(input.nextLine());
            }
            for(int i = 0; i < A; ++i) {
                String aluno = input.nextLine();
                int cont = 0;
                for(int j = 0; j < R; ++j) {
                    String resposta = input.nextLine();
                    if(perolas.contains(resposta)) {
                        cont++;
                    }
                }
                lista.add(new A(aluno, cont));
            }
            Set<String> res = new TreeSet<>();
            A maior = lista.poll();
            res.add(maior.nome);
            for(A a : lista) {
                if(a.p == maior.p){
                    res.add(a.nome);
                } else {
                    break;
                }
            }
            
            
            boolean first = true;
            for(String n : res) {
                if(first) 
                    System.out.print(n);
                else 
                    System.out.print(", "+n);
                first = false;
            }
            System.out.println();
            P = input.nextInt();
            A = input.nextInt();
            R = input.nextInt();
            
        }
        
    }
    
}

class A implements Comparable<A>{
    public String nome;
    public int p;
    public A(String nome, int p) {
        this.nome = nome;
        this.p = p;
    }

    @Override
    public int compareTo(A a) {
        return (this.p > a.p)? -1 : 1;
    }
    
    
}
