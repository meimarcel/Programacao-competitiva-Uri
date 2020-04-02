/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20191;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author meimarcel
 */
public class Uri2962 {

    public static List<Sensor> sens = new ArrayList<>();

    public static Sensor baixo ;
    public static Sensor cima;
    public static Sensor esquerda;
    public static Sensor direita;
    
    public static boolean dfs(Sensor init) {
        Stack<Sensor> front = new Stack<>();
        init.visited = true;
        front.push(init);
        while(!front.isEmpty()) {
            Sensor atual = front.pop();
            
            if(atual == cima || atual == direita) {
                return true;
            }
            
            for(Sensor s : atual.linhas) {
                if(!s.visited) {
                    front.push(s);
                }
            }
            atual.visited = true;
            
        }
        return false;
    }
    
    public static void clear(List<Sensor> grafo) {
        for(Sensor s : grafo) s.visited = false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int k = input.nextInt();
        baixo = new Sensor(m,0,0);
        cima = new Sensor(0,n,0);
        esquerda = new Sensor(m,0,0);
        direita = new Sensor(0,n,0);
        for(int i = 0; i < k; i++) {
            Sensor novo = new Sensor(input.nextInt(), input.nextInt(), input.nextInt());
            for(Sensor s : sens) {
                if(Math.hypot((novo.x - s.x),(novo.y - s.y)) <= novo.r + s.r) {
                    s.linhas.add(novo);
                    novo.linhas.add(s);
                }
                
            }
            if(Math.hypot((novo.x - baixo.x), 0) <= novo.r) {
                novo.linhas.add(baixo);
                baixo.linhas.add(novo);
            }
            if(Math.hypot(novo.x, 0) <= novo.r) {
                novo.linhas.add(cima);
                cima.linhas.add(novo);
            }
            if(Math.hypot(0, novo.y) <= novo.r) {
                novo.linhas.add(esquerda);
                esquerda.linhas.add(novo);
            }
            if(Math.hypot(0, (novo.y - direita.y)) <= novo.r) {
                novo.linhas.add(direita);
                direita.linhas.add(novo);
            }
            sens.add(novo);
        }
        sens.add(esquerda);
        sens.add(direita);
        sens.add(cima);
        sens.add(baixo);
        boolean res = dfs(baixo);
        clear(sens);
        boolean res2 = dfs(esquerda);
        if(res || res2) {
            System.out.println("N");
        } else {
            System.out.println("S");
        }
        
        
        
    }
    
}

class Sensor {
    int x;
    int y;
    int r;
    boolean visited = false;
    List<Sensor> linhas = new ArrayList<>();
    public Sensor(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
}