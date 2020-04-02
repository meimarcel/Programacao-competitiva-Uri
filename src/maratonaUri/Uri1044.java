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
public class Uri1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if(n > m) {
            if(n % m == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if(m % n == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
        
    }
    
}
