/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaDeProgramacaoSBC20181;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();
        boolean inicial[] = new boolean[m+1];
        boolean atual[] = new boolean[m+1];
        List<List<Integer>> interruptores = new ArrayList<>(); 
        for(int i = 0; i < l; ++i) {
            int pos = input.nextInt();
            inicial[pos] = true;
            atual[pos] = true;
        }
        for(int i = 0; i < n; i++) {
            int lamp = input.nextInt();
            List<Integer> aux = new ArrayList<>();
            for(int j = 0; j < lamp; ++j) {
                aux.add(input.nextInt());
            }
            interruptores.add(aux);
        }
        int res = 0;
        int index = 0;
        while(true) {
            for(int i = 0; i < interruptores.get(index).size(); ++i) {
                atual[interruptores.get(index).get(i)] = !atual[interruptores.get(index).get(i)];
            }
            res++;
            if(Arrays.equals(atual,inicial) &&  index == n-1) {
                res = -1;
                break;
            }
            if(Arrays.equals(atual,new boolean[m+1])){
                break;
            }
            index++;
            index %= n;
        }
        System.out.println(res);
        
    }
    
}
