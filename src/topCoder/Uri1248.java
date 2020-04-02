/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author meimarcel
 */
public class Uri1248 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        while(n > 0) {
            String comida[] = input.nextLine().split("");
            String cafe[] = input.nextLine().split("");
            String almoco[] = input.nextLine().split("");
            Set<String> c = new HashSet<>();
            Set<String> ca = new HashSet<>();
            Set<String> al = new HashSet<>();
            for(String s : comida) {
                c.add(s);
            }
            for(String s : cafe) {
                ca.add(s);
            }
            for(String s : almoco) {
                al.add(s);
            }
            boolean cheater = false;
            for(String s : ca) {
                if(c.contains(s)) {
                    c.remove(s);
                } 
                else if(!s.equals("")){
                    cheater = true;
                    break;
                }
            }
            if(!cheater) {
                for(String s : al) {
                    if(c.contains(s)) {
                        c.remove(s);
                    } 
                    else if(!s.equals("")){
                        cheater = true;
                        break;
                    }
                }
            }
            if(cheater) {
                System.out.println("CHEATER");
            } else {
                String res[] = new String[c.size()]; 
                c.toArray(res);
                Arrays.sort(res);
                for(String s : res) {
                    System.out.print(s);
                }
                System.out.println();
            }
            
            
            --n;
        }
    }
    
}
