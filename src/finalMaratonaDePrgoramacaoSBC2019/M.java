/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalMaratonaDePrgoramacaoSBC2019;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int k = input.nextInt();
        int pontos[] = new int[n];
        for(int i = 0; i < n; ++i) {
            pontos[i] = input.nextInt();
        }
        int res = 1;
        int ant = pontos[0];
        int aux = 1;
        for(int i = 1; i < n; ++i) {
            if(pontos[i] - ant <= k) {
                aux++;
            } else {
                res = Math.max(res, aux);
                aux = 1;
            }
            ant = pontos[i];
        }
        res = Math.max(res, aux);
        System.out.println(res);
    }
    
}
