/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1237 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String p1[] = input.nextLine().split("");
            String p2 = input.nextLine();
            int res = 0;
            for(int i = 0; i < p1.length; ++i) {
                String aux = "";
                bloco: 
                for(int j = i; j < p1.length; ++j) {
                    aux += p1[j];
                    String verifica = p2.replace(aux,"0");
                    if(verifica.contains("0")) {
                        res = Math.max(res, (j-i+1));
                    } else {
                        break bloco;
                    }
                }
                
            }
            System.out.println(res);

        }
    }
    
}
