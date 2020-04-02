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


import java.util.Scanner;

public class Uri1202 {
    
    
    public static final int CICLO = 1500;
    
    public static int fibonacci(int n) {
        int ultimo = 1;
        int penultimo = 1;
        int atual = 0;
        
        if(n == 1 || n == 2) {
            return 1;
        }
        
        for(int i = 2; i < n; i++) {
            atual = ultimo + penultimo;
            ultimo = penultimo;
            penultimo = atual%1000;
        }
        return atual%1000;
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; ++i) {
            String[] entrada = input.nextLine().split("");
            
            int decimal = 0;

            for(int j = 0; j < entrada.length; j++) {
                decimal *= 2;
                decimal += Integer.parseInt(entrada[j]);
                decimal %= CICLO;

            }
       
            int saida = fibonacci(decimal);
            
            if(saida < 10) {
                System.out.println("00"+saida);
            }
            else if(saida < 100) {
                System.out.println("0"+saida);
            } else{
                System.out.println(saida);
            }
        }
        System.out.println(fibonacci(1500));
    }
}
