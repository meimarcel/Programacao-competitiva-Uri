/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1487 {
    
    public static int dp[];
    public static Brinquedo v[];

    public static int solve(int n) {
        dp = new int[n+1];
        dp[0] = 0;
        int maior = 0;
        for(int i = 1; i <= n; i++) {
            int aux = -1;
            for(int j = 0; j < v.length; j++) {
                if(i - v[j].tempo >= 0) {
                    if (aux < v[j].pontos + dp[i - v[j].tempo]) {
                        aux = v[j].pontos + dp[i - v[j].tempo];
                    }
                }
            }
            dp[i] = aux;
            if(aux > maior) {
                maior = aux;
            }
        }
        
        
        return maior;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caso = 1;
        int n = input.nextInt();
        int t = input.nextInt();
        while(n != 0 && t != 0) {
            v = new Brinquedo[n];
            for(int i = 0; i < n; i++) {
                v[i] = new Brinquedo(input.nextInt(), input.nextInt());
            }
            System.out.println("Instancia "+(caso++));
            System.out.println(solve(t));
            System.out.println();
            n = input.nextInt();
            t = input.nextInt();
            
        }
        
        
    }
    
}

class Brinquedo implements Comparable<Brinquedo> {
    
    public int tempo;
    public int pontos;
    
    public Brinquedo(int tempo, int pontos) {
        this.tempo = tempo;
        this.pontos = pontos;
    
    }

    @Override
    public int compareTo(Brinquedo b) {
        return (this.tempo < b.tempo) ? -1 : 1;
    }
        
    
}