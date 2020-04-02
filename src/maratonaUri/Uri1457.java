/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

/**
 *
 * @author meimarcel
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Uri1457 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < n; ++i) {
            String[] numero = input.nextLine().split("!", 2);
            int k = numero[1].length() + 1;
            int aux = Integer.parseInt(numero[0]);
            BigInteger valor = BigInteger.valueOf(Long.parseLong(numero[0]));
            
            for(int j = 1; j <= Integer.parseInt(numero[0]); j++) {
                int aux2 = j * k;
                if(aux2 >= aux) {
                    break;
                }
                valor = valor.multiply(BigInteger.valueOf(aux - aux2));
            }
            System.out.println(valor);
            
        }
        
    }
}
