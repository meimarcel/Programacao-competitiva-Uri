/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaUri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meimarcel
 */

class Pair implements Comparator<Pair>{
    public String n;
    public int v;
    public Pair(String n, int v) {
        this.n = n;
        this.v = v;
    }
    public Pair() {

    }

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.v - o2.v;
    }
    
}

public class Uri2633 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            int n = Integer.parseInt(input.nextLine());
            List<Pair> array = new ArrayList<>();
            for(int i = 0; i < n; ++i) {
                String entrada[] = input.nextLine().split(" ");
                array.add(new Pair(entrada[0], Integer.parseInt(entrada[1])));
            }
            Collections.sort(array, new Pair());
            boolean first = true;
            for(Pair p : array) {
                if(first) {
                    System.out.print(p.n);
                    first = false;
                } else {
                    System.out.print(" "+p.n);
                }
            }
            System.out.println("");
        }
    }
    
}
