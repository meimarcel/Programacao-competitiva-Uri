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
public class Uri3059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = input.nextInt();
        int f = input.nextInt();
        int array[] = new int[n];
        int number = 0;
        for(int x = 0; x < n; ++x) {
            array[x] = input.nextInt();
        }
        for(int x = 0; x < n; ++x) {
            for(int y = x+1; y < n; ++y) {
                int aux = array[x]+array[y];
                if(aux >= i && aux <= f) {
                    ++number;
                }
            }
        }
        System.out.println(number);
        
        
    }
    
}
