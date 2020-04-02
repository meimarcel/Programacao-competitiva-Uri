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
public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split(" ");
            int h = Integer.parseInt(entrada[0]);
            int m = Integer.parseInt(entrada[1]);
            h = h/30;
            m = m/6;
            String zh = (h >= 10)? "":"0";
            String zm = (m >= 10)? "":"0";
            System.out.println(zh+String.valueOf(h)+":"+zm+String.valueOf(m));
            
        }
        
    }
    
}
