/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetex2019;

/**
 *
 * @author meimarcel
 */

import java.util.Comparator;
import java.util.Scanner;
import java.util.PriorityQueue;

class Horario {
    public int in;
    public int out;
    
    public Horario(int in, int out) {
        this.in  = in;
        this.out = out;
    }
    
    public static Comparator<Horario> Comparator = new Comparator<Horario>() {
        public int compare(Horario h1, Horario h2) {
            int v1 = h1.out;
            int v2 = h2.out;
            
            return (v1 - v2);
        }
    };
}


public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        PriorityQueue<Horario> lista = new PriorityQueue<>(Horario.Comparator);
        for(int i = 0; i < n; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            lista.add(new Horario(a,b));
        }
        Horario anterior = lista.poll();
        int min = anterior.out - anterior.in;
        for(int i = 1; i < n; ++i) {
            Horario atual = lista.poll();
            int aux = atual.out - atual.in;
            if(aux > min){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                if(anterior.in > atual.in) {
                    aux = atual.out - anterior.in;
                }
                if(aux > min) {
                    min = aux;
                }
            }
            anterior = atual;
        }
        System.out.println(min);
    }
}

