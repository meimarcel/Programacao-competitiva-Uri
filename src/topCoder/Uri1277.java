/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1277 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0) {
            int a = input.nextInt();
            input.nextLine();
            String estudantes[] = input.nextLine().split(" ");
            String frequencia[] = input.nextLine().split(" ");
            boolean first = true;
            for(int i = 0; i < estudantes.length; ++i) {
                int reduz = 0;
                int pres = 0;
                String aux[] = frequencia[i].split("");
                for(int j = 0; j < frequencia[i].length(); ++j) {
                    if(aux[j].equals("P")) {
                        pres++;
                    }
                    else if(aux[j].equals("M")) {
                        reduz++;
                    }
                }
                if((double)pres / (double) (aux.length - reduz) < 0.75) {
                    if(first) {
                        System.out.print(estudantes[i]);
                        first = false;
                    } else 
                        System.out.print(" "+estudantes[i]);
                }
                
            }
            System.out.println();
            --n;
        }
    }
}
