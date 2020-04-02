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
public class Uri2973 {
    
    public static int N,C,T;
    public static int vetor[];
    
    public static boolean ok(long m) {
        int pessoas = C;
        long soma = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] > m) {
                return false;
            }
            soma += vetor[i];
            if(soma > m) {
                soma = vetor[i];
                pessoas--;
            }
        }
        return (pessoas > 0)? true : false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        C = input.nextInt();
        T = input.nextInt();
        vetor = new int[N];
        for(int i = 0; i < N; i++) {
            vetor[i] = input.nextInt();
        }
         long L = 0, M = 0, R = 1000001000, ans = 0;
        while(L <= R) {
            M = (L+R) / 2;
            
            long K = M * T;
            
            if(ok(K)) {
                ans = M;
                R = M - 1;
            } else {
                L = M + 1;
            }
        }
        
        System.out.println(ans);
        
        
        
    }
    
}
