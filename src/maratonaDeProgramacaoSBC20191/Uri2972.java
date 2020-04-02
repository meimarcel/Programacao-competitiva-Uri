/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20191;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri2972 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = Long.toBinaryString(input.nextLong());
        int num = 0;
        for(String b : n.split("")) {
            if(b.equals("1")) {
                num++;
            }
        }
        long res = (long) Math.pow(2, num);
        System.out.println(res);
}
}
