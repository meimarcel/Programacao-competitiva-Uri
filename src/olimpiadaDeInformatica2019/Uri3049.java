/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri3049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = input.nextInt();
        int t = input.nextInt();
        int a = o + t;
        int b = (160 - o) + (160 - t);
        if(a > b) System.out.println(1);
        else if(b > a) System.out.println(2);
        else System.out.println(0);
        
    }
    
}
