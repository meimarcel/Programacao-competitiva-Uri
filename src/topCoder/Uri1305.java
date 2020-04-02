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
public class Uri1305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextDouble()) {
            double num = input.nextDouble();
            double corte = input.nextDouble();
            double aux = num - (int) num;
            if(aux >= corte) {
                System.out.println((int) num + 1);
            } else {
                System.out.println((int) num);
            }
            
        }

    }
}
