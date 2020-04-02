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
public class Uri1060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;
        for(int i = 0; i < 6; ++i) {
            double n = input.nextDouble();
            if(n > 0.0) {
                res++;
            }
        }
        
        System.out.println(res+" valores positivos");
        
    }
    
}
