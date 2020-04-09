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
public class Uri1796 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = input.nextInt();
        int s = 0;
        int n = 0;
        for(int i = 0;i < j; ++i) {
            int entrada = input.nextInt();
            if(entrada == 0) {
                s++;
            } else {
                n++;
            }
        }
        if(s > n) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        
    }
    
}
