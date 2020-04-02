/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l[] = new double[3];
        l[0] = input.nextDouble();
        l[1] = input.nextDouble();
        l[2] = input.nextDouble();
        Arrays.sort(l);
        if(l[2] >= l[1] + l[0]) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if((l[2]*l[2]) == ((l[1] * l[1])+(l[0] * l[0]))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if((l[2]*l[2]) > ((l[1] * l[1])+(l[0] * l[0]))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if((l[2]*l[2]) < ((l[1] * l[1])+(l[0] * l[0]))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(l[0] == l[1] && l[1] == l[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            } else {
                if((l[0] == l[1]) || (l[0] == l[2]) || (l[1] == l[2])) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
        
        
    }
    
}
