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

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = 0;
        long div = 2;
        while(div * div <= n ) {
            if(n % div == 0) {
                while(n % div == 0){
                    n /= div;
                }
                k++;
            }
            div++;
            
        }
        if(n!= 1) k++;
        System.out.println((int)(Math.pow(2,k))-(k+1));
    }
}
