/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

/**
 *
 * @author meimarcel
 */

import java.util.Scanner;

public class Uri1323 {
    public static int[] memo = new int[101];
    
    public static int calcula(int num) {
        if(memo[num] != 0) {
            return memo[num];
        }
        
        if(num == 1) {
            return 1;
        }
        
        memo[num] = num * num + calcula(num - 1);
        return memo[num];
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        while(n != 0) {
            System.out.println(calcula(n));
            n = input.nextInt();
        }
        
    }
}
