/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

/**
 *
 * @author meimarcel
 */
import java.util.Scanner;

public class Uri1147 {
    
    public static int xc, yc;
    public static int[] x , y ;
    public static final int[] dx = {1,1,-1,-1,2,2,-2,-2};
    public static final int[] dy = {2,-2,2,-2,1,-1,1,-1};
    
    public static int busca() {
        int cont = 0;
        boolean pos = true;
        for(int j = 0; j < 8; j++) {
            if((xc + dx[j]) > 0 && (xc + dx[j]) <= 8 && (yc + dy[j]) > 0 && (yc + dy[j]) <= 8) {
                for(int k = 0; k < 16; k++) {
                    if(x[k] != 0) {
                        if((xc + dx[j]) == x[k] && (yc + dy[j]) == y[k]) {
                            pos = false;
                            break;
                        }
                    }
                }
                if(pos) {
                    cont++;
                }
                pos = true;
            }
        }
        
        return cont;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, teste = 1;
        String cavalo = input.nextLine();
        while(!cavalo.equals("0")) {
            x = new int[16];
            y = new int[16];
            xc = (int) cavalo.charAt(1) - (int)'a' + 1;
            yc = (int) cavalo.charAt(0) - (int)'0';
            for(i = 0; i < 16; i += 2) {
                String peao = input.nextLine();
                int x1 = (int) peao.charAt(1) - (int) 'a' + 2;
                int y1 = (int) peao.charAt(0) - (int) '0' - 1;

                if(x1 <= 8 && y1 > 0) {
                    x[i] = x1;
                    y[i] = y1;
                }
                x1 = (int) peao.charAt(1) - (int) 'a';
                y1 = (int) peao.charAt(0) - (int) '0' - 1;

                if(x1 > 0 && y1 > 0) {
                    x[i + 1] = x1;
                    y[i + 1] = y1;
                }
            }
            System.out.printf("Caso de Teste #%d: %d movimento(s).\n",teste++,busca());
            cavalo = input.nextLine();
            
        }
        
        
    }
}
