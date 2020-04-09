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
public class Uri2728 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split("-");
            int estado = 1;
            for(String e : entrada) {
                String l[] = e.split("");
                String init = l[0];
                String fim = l[l.length-1];
                if((init.toLowerCase().equals("c") || fim.toLowerCase().equals("c")) && estado == 1) estado = 2;
                else if((init.toLowerCase().equals("o") || fim.toLowerCase().equals("o")) && estado == 2) estado = 3;
                else if((init.toLowerCase().equals("b") || fim.toLowerCase().equals("b")) && estado == 3) estado = 4;
                else if((init.toLowerCase().equals("o") || fim.toLowerCase().equals("o")) && estado == 4) estado = 5;
                else if((init.toLowerCase().equals("l") || fim.toLowerCase().equals("l")) && estado == 5) estado = 6;
                else break;
                
            }
            if(estado == 6) {
                System.out.println("GRACE HOPPER");
            } else {
                System.out.println("BUG");
            }
        }
    }
    
}
