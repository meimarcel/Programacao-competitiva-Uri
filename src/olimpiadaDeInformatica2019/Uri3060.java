/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri3060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int p = input.nextInt();
        if((v%p) == 0) {
            int res = v/p;
            for(int i = 0; i < p; ++i) {
                System.out.println(res);
            }
        } else {
            int resto = v%p;
            int res = v/p;
            for(int i = 0; i < resto; ++i) {
                System.out.println(res+1);
            }
            int f = p - resto;
            for(int i = 0; i < f; ++i) {
                System.out.println(res);
            }
        }
        
    }
    
}
