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
public class Uri1273 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean first = true;
        while(n != 0) {
            input.nextLine();
            String palavra[] = new String[n];
            int maior = 0;
            for(int i = 0 ; i < n; ++i) {
                palavra[i] = input.nextLine();
                maior = Math.max(maior, palavra[i].length());
            }
            if(!first) {
                System.out.println("");
            }
            for(int i = 0; i < n; i++) {
                String aux = "";
                for(int j = 0; j < maior - palavra[i].length(); j++) {
                    aux += " ";
                }
                System.out.println(aux+palavra[i]);
            }
            first = false;
            n = input.nextInt();
        }
    }
    
}
