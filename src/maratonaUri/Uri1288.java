/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */

public class Uri1288 {
    
    public static int dp[][];
    
    public static Bala lista[];
    
    public static int solve(int n, int m) {
        dp = new int[n+1][m+1];
        for(int i = 1; i <= n; i++) {
            Bala autal = lista[i - 1];
            for(int j = 1; j <= m; j++) {
                if(autal.peso <= j) {
                    dp[i][j] = Math.max((autal.poder + dp[i-1][j-autal.peso]), dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }  
        return dp[n][m];
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++) {
            int n = input.nextInt();
            lista = new Bala[n];
            for(int j = 0; j < n; j++) {
                lista[j] = new Bala(input.nextInt(), input.nextInt());
            }
            int m = input.nextInt();
            int resistencia = input.nextInt();
            Arrays.sort(lista);
            
            int res = solve(n,m);
                      
            if(res >= resistencia) System.out.println("Missao completada com sucesso");
            else System.out.println("Falha na missao"); 
            
        }
        
    }
    
}

class Bala implements Comparable<Bala>{
    public int peso;
    public int poder;
    
    public Bala(int poder, int peso) {
        this.peso = peso;
        this.poder = poder;
    }

    @Override
    public int compareTo(Bala b) {
        return (this.peso == b.peso) ?  ((this.poder < b.poder) ? -1 : 1) :  ((this.peso < b.peso)? -1 : 1);
    }
    
}
