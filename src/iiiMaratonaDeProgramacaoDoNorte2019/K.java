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

import java.util.Arrays;
import java.util.Scanner;
import static maratonaUri.Uri1202.CICLO;
public class K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] bin = input.nextLine().split("");
        int n = input.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        int[] decimal = new int[n];
        
        for(int j = 0; j < bin.length; j++) {
            for(int i = 0; i < n; i++) {
                decimal[i] *= 2;
                decimal[i] += Integer.parseInt(bin[j]);

                decimal[i] %= num[i];
            }
        }
        
        boolean existe = false;

        for(int a = 0; a < n; a++) {
            if(decimal[a] == 0) {
                System.out.print(num[a]+" ");
                existe = true;
            }
        }
        
        if(existe == false) {
            System.out.print("Nenhum");
        }
        System.out.println();
        
    }
}
