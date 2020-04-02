/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaDeProgramacaoSBC20181;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri2879 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = 0;
        while(n > 0) {
            int porta = input.nextInt();
            if(porta != 1) {
                res++;
            }
            --n;
        }
        System.out.println(res);
        
    }
    
}
