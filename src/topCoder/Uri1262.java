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
public class Uri1262 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String rastro[] = input.nextLine().split("");
            int processo = input.nextInt();
            input.nextLine();
            int aux = 0;
            boolean cond = true;
            int ciclo = 0;
            for (String rastro1 : rastro) {
                if (rastro1.equals("W")) {
                    ciclo++;
                    aux = 0;
                    cond = true;
                } else {
                    aux++;
                }
                if(rastro1.equals("R") && cond) {
                    ciclo++;
                    cond = false;
                }
                if(aux == processo) {
                    aux = 0;
                    cond = true;
                }
            }
            System.out.println(ciclo);
            
        }
        
        
    }
    
}
