/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1235 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        while(n > 0) {
            String palavra[] = input.nextLine().split("");
            
            int meio = (((palavra.length%2) == 0 )? palavra.length-1 : palavra.length -2) / 2;
            String init = "";
            String fim = "";
            int a = palavra.length - 1;
            for(int i = meio; i >= 0 || a > meio; --i) {
                if(i >= 0) {
                    init += palavra[i];
                }
                if(a > meio) {
                    fim += palavra[a];
                }
                --a;
            }
            
            System.out.println(init + fim);
            --n;
        }
    }
    
}
