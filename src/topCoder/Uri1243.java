/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topCoder;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author meimarcel
 */
public class Uri1243 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern PATTERN = Pattern.compile("[a-zA-Z]+\\.?");
        while(input.hasNextLine()) {
            String entrada[] = input.nextLine().split(" ");
            int tam = 0;
            int num = 0;
            for(String s : entrada) {
                if(PATTERN.matcher(s).matches()) {
                    if(s.charAt(s.length() - 1) == '.') {
                        tam += s.length() - 1;
                    } else {
                        tam += s.length();
                    }
                    num++;
                }
            }
            if(num == 0) {
                System.out.println("250");
            } else {
                int res = tam / num;
                switch(res) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("250");
                        break;
                    case 4:
                    case 5:
                        System.out.println("500");
                        break;
                    default:
                        System.out.println("1000");
                        break;
                }
            }
        }
    }
    
}
