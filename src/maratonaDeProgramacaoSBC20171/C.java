/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20171;

/**
 *
 * @author meimarcel
 */

import java.util.Scanner;

public class C {
    
    public static double gcd(double a, double b) {
        double resto = a%b;
        while(resto != 0) {
            a = b;
            b = resto;
            resto = a%b;
            
        }
        return b;
    }
    
    public static double lcm(double a, double b) {
        return ((a * b)/ gcd(a,b));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,l;
        n = input.nextInt();
        l = input.nextInt();
        double t = 1;
        for(int i = 0; i  < n; ++i) {
            int c = input.nextInt();
            t = lcm(t, c);
        }
        
        int best = 1;
        double best_lcm = t;
        
        for(int v = 2; v <= l; ++v) {
            double lcm_v = lcm(t,v);
            if (lcm_v <= l && lcm_v > best_lcm) {
                best_lcm = lcm_v;
                best = v;
            }
        }
        
        System.out.println(best);
        
    }
    
}
