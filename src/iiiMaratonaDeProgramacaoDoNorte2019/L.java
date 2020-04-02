/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiMaratonaDeProgramacaoDoNorte2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */

public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        char[] erro = input.nextLine().toCharArray();
        int m = input.nextInt();
        input.nextLine();
        char[][] provas = new char[n][m];
        String[] entrada = new String[m];
        
        for(int i = 0; i < m; i++) {
            entrada[i] = input.nextLine();
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                provas[j][i] = entrada[i].charAt(j);
            }
        }

        
        int resultado = 0;
        for(int i = 0; i < n; i++) {
            int aux1 = 1;
            int aux2 = 0;
            Arrays.sort(provas[i]);
            char anterior = provas[i][0];
            for(int j = 1; j < m; j++){
                if(provas[i][j] == anterior && provas[i][j] != erro[i]) {
                    aux1++;
                } else {
                    if(provas[i][j] != anterior && aux1 > aux2) {
                        aux2 = aux1;
                    }
                    aux1 = 1;
                }
                anterior = provas[i][j];
            }
            if(aux1 != 1 && aux1 > aux2) {
                aux2 = aux1;
            }
            if(m == 1 && provas[i][0] != erro[i]) {
                aux2 = 1;
            }
            resultado += aux2;
        }
        
        System.out.println(resultado);
    }
    
}
