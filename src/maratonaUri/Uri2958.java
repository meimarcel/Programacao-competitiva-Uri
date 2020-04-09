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
public class Uri2958 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        List<String> v = new ArrayList<>();
        List<String> d = new ArrayList<>();
        
        for(int i = 0; i < n; ++i) {
            String entrada[] = input.nextLine().split(" ");
            for(String s : entrada) {
                String aux[] = s.split("");
                if(aux[1].equals("V")) {
                    v.add(s);
                } else{
                    d.add(s);
                }
            }
        }
        Collections.sort(v, Collections.reverseOrder());
        Collections.sort(d, Collections.reverseOrder());
        for(String s : v) {
            System.out.println(s);
        }
        for(String s : d) {
            System.out.println(s);
        }
    }
    
}
