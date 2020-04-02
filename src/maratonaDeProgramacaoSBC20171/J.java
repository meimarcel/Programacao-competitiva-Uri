/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20171;

/**
 *
 * @author meimarcel
 */
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.next();
        int res = 0;
        for(char i : entrada.toCharArray()) {
            res = (10*res + i - '0') % 3;
        }
        
        System.out.println(res);
    }
}
