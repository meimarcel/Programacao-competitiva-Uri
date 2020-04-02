/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */

public class Uri1263 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String[] entrada = input.nextLine().split(" ");
            int aliteracoes = 0;
            boolean controle = true;
            char ant = entrada[0].toLowerCase().charAt(0);
            for(int i = 1; i < entrada.length; i++) {
                if(entrada[i].toLowerCase().charAt(0) == ant && controle) {
                    ++aliteracoes;
                    controle = false;
                } 
                if (entrada[i].toLowerCase().charAt(0) != ant) {
                    ant = entrada[i].toLowerCase().charAt(0);
                    controle = true;
                }
            }
            System.out.println(aliteracoes);
        }
        
    }
    
}
