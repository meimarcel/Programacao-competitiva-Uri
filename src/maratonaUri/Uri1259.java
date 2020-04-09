/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1259 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            int entrada = input.nextInt();
            if((entrada%2) == 0) {
                par.add(entrada);
            } else {
                impar.add(entrada);
            }
        }
        Collections.sort(par);
        Collections.sort(impar, Collections.reverseOrder());
        for(int i : par) {
            System.out.println(i);
        }
        for(int i : impar){
            System.out.println(i);
        }
    }
    
}
