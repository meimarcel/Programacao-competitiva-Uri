/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1831 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caso = 1;
        while(input.hasNextInt()) {
            int r1 = input.nextInt();
            int l1 = input.nextInt();
            int r2 = input.nextInt();
            int l2 = input.nextInt();
            int r3 = input.nextInt();
            int l3 = input.nextInt();
            long N1 = 0,  N2 = 0, N3 = 0;
            long res = 0;
            N1 = l2*l3;
            N2 = l1*l3;
            N3 = l1*l2;
            res = ((r1 * N1 * (N1%l1)) + (r2 * N2 * (N2%l2)) + (r3 * N3 * (N3%l3))) % (l1*l2*l3);
            System.out.printf("Caso #%d: %d laranja(s)\n",caso++,res);
            
            
        }
            
        
    }
    
}
