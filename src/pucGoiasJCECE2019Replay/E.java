/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucGoiasJCECE2019Replay;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String texto = input.nextLine();
            texto = texto.replace(" ,", ",");
            texto = texto.replace(" .", ".");
            System.out.println(texto);

        }
    }
}
