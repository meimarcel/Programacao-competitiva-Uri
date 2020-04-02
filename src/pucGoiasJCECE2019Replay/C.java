/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucGoiasJCECE2019Replay;

import java.util.ArrayList;
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
            int res = 0;
            for(int i = 0; i < n; ++i) {
                if(array.indexOf(palavra[i]) == -1) {
                    ++res;
                }
            }
            n--;
            for(int i = 0; i <= n; ++i) {
                for(int j = n; j > i; --j) {
                    String palavra1 = "";
                    String palavra2 = "";
                    int v = (j + i) / 2;
                    int l = i;
                    for(int z = j; z > v; --z) {
                        if(palavra[l].equals(palavra[z])) {
                            palavra1 += palavra[l];
                            palavra2 += palavra[z];
                            ++l;
                        } else {
                           palavra1 = "";
                           palavra2 = "";
                           break;
                        }
                    }
                    if(!palavra1.equals("")) {
                        if((j - i)% 2 == 0) {
                            palavra2 += palavra[v];
                            palavra2 = new StringBuffer(palavra2).reverse().toString();
                            palavra1 += palavra2;
                        } else {
                            palavra2 = new StringBuffer(palavra2).reverse().toString();
                            palavra1 += palavra2;
                        }
                        int len = palavra1.length();
                        for(String s : array) {
                            palavra1 = palavra1.replace(s, "");
                            if(palavra1.length() != len) break;
                        }
                        if(palavra1.length() == len) {
                            ++res;
                        }
                    }
                    
                    
                }
            }
            System.out.println(res);
        }
    }
    
}
