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
public class Uri1287 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split("");
            String num = "";
            for(String s : entrada) {
                if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || 
                        s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
                    if(num.equals("0") && s.equals("0")) {
                        num = s;
                    } else {
                        num += s;
                    }
                }
                else if(s.equals("l")) {
                    num += "1";
                }
                else if(s.equals("O") || s.equals("o")) {
                    if(num.equals("0")) {
                        num = "0";
                    } else {
                        num += "0";
                    }
                }
                else if(s.equals(",") || s.equals(" ")) {
                    
                }
                else {
                    num = "error";
                    break;
                }
            }

            if(num.equals("error")) {
                System.out.println(num);
            } else {
                if(num.length() < 12 && num.length() > 0) {
                    long verifica = Long.parseLong(num);
                    if(verifica <= 2147483647) {
                        System.out.println(verifica);
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            }
            
        }
    }
    
}
