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
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        int xf = input.nextInt();
        int yf = input.nextInt();
        int x = 0;
        int y = 0;
        boolean chegou = false;
        input.nextLine();
        int comeco = 0;
        if(Math.hypot(xf, yf) > k) {
            comeco = 1;
        }
        int nao = n;
        boolean saiu = false;
        for(int i = 1; i <= n; ++i) {
            String dir = input.nextLine();
            switch(dir) {
                case "D":
                    x += 1;
                    break;
                case "E":
                    x -= 1;
                    break;
                case "C":
                    y += 1;
                    break;
                case "B":
                    y -= 1;
                    break;
            }
            if(Math.hypot((x - xf), (y - yf)) > k && !saiu) {
                nao = i;
                saiu = true;
            }
            if(x == xf && y == yf) {
                chegou = true;
            }
        }
        if(chegou && comeco != 1) {
            System.out.println("Sucesso");
        } 
        else {
            System.out.println("Trap "+((comeco == 0)? nao:comeco));
        }
        
    }
    
}
