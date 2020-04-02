/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapLabsOnlineContest;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pessoas = 0;
        for(int i = 0; i < n; i++) {
            int entrada = input.nextInt();
            if(entrada == 1) {
                pessoas++;
            }
        }
        System.out.println(pessoas);
        
    }
    
}
