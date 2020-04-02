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
public class Uri1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int init = input.nextInt();
        int fim = input.nextInt();
        if(init == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            if(fim < init) {
                System.out.printf("O JOGO DUROU %d HORA(S)\n",(fim+24 - init));
            } else {
                System.out.printf("O JOGO DUROU %d HORA(S)\n",(fim - init));
            }
        }
        
    }
    
}
