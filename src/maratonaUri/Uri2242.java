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
public class Uri2242 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra[] = input.nextLine().split("");
        String risada = "";
        for(String s : palavra) {
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) risada += s;
        }
        String aux[] = risada.split("");
        int len = ((aux.length%2) == 0)? (aux.length / 2) + 1: aux.length / 2;
        int fim = aux.length - 1;
        boolean sim = true;
        for(int i = 0; i < len; ++i) {
            if(!aux[i].equals(aux[fim])){
                sim = false;
                break;
            }
            fim--;
        }
        if(sim) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
    }
}
