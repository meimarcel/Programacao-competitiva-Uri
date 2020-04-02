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
public class Uri3048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = input.nextInt();
        int res = 1;
        int ant = input.nextInt();
        for(int i = 1; i < tam; ++i) {
            int in = input.nextInt();
            if(in != ant) ++res;
            ant = in;
        }
        System.out.println(res);
        
    }
    
}
