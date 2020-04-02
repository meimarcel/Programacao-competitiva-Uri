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

public class Uri2033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            double c = Double.parseDouble(input.nextLine());
            double i = Double.parseDouble(input.nextLine());
            double t = Double.parseDouble(input.nextLine());
            
            double juros_simples = c*i*t;
            double juros_composto = c*(Math.pow(1 + i, t)) - c;
            double diferença = juros_composto - juros_simples;
            
            System.out.printf("DIFERENCA DE VALOR = %.2f\n" ,diferença);
            System.out.printf("JUROS SIMPLES = %.2f\n", juros_simples);
            System.out.printf("JUROS COMPOSTO = %.2f\n",juros_composto);
                      
        }
        
    }
}
