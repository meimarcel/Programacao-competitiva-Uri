/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

/**
 *
 * @author meimarcel
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class Produto {
    public int tipo;
    public int peso;
    
    public Produto(int t, int p) {
        this.tipo = t;
        this.peso = p;
    }
    
    public static Comparator<Produto> Comparator = new Comparator<Produto>() {
        public int compare(Produto p1, Produto p2) {
            int t1 = p1.tipo;
            int t2 = p2.tipo;
            return (t1 - t2);
        }
    };
}

public class Uri2004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        for(int i = 0; i < n; ++i) {
            
            int l = input.nextInt();
            List<Produto> list = new ArrayList<>();
            
            
            for(int j = 0; j < l; ++j) {
                int t = input.nextInt();
                int p = input.nextInt();
                list.add(new Produto(t,p));
            }
             
            Collections.sort(list, Produto.Comparator);
                    
            int valor = 0;
            int anterior = 1;
            int melhor = 0;     

            for(Produto prod : list){
                if(prod.tipo == anterior) {
                    if(prod.peso >= 10 && prod.peso <= 100 && melhor >= 10 && melhor <= 100 && prod.peso > melhor) {
                        melhor = prod.peso;
                    }
                    else if((prod.peso < 10 || prod.peso > 100) && (melhor < 10 || melhor > 100) && prod.peso > melhor ) {
                        melhor = prod.peso;
                    }
                    
                    else if((prod.peso>= 10 && prod.peso <= 100) && (melhor < 10 || melhor > 100 )) {
                        melhor = prod.peso;
                    }
                } else {
                    valor += melhor;
                    melhor = prod.peso;
                }
                anterior = prod.tipo;
            }
            valor += melhor;
            System.out.println(valor);
        }
         
    }
}
