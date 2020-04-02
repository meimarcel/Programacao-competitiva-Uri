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
public class Uri3058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double menor = Double.MAX_VALUE;
        for(int i = 0; i < n; ++i) {
            double preco = input.nextDouble();
            double gramas = input.nextDouble();
            menor = Math.min(((preco * 100) / gramas) * 10, menor);
        }
        System.out.printf("%.2f\n",menor);
        
        
    }
    
}
