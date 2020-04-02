/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */

class Ponto {
    int x;
    int y;
    
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
}


public class Uri1027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            List<Ponto> lista = new ArrayList<>();
            int n = Integer.parseInt(input.nextLine());
            for(int i = 0; i < n; ++i) {
                String[] entrada = input.nextLine().split(" ");
                lista.add(new Ponto(Integer.parseInt(entrada[0]), Integer.parseInt(entrada[1])));
            }

            int pontos = 0;
            
            
        }
        
        
        
    }
    
}
