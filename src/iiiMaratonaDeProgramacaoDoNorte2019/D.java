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

public class D {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int aux = n * 2;
        n = n * 4;
        n = n * aux;
        System.out.println(n);
        
        
    }
    
}
