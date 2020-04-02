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

import java.math.BigInteger;
import java.util.Scanner;

public class Uri1308 {
    
    public static BigInteger sqrt(BigInteger x) {
    BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
    BigInteger div2 = div;
    // Loop until we hit the same value twice in a row, or wind
    // up alternating.
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; ++i) {
            BigInteger caso = input.nextBigInteger();
            BigInteger aux = caso.multiply(BigInteger.valueOf(8)).add(BigInteger.valueOf(1));
            aux = sqrt(aux);
            BigInteger x2 = BigInteger.valueOf(-1).add(aux);
            x2 = x2.divide(BigInteger.valueOf(2));

            System.out.println(x2);
        }
        
    }
    
}
