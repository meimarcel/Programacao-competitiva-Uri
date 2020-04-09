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
public class Uri1393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0) {
            System.out.println(fbn(n));
            n = input.nextInt();
        }
    }
    
    public static long fbn(int n) {
        if( n == 1 || n == 0) return 1; 
        long aux = 1;
        long ant = 1;
        long res = aux + ant;
        for(int i = 2; i < n; ++i) {
            aux = ant;
            ant = res;
            res = ant + aux;
        } 
        return res;
    }
    
}
