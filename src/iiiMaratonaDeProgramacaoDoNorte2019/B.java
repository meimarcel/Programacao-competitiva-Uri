/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiMaratonaDeProgramacaoDoNorte2019;

/**
 *
 * @author meimarcel
 */

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] gramas = {300,1500,600,1000,150};
        int resposta = 0;
        
        for(int i = 0; i < 5; i++) {
            resposta += (input.nextInt() * gramas[i]);
        }
        resposta += 225;
        System.out.println(resposta);
       
    }
    
}
