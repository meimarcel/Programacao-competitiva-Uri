/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1276 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String entrada = input.nextLine();
            if(entrada.equals("")) {
                System.out.println();
            } else {
                entrada = entrada.replace(" ", "");
                char palavra[] = entrada.toCharArray();
                Arrays.sort(palavra);
                int ant = (int) palavra[0];
                int init = (int) palavra[0];
                for(int i = 1; i < palavra.length; i++) {
                    if(palavra[i] > ant + 1) {
                        System.out.print((char) init+":"+palavra[i-1]+", ");
                        init = palavra[i];
                    }
                    ant = palavra[i];
                }
                System.out.println((char)init+":"+palavra[palavra.length - 1]);
                
            }
            
            
        }
    }
}
