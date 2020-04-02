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
public class Uri2880 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String segredo[] = input.nextLine().split("");
        String palavra[] = input.nextLine().split("");
        int res = 0;
        boolean valido = true;
        for(int i = 0; i <= segredo.length - palavra.length; ++i) {
            for(int j = 0; j < palavra.length; ++j) {
                if(segredo[i + j].equals(palavra[j])) {
                    valido = false;
                    break;
                }
            } 
            if(valido) {
                res++;
            }
            valido = true;
        }
        System.out.println(res);
        
        
    }
    
}
