/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapLabsOnlineContest;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author meimarcel
 */
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,String> regra = new TreeMap<>();
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        for(int i = 0; i < m; i++) {
            String entrada[] = input.nextLine().split(" ");
            regra.put(entrada[0], entrada[1]);
        }
        String bac[] = {"A"};
        for(int i = 0; i < n; i++) {
            String atual = "";
            for(int j = 0; j < bac.length; j++) {
                if(regra.get(bac[j]) != null) {
                    atual += regra.get(bac[j]);
                } else {
                    atual += bac[j];
                }
            }
            
            if(String.join("", bac).equals(atual)) {
                break;
            }
            
            atual = atual.replace("AB", "A,B");
            atual = atual.replace("BA", "B,A");
            bac = atual.split(",");
            
        }
        int A = 0;
        int B = 0;
        for(int i = 0; i < bac.length; i++) {
            if(bac[i].split("")[0].equals("A")) {
                A += bac[i].split("").length;
            }
            if(bac[i].split("")[0].equals("B")) {
                B += bac[i].split("").length;
            }
        }
        System.out.println(A+" "+B);
        
    }
    
}
