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
public class Uri3053 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String init = input.nextLine();
        boolean copos[] = new boolean[3];
        
        if(init.equals("A")) copos[0] = true;
        else if(init.equals("B")) copos[1] = true;
        else copos[2] = true;
        
        for(int i = 0; i < n; ++i) {
            int change = input.nextInt();
            if(change == 1) {
                boolean aux = copos[0];
                copos[0] = copos[1];
                copos[1] = aux;
            }
            else if(change == 2) {
                boolean aux = copos[1];
                copos[1] = copos[2];
                copos[2] = aux;
            } else {
                boolean aux = copos[0];
                copos[0] = copos[2];
                copos[2] = aux;
            }
        }
        int i = 0;
        for(; i < 3; ++i) {
            if(copos[i] == true) break;
        }
        switch(i) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }
        
    }
    
}
