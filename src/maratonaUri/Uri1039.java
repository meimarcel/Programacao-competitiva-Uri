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
public class Uri1039 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String[] entrada = input.nextLine().split(" ");
            int r1 = Integer.parseInt(entrada[0]);
            int x1 = Integer.parseInt(entrada[1]);
            int y1 = Integer.parseInt(entrada[2]);
            int r2 = Integer.parseInt(entrada[3]);
            int x2 = Integer.parseInt(entrada[4]);
            int y2 = Integer.parseInt(entrada[5]);
            if(Math.hypot(x1-x2, y1-y2) <= r1-r2) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
            
        }
    }
}
