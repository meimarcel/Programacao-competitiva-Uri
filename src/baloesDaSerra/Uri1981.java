/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baloesDaSerra;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author meimarcel
 */
public class Uri1981 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada[] = input.nextLine().split("");
        while(!entrada[0].equals("0")) {
            Map<String,Integer> map = new TreeMap<>();
            for(int i = 0; i < entrada.length; ++i) {
                if(!map.containsKey(entrada[i])) {
                    map.put(entrada[i],1);
                } else {
                    map.put(entrada[i], map.get(entrada[i]) + 1);
                }
            }
            Integer div[] = new Integer[map.size()];
            map.values().toArray(div);
            long cima = 1;
            long baixo = 1;
            int j = 0;
            for(int i = 1; i <= entrada.length; ++i) {
                cima *= i;
                if(j < div.length) {
                   baixo *= div[j];
                   j++;
                } 
                if((cima%baixo) == 0) {
                    cima = cima / baixo;
                    cima = cima % 100000007;
                    baixo = 1;
                }
                cima = cima;
            }
            System.out.println(cima);
            entrada = input.nextLine().split("");
            
        }
        
    }
    
}
