/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri3062 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        Map<Integer,List<Integer>> lista = new HashMap<>();
        for(int i = 0; i < m; ++i) {
            int key = input.nextInt();
            int value = input.nextInt();
            if(lista.containsKey(key)) {
                lista.get(key).add(value);
            } else {
                lista.put(key, Arrays.asList(value));
            }
        }
      
        
    }
    
}
