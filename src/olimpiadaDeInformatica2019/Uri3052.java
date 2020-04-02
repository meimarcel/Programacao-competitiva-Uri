/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olimpiadaDeInformatica2019;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author meimarcel
 */


public class Uri3052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String parede[][] = new String[n][m];
        Stack<Pair> front = new Stack<>();
        int dx[] = {0,0};
        int dy[] = {1,-1};
        input.nextLine();
        for(int i = 0; i < n; ++i) {
            parede[i] = input.nextLine().split("");
        }
        
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(parede[i][j].equals("o")) {
                    if(i + 1 < n) {
                        if(parede[i+1][j].equals("#")) {
                            front.add(new Pair(i,j));
                            while(!front.isEmpty()) {
                                Pair a = front.pop();
                                if(a.x + 1 < n) {
                                    if(parede[a.x+1][a.y].equals("#")) {
                                        for(int z = 0; z < 2; ++z) {
                                            if(a.x+dx[z] >= 0 && a.x+dx[z] < n && a.y+dy[z] >= 0 && a.y+dy[z] < m) {
                                                if(parede[a.x+dx[z]][a.y+dy[z]].equals(".")) {
                                                    parede[a.x+dx[z]][a.y+dy[z]] = "o";
                                                    front.add(new Pair(a.x+dx[z], a.y+dy[z]));
                                                }
                                            }
                                        }
                                    } else {
                                        parede[a.x+1][a.y] = "o";
                                    }
                                }
                            }
                        } else {
                            if(i + 1 < n) {
                                parede[i+1][j] = "o";
                            }
                        }
                    }
                } 
            }
        }
        for(int i = 0; i < n; ++i) {
            System.out.println(String.join("", parede[i]));
        }
        
        
    }
    
}

class Pair {
    public int x;
    public int y;
    
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}