/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1244 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        while(n > 0) {
            String linha[] = input.nextLine().split(" ");
            Arrays.sort(linha, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return(s1.length() > s2.length())? -1: (s1.length() == s2.length()? 0 : 1);
                }
            });
            boolean first = true;
            for(String s : linha) {
                if(first) {
                    System.out.print(s);
                    first = false;
                } else {
                    System.out.print(" "+s);
                }
            }
            System.out.println();
            
            --n;
        }
    }
    
}
