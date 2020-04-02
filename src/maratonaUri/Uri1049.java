/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Scanner;

/**
 *
 * @author meimarcel
 */
public class Uri1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        if(s1.equals("vertebrado")) {
            if(s2.equals("ave")) {
                if(s3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if(s3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
            
        } else {
            if(s2.equals("inseto")) {
                if(s3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if(s3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
            
        }
        
    }
    
}
