/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baloesDaSerra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1977 {
    public static int grafo[][];
    public static int caminho[];
    public static boolean visited[];
    
    public static void solve(int init) {
        for(int i = 0; i < caminho.length; ++i) {
            caminho[i] = grafo[init][i];
        }
        visited[init] = true;
        while(true) {
            int menor = Integer.MAX_VALUE;
            int indice = -1;
            for(int i = 0; i < caminho.length; ++i) {
                if(caminho[i] < menor && !visited[i]) {
                    menor = caminho[i];
                    indice = i;
                }
            }
            if(indice != -1) {
                visited[indice] = true;
                for(int i = 0; i < caminho.length; ++i) {
                    if(grafo[indice][i] != Integer.MAX_VALUE) 
                        if(menor + grafo[indice][i] < caminho[i])
                            caminho[i] = menor + grafo[indice][i];
                }
            } else {
                break;
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        int v = input.nextInt();
        while(x != 0 && n != 0 && v != 0) {
            input.nextLine();
            List<String> cidade = new ArrayList<>();
            grafo = new int[v][v];
            caminho = new int[v];
            visited = new boolean[v];
            for(int i = 0; i < v; ++i) {
                Arrays.fill(grafo[i], Integer.MAX_VALUE);
            }
            for(int i = 0; i < n; i++) {
                String entrada[] = input.nextLine().split(" ");
                if(!cidade.contains(entrada[0])) 
                    cidade.add(entrada[0]);
                if(!cidade.contains(entrada[1]))
                    cidade.add(entrada[1]);
                grafo[cidade.indexOf(entrada[0])][cidade.indexOf(entrada[1])] = Integer.parseInt(entrada[2]);
            }
            solve(cidade.indexOf("varzea"));
            x = (x > 30)? 50 : 30;
            x += caminho[cidade.indexOf("alto")];
            int h = x / 60;
            int m = x % 60;
            System.out.printf("%d:%02d\n",(17 + h),m);
            if(17 + h > 18) {        
                System.out.println("Ira se atrasar");
            } else {
                if(17 + h == 18) {
                    if(m != 0)
                        System.out.println("Ira se atrasar");
                    else
                        System.out.println("Nao ira se atrasar");
                }
                else {
                    System.out.println("Nao ira se atrasar");
                }
            }
            x = input.nextInt();
            n = input.nextInt();
            v = input.nextInt();
            
        }
        
    
    }
    
    
    
    
}
