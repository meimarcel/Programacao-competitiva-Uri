/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri3047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int res = m - a - b;
        res = Collections.max(Arrays.asList(res, a, b));
        System.out.println(res);
    }
    
}
