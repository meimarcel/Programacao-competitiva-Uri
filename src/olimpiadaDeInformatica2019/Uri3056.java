/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri3056 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger i = BigInteger.valueOf((long) Math.pow(2,n) + 1);
        System.out.println(i.multiply(i));
        
    }
    
}
