/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author meimarcel
 */
public class Uri1234 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern PATTERN = Pattern.compile("[a-zA-Z]", Pattern.CASE_INSENSITIVE);
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split("");
            String palavra = "";
            boolean danca = true;
            for(int i = 0; i < entrada.length; ++i) {
                if(PATTERN.matcher(entrada[i]).matches()) {
                    if(danca) {
                        palavra += entrada[i].toUpperCase();
                        danca = false;
                    } else {
                        palavra += entrada[i].toLowerCase();
                        danca = true;
                    }
                } else {
                    palavra += entrada[i];
                }
            }
            System.out.println(palavra);
        }
    }
    
}
