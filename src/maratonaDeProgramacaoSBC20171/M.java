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
public class M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empregados[] = new int[3];
        for(int i = 0; i < 3; ++i) {
            empregados[i] = input.nextInt();
        }
        
        int melhor = Integer.MAX_VALUE;
        int atual = 0;
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                atual += 2 * Math.abs(i-j) * empregados[j];
            }
            if(atual < melhor) {
                melhor = atual;
            }
            atual = 0;
        }
        System.out.println(melhor);

    }
    
}
