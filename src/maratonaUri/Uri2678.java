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
public class Uri2678 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String tel[] = input.nextLine().split("");
            String res = "";
            for(int i = 0; i < tel.length; ++i) {
                if(tel[i].toUpperCase().equals("A") || tel[i].toUpperCase().equals("B") || tel[i].toUpperCase().equals("C")){
                    res += "2";
                }
                else if(tel[i].toUpperCase().equals("D") || tel[i].toUpperCase().equals("E") || tel[i].toUpperCase().equals("F")) {
                    res += "3";
                }
                else if(tel[i].toUpperCase().equals("G") || tel[i].toUpperCase().equals("H") || tel[i].toUpperCase().equals("I")) {
                    res += "4";
                }
                else if(tel[i].toUpperCase().equals("J") || tel[i].toUpperCase().equals("K") || tel[i].toUpperCase().equals("L")) {
                    res += "5";
                }
                else if(tel[i].toUpperCase().equals("M") || tel[i].toUpperCase().equals("N") || tel[i].toUpperCase().equals("O")) {
                    res += "6";
                }
                else if(tel[i].toUpperCase().equals("P") || tel[i].toUpperCase().equals("Q") || tel[i].toUpperCase().equals("R") || tel[i].toUpperCase().equals("S")) {
                    res += "7";
                }
                else if(tel[i].toUpperCase().equals("T") || tel[i].toUpperCase().equals("U") || tel[i].toUpperCase().equals("V")) {
                    res += "8";
                }
                else if(tel[i].toUpperCase().equals("W") || tel[i].toUpperCase().equals("X") || tel[i].toUpperCase().equals("Y") || tel[i].toUpperCase().equals("Z")) {
                    res += "9";
                } else {
                    if(tel[i].equals("0") || tel[i].equals("1") || tel[i].equals("2") || tel[i].equals("3") || tel[i].equals("4") || tel[i].equals("5") || tel[i].equals("6") ||
                            tel[i].equals("7") || tel[i].equals("8") || tel[i].equals("9") || tel[i].equals("*") || tel[i].equals("#")) {
                        res += tel[i];
                    }
                }
            }
            System.out.println(res);
       }
    }
    
}
