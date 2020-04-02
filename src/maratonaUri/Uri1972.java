/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1972 {
    
    public static String lab[][];
    public static boolean visited[][];
    public static int x[] = {1, -1, 0, 0};
    public static int y[] = {0, 0, 1, -1};
    
    public static int search(Pos init, int n, int m) {
        init.custo = 0;
        PriorityQueue<Pos> front = new PriorityQueue<>();
        front.add(init);
        while(!front.isEmpty()) {
            Pos atual = front.poll();
            if(!visited[atual.x][atual.y]) { 
                for(int i = 0; i < 4; i++) {
                    int auxX = atual.x + x[i];
                    int auxY = atual.y + y[i];
                    if(auxX >= 0 && auxX < n && auxY >= 0 && auxY < m){
                        if(lab[auxX][auxY].equals("E")) return atual.custo;
                        if(!visited[auxX][auxY]) {
                            if(!lab[auxX][auxY].equals("#")) {
                                if(!lab[auxX][auxY].equals(".")) {
                                    front.add(new Pos(auxX, auxY, atual.custo + Integer.parseInt(lab[auxX][auxY])));
                                } else {
                                    front.add(new Pos(auxX, auxY, atual.custo));
                                }  
                            }
                        }

                    }
                }
            }
            visited[atual.x][atual.y] = true;
                
        }
        return -1;    
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        lab = new String[n][m];
        visited = new boolean[505][505];
        int hX = 0, hY = 0;
        for(int i = 0; i < n; i++) {
            lab[i] = input.nextLine().split("");
            for(int j = 0; j < m; j++) {
                if(lab[i][j].equals("H")) {
                    hX = i;
                    hY = j;
                }
            }
        }
       
        int res = search(new Pos(hX, hY ,0),n,m);
        if(res != -1) {
            System.out.println(res);
        } else {
            System.out.println("ARTSKJID");
        }
    }
    
}

class Pos implements Comparable<Pos>{
    public int x;
    public int y;
    public int custo;
    
    public Pos(int x, int y, int custo) {
        this.x = x;
        this.y = y;
        this.custo = custo;
    }

    @Override
    public int compareTo(Pos p) {
        return (this.custo < p.custo) ? -1 : 1;
    }
    
    
}
