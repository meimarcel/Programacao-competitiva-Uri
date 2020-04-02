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

import java.util.Scanner;

public class Uri2251 {
    
    public static int hanoi(int n, int o, int d, int t) {
        if(n == 1) {
            return 1;           
        }
        int i = 1;
        i += hanoi(n-1, o, t, d);
        i += hanoi(n-1, t, d, o);
        return i;
    }

    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int teste = 1;
        while(n != 0) {
            System.out.println("Teste "+teste);
            System.out.println((long)Math.pow(2,n) - 1);
            System.out.println();
            teste++;
            n = input.nextInt();
        }
    }
}
