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
import java.util.PriorityQueue;
import java.util.Scanner;

class Caixa{
    int c;
    int l;
    int h;
    
    public Caixa(int a, int b, int c) {
        this.c = a;
        this.l = b;
        this.h = c;
    }
     public static Comparator<Caixa> Comparator = new Comparator<Caixa>() {
        public int compare(Caixa h1, Caixa h2) {
            int v1 = h1.c;
            int v2 = h2.c;
            
            return (v1 - v2);
        }
    };

}

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        PriorityQueue<Caixa> lista = new PriorityQueue<>(Caixa.Comparator);
        
        for(int i = 0; i < n; ++i) {
            int c = input.nextInt();
            int l = input.nextInt();
            int h = input.nextInt();
            lista.add(new Caixa(c,l,h));
        }
        boolean sim = true;
        Caixa anterior = lista.poll();
        for(int i = 1; i < n; ++i) {
            Caixa atual = lista.poll();
            if((anterior.c < atual.c && anterior.h < atual.h && anterior.l < atual.l) ||
                    (anterior.c < atual.h && anterior.h < atual.c && anterior.l < atual.l) ||
                    (anterior.c < atual.h && anterior.h < atual.l && anterior.l < atual.c) ||
                    (anterior.c < atual.l && anterior.h < atual.h && anterior.l < atual.c) ||
                    (anterior.c < atual.l && anterior.h < atual.c && anterior.l < atual.h) || 
                    (anterior.c < atual.c && anterior.h < atual.l && anterior.l < atual.h)){
            } else {
                sim = false;
                break;
            }
            anterior = atual;
        }
        
        if(sim == true) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }    
}
