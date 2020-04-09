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
public class Uri1793 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0) {
            int res = 10;
            int p = input.nextInt();
            int ant = p + 10;
            for(int i = 1; i < n; ++i) {
                p = input.nextInt(); 
                if(p <= ant) {
                    res += 10 + (p - ant);
                    ant = p + 10;
                } else {
                    res += 10;
                    ant = p + 10;
                }
                 
            }
            System.out.println(res);
            n = input.nextInt();
        }
    }
}
