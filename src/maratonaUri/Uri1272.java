/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

/**
 *
 * @author meimarcel
 */

import java.util.Scanner;

public class Uri1272 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; ++i) {
            String[] palavra = input.nextLine().split(" ");
            String codigo = "";
            for(String letra: palavra) {
                if(letra != " ") {
                    codigo += letra.split("")[0];
                }
            }
            System.out.println(codigo);
        }
        
    }
}
