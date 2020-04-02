/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author meimarcel
 */
public class Uri1029 {
    public static int dpn[] = new int[40], dpx[] = new int[40];
    
    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(dpn[n] != 0) return dpn[n];
        
        dpn[n] = fib(n - 1) + fib(n - 2);
        dpx[n] = dpx[n - 1] + dpx[n - 2] + 2;
        
        return dpn[n];
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        dpx[0] = 0;
        dpx[1] = 0;
        dpx[2] = 2;
        
        
        int t = Integer.valueOf(input.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.valueOf(input.readLine());
            int res = fib(n);
            System.out.printf("fib(%d) = %d calls = %d\n",n,dpx[n],res);
        }
    }
    
}
