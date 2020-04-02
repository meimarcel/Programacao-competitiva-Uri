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
public class Uri1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ih = input.nextInt();
        int im = input.nextInt();
        int fh = input.nextInt();
        int fm = input.nextInt();
        if(ih == fh && im == fm) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if(ih == fh) {
                if(im < fm)
                    System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n",(fm - im));
                else
                    System.out.printf("O JOGO DUROU 23 HORA(S) E %d MINUTO(S)\n", (fm + 60 - im));
            } 
            else if(ih < fh) {
                if(im < fm) 
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(fh - ih),(fm - im));
                else
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(fh - ih - 1), (fm + 60 - im));
            } else {
                if(im < fm) 
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(fh + 24 - ih),(fm - im));
                else
                    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(fh + 23 - ih), (fm + 60 - im));
            }
        }
        
    }
    
}
