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
public class Uri1310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()) {
            int n = input.nextInt();
            int m = input.nextInt();
            int v[] = new int[n];
            for(int i = 0; i < n; i++) {
                v[i] = input.nextInt();
            }
            int maior = 0;
            for(int i = 0; i < n; i++) {
                int soma = 0;
                for(int j = i; j < n; j++) {
                    soma += v[j];
                    int total = soma - ((j - i + 1) * m);
                    if(total > maior) {
                        maior = total;
                    }
                }
            }
            System.out.println(maior);
        }
    }
}
