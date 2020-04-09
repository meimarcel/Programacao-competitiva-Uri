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
public class Uri1170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; ++i) {
            double k = input.nextDouble();
            int res = 0;
            while(k > 1) {
                k /= 2;
                ++res;
            }
            System.out.println(res+" dias");
        }
    }
    
}
