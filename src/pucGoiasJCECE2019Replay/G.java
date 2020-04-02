/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucGoiasJCECE2019Replay;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int v = input.nextInt();
        double k = (double) m/ (double) n;
        int exercito1 = 0;
        int exercito2 = 0;
        
        for(int i = 0; i < v; ++i) {
            int x = input.nextInt();
            int y = input.nextInt();
            int h = input.nextInt();
            if((k*(n-x)-m+y) > 0) {
                exercito1 += h;
            } else {
                exercito2 += h;
            }
        }
        System.out.println(exercito1 + " "+exercito2);
        
        
    }
    
}
