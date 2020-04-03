/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucGoiasJCECE2019Replay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split(" ");
            int n = Integer.parseInt(entrada[0]);
            int m = Integer.parseInt(entrada[1]);
            String palavra[] = input.nextLine().split("");
            List<String> array = new ArrayList<>();
            for(int i = 0; i < m; ++i) {
                array.add(input.nextLine());
            }
            Collections.sort(array, Comparator.comparing(String::length));
            int res = 0;
            for(int i = 0; i < n; ++i) {
                if(array.indexOf(palavra[i]) == -1) {
                    ++res;
                }
            }
            n--;
            for(int i = 0; i <= n; ++i) {
                String palavra1 = "";
                String palavra2 = "";
                for(int j = n; j > i; --j) {
                    if(palavra[i].equals(palavra[j]) ) {
                        int v = (j + i) / 2;
                        palavra1 = String.join("", Arrays.copyOfRange(palavra, i, v+1));
                        palavra2 = String.join("", Arrays.copyOfRange(palavra, v+1, j+1));
                        String aux = new StringBuffer(palavra2).reverse().toString();
                        if(palavra1.equals(aux) || ((j + i)%2 == 0 && String.join("", Arrays.copyOfRange(palavra, i, v)).equals(aux))) {
                            palavra1 += palavra2;
                            int len = palavra1.length();
                            for(String s : array) {
                                if(s.length() <= len) {
                                    palavra1 = palavra1.replace(s, "");
                                } else {
                                    break;
                                }
                                if(palavra1.length() != len) break;
                            }
                            if(palavra1.length() == len) {
                            ++res;
                        }
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
    
}
