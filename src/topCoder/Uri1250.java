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
public class Uri1250 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0) {
            int t = input.nextInt();
            int tiros[] = new int[t];
            for(int i = 0; i < t; i++) {
                tiros[i] = input.nextInt();
            }
            input.nextLine();
            String estado[] = input.nextLine().split("");
            int res = 0;
            for(int i = 0; i < t; i++) {
                if(tiros[i] > 2 && estado[i].equals("J")) res++;
                if(tiros[i] <= 2 && estado[i].equals("S")) res++;
            }
            System.out.println(res);
            --n;
        }
        
        
    }
    
}
