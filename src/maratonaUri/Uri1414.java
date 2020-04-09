/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1414 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        while(n != 0 || m != 0) {
            input.nextLine();
            int soma = 0;
            for(int i = 0; i < n; ++i) {
                soma += Integer.parseInt(input.nextLine().split(" ")[1]);
            }
            System.out.println(3*m - soma);
            n = input.nextInt();
            m = input.nextInt();
        }
    }
    
}
