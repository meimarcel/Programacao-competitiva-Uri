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
public class Uri1239 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split("");
            String palavra = "";
            boolean abreI = true;
            boolean abreB = true;
            for(int i = 0; i < entrada.length; i++) {
                if(entrada[i].equals("_")) {
                    if(abreI) {
                        palavra += "<i>";
                        abreI = !abreI;
                    } else {
                        palavra += "</i>";
                        abreI = !abreI;
                    }
                }
                else if(entrada[i].equals("*")) {
                    if(abreB) {
                        palavra += "<b>";
                        abreB = !abreB;
                    } else {
                        palavra += "</b>";
                        abreB = !abreB;
                    }
                } else {
                    palavra += entrada[i];
                }
            }
            System.out.println(palavra);
            
        }
    }
}
