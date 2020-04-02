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
public class Uri1051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();
        if(val <= 2000.00) {
            System.out.println("Isento");
        } 
        else if(val <= 3000.00) {
            val = val - 2000.00;
            double imp = val * 0.08;
            System.out.printf("R$ %.2f\n",imp);
        }
        else if(val <= 4500.00) {
            double val1 = 1000.00 * 0.08;
            val = val - 3000.00;
            double imp = val * 0.18;
            System.out.printf("R$ %.2f\n",imp+val1);
        } else {
            double val1 = 1000.00 * 0.08;
            double val2 = 1500.00 * 0.18;
            val = val - 4500.00;
            double imp = val * 0.28;
            System.out.printf("R$ %.2f\n",imp+val1+val2);
        }
    }
    
}
