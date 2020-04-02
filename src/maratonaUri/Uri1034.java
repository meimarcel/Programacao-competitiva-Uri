/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1034 {
    public static long dp[] = new long[1000100];
    
    public static int v[];
    
    public static long solve(int n) {
        dp[0] = 0;
        for(int j = 1; j <= n; j++) {
            dp[j] = 1000100;
            for(int i = 0; i < v.length; i++) {
                if(j - v[i] >= 0) {
                    long aux = 1 + dp[j-v[i]];
                    dp[j] = Math.min(aux, dp[j]);
                }

            }
        }
        
        return dp[n];
        
    }
    
    
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in); 
        int t = input.nextInt();
        for(int i = 0; i < t; i++) {
            dp = new long[1000100];
            int n = input.nextInt();
            int m = input.nextInt();
            v = new int[n];
            for(int j = 0; j < n; j++) {
                v[j] = input.nextInt();
            }
            System.out.println(solve(m));
            
        }
        
    }
    
    
}
