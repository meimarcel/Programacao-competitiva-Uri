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
public class Uri1089 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0) {
            int primeiro = input.nextInt();
            int ant = primeiro;
            int res = 0;
            boolean cond = true;
            boolean condInit = true;
            boolean first = true;
            int entrada = 0;
            for(int i = 1 ; i < n; ++i) {
                entrada = input.nextInt();
                if(first) {
                    if(entrada > ant){ cond = false; condInit = false;}
                    else if(entrada < ant){ cond = true; condInit = true;}
                    first = false;
                }
                if(entrada > ant && cond == false) {
                    ++res;
                    cond = true;
                }
                else if(entrada < ant && cond == true) {
                    ++res;
                    cond = false;
                }
                ant = entrada;
            }
            if(primeiro > entrada && cond == false && cond != condInit) {
                ++res;
            } 
            else if(primeiro < entrada && cond == true && cond != condInit) {
                ++res;
            }
            System.out.println(res);
            n = input.nextInt();
        }
    }
    
}
