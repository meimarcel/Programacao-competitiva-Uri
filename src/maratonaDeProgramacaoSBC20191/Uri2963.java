/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20191;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri2963 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = input.nextInt();
        boolean da = true;
        for(int i = 1; i < n; i++) {
            int entrada = input.nextInt();
            if(entrada > b) {
                da = false;
            }
        }
        if(da) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
    }
    
}
