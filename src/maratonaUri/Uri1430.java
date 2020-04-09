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
public class Uri1430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        while(!entrada.equals("*")) {
            String compo[] = entrada.split("/");
            int res = 0;
            for(String s : compo) {
                String notas[] = s.split("");
                double tempo = 0;
                for(String n : notas) {
                    if(n.equals("W")) tempo += 1;
                    else if(n.equals("H")) tempo += (1.0/2.0);
                    else if(n.equals("Q")) tempo += (1.0/4.0);
                    else if(n.equals("E")) tempo += (1.0/8.0);
                    else if(n.equals("S")) tempo += (1.0/16.0);
                    else if(n.equals("T")) tempo += (1.0/32.0);
                    else if(n.equals("X")) tempo += (1.0/64.0);
                }
                if(tempo == 1.0) ++res;
            }
            System.out.println(res);
            entrada = input.nextLine();
        }
    }
    
}
