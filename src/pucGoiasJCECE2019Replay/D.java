/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucGoiasJCECE2019Replay;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()) {
            int n = input.nextInt();
            int s = input.nextInt();
            int loja = n*n;
            int x = 0;
            int y = n-1;
            String dir = "E";
            int[][] array = new int[n][n];
            array[x][y] = loja;
            while(array[x][y] != s) {
                if(dir.equals("E")) {
                    if(y - 1 >= 0) {
                        if(array[x][y-1] == 0) {
                            --y;
                            --loja;
                            array[x][y] = loja; 
                        } else {
                            dir = "B";
                            
                        }
                    } else{
                        dir = "B";
                    }
                }
                if(dir.equals("B")) {
                    if(x + 1 < n) {
                        if(array[x+1][y] == 0) {
                            ++x;
                            --loja;
                            array[x][y] = loja; 
                        } else {
                            dir = "D";
                            
                        }
                    } else{
                        dir = "D";
                    }
                }
                if(dir.equals("D")) {
                    if(y + 1 < n) {
                        if(array[x][y+1] == 0) {
                            ++y;
                            --loja;
                            array[x][y] = loja; 
                        } else {
                            dir = "C";
                            
                        }
                    } else{
                        dir = "C";
                    }
                }
                if(dir.equals("C")) {
                    if(x - 1 >= 0) {
                        if(array[x-1][y] == 0) {
                            --x;
                            --loja;
                            array[x][y] = loja; 
                        } else {
                            dir = "E";
                            
                        }
                    } else{
                        dir = "E";
                    }
                }
                if(array[x][y] == s) {
                    break;
                }
            }
            System.out.println(x+" "+y);
        }
        
    }
    
}
