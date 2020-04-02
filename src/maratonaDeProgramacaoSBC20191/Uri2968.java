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
public class Uri2968 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int n = input.nextInt();
        int p = v * n;
        for(int i = 1; i < 9; i++) {
            double k = i / 10.0;
            System.out.printf("%.0f ",Math.ceil(p*k));
        }
        System.out.printf("%.0f\n",Math.ceil(p*0.9));
    }
    
}
