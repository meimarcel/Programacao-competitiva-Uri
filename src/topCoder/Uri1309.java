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
public class Uri1309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLong()) {
            long dolar = input.nextLong();
            long cents = input.nextLong();
            String valor = "";
            if(dolar >= 1000) {
                long aux = (dolar%1000);
                valor = ((aux >= 100) ? String.valueOf(aux) : "0"+((aux >= 10)? String.valueOf(aux) : "0"+String.valueOf(aux)));
                dolar /= 1000;
                while(dolar > 1000) {
                    aux = (dolar%1000);
                    valor = ((aux >= 100) ? String.valueOf(aux) : "0"+((aux >= 10)? String.valueOf(aux) : "0"+String.valueOf(aux)))+","+valor;
                    dolar /= 1000;
                }
                valor = "$"+String.valueOf(dolar)+","+valor;
            } else {
                valor = "$"+String.valueOf(dolar);
            }
            valor += "."+((cents >= 10) ? String.valueOf(cents) : "0"+String.valueOf(cents));
            System.out.println(valor);
        }
    }
    
}
