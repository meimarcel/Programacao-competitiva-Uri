/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiMaratonaDeProgramacaoDoNorte2019;

/**
 *
 * @author meimarcel
 */

import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        int P,C,N,V;
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        P = entrada.nextInt();
        C = entrada.nextInt();
        N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
                V = entrada.nextInt();
                if(P<=V && C>0) {
                        if(i==0) {
                                if (P+C > V) {
                                        C-=P+C-V;
                                }
                        }
                        else {
                                if (P+C > V) {
                                        C-=P+C-V;
                                        cont++;
                                }
                        }
                }
                else {
                        break;
                }
        }
        System.out.println(cont);
    }
    
}
