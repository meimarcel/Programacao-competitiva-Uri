/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baloesDaSerra;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1980 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        while(!n.equals("0")) {
            long val = 1;
            for(int i = 1; i <= n.length(); ++i) {
                val *= i;
            }
            System.out.println(val);
            n = input.nextLine();
        }
        
    }
    
}
