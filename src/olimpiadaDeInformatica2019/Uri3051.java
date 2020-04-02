/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri3051 {
    
    public static int ft[];
    
    public static void FT(int n) {
        ft = new int[n + 1];
    }
    
    public static int LSOne(int n) {
        return (n & -n);
    }
    
    public static int RSQ(int i) {
        int sum = 0;
        for(; i > 0; i -= LSOne(i)) sum += ft[i];
        return sum; 
    }
    
    public static int RSQ(int i, int j) {
        return RSQ(j) - ((i == 1)? 0 : RSQ(i-1));
    }
    
    public static void adjust(int i, int n) {
        for(; i < ft.length; i += LSOne(i)) ft[i] += n;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        FT(n);
        for(int i = 1; i < n+1; ++i) {
            adjust(i, input.nextInt());
        }
        int res = 0;
        for(int i = 1; i < n+1; ++i) {
            int temp = RSQ(i,i);
            if(temp == k) ++res;
            if(temp <= k) {
                for(int j = i + 1; j < n+1; ++j) {
                    temp = RSQ(i,j);
                    if(temp == k) ++res;
                    if(temp > k) break;
                }
            }

        }
        System.out.println(res);
    }
}
