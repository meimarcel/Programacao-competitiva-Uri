/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapLabsOnlineContest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int alunos = 0;
        
        for(int i = 0; i < n; i++) {
            int entrada  = input.nextInt();
            if(entrada <= 0) {
                alunos++;
            }
        }
        if(alunos >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
