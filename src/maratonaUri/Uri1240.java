/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1240 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        while(n > 0) {
            String entrada[] = input.nextLine().split(" ");
            String n1[] = entrada[0].split("");
            String n2[] = entrada[1].split("");
            if(n2.length > n1.length) {
                System.out.println("nao encaixa");
            } else {
                int j = 0;
                String res = "encaixa";
                for(int i = (n1.length - n2.length); i < n1.length; ++i) {
                    if(!n1[i].equals(n2[j])) {
                        res = "nao encaixa";
                        break;
                    }
                    j++;
                }
                System.out.println(res);
            }
            --n;
        }
        
    }
    
}
