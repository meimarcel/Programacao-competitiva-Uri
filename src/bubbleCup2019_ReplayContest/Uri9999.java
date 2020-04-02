/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleCup2019_ReplayContest;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri9999 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        input.nextLine();
//        String entrada = input.nextLine();
//        boolean cond = false;
//        if(entrada.length()%n == 0) {
//            String valor[] = entrada.substring(0,n).split("");
//            if(n != entrada.length()) {
//                String valor2[] = entrada.substring(n,2*n).split("");
//                for(int i = 0; i < n; i++) {
//                    if(Integer.parseInt(valor[i]) > Integer.parseInt(valor2[i])) {
//                        cond = true;
//                        break;
//                    }
//                    if(Integer.parseInt(valor[i]) < Integer.parseInt(valor2[i])) break;
//                }
//            }
//            if(!cond) {
//                boolean fim = false;
//                for(int i = n-1; i >= 0; --i) {
//                    int novo = Integer.parseInt(valor[i]) + 1;
//                    if(novo < 10) {
//                        valor[i] = String.valueOf(novo);
//                        break;
//                    } else {
//                        valor[i] = "0";
//                    }
//                    if(i == 0) {
//                        fim = true;
//                    }
//                }
//                String res = String.join("",valor);
//                if(fim) {
//                    res = "1" + res.substring(0,res.length() - 1);
//                    for(int i = 0; i < (entrada.length()/n) + 1; i++) {
//                        System.out.print(res);
//                    }
//                } else {
//                    for(int i = 0; i < (entrada.length()/n); i++) {
//                        System.out.print(res);
//                    }
//                }
//            } else {
//                String res = String.join("",valor);
//                for(int i = 0; i < (entrada.length()/n); i++) {
//                    System.out.print(res);
//                }
//            }
//            System.out.println();
//        } else {
//            String aux = "1";
//            for(int i = 0; i < n-1; i++) {
//                aux += "0";
//            }
//            for(int i = 0; i < Math.ceil(entrada.length() / (double) n); i++) {
//                System.out.print(aux);
//            }
//            System.out.println();
//        }
         String a = "1";
         for(int i = 0; i <= Integer.MAX_VALUE;i++) {
             a += "0";
         }
         a += "0000";
         System.out.println(a.length());
        
    }
    
    
}
