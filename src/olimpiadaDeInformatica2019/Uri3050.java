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
public class Uri3050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; ++i) {
            array[i] = input.nextInt(); 
        }
        int maior = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                int temp = array[i] + array[j] + j - i;
                if(temp > maior) maior = temp;
            }
        }
        System.out.println(maior);
        
    }
    
}
