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


public class Uri3061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int img[][] = new int[n][m];
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};
        int res = 0;
        Stack<Pair> front = new Stack<>();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                img[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(img[i][j] == 1) {
                    ++res;
                    front.add(new Pair(i,j));
                    while(!front.isEmpty()) {
                        Pair a = front.pop();
                        for(int z = 0; z < 4; ++z) {
                            if(a.x+dx[z] >= 0 && a.x+dx[z] < n && a.y+dy[z] >=0 && a.y+dy[z] < m) {
                                if(img[a.x+dx[z]][a.y+dy[z]] == 1) {
                                    front.add(new Pair(a.x+dx[z],a.y+dy[z]));
                                } 
                            }
                        }
                        img[a.x][a.y] = 0;
                    }
                }
            }
        }
        System.out.println(res);
        
    }
    
}

class Pair{
    public int x;
    public int y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}