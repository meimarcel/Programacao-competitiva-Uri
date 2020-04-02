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
public class Uri1254 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String regra[] = input.nextLine().toLowerCase().split("");
            String valor = input.nextLine();
            String texto[] = input.nextLine().split("");
            String res = "";
            String aux = "";
            boolean cond = false;
            for(String s : texto) {
                if(s.equals("<")) {
                    cond = true;
                }
                if(cond) {
                    aux += s;
                } else {
                    res += s;
                }
                if(s.equals(">")) {
                    String muda = "";
                    int index = 0;
                    for(String i : aux.split("")) {
                        if(index == regra.length) {
                            index = 0;
                            muda = "";
                            res += valor;

                        }
                        if(i.toLowerCase().equals(regra[index])) {
                            muda += i;
                            ++index;
                        } else {
                            if(index > 0) {
                                res += muda+i;
                            } else {
                                res += i;
                            }
                            muda = "";
                            index = 0;
                        }
                        
                    }
                    aux = "";
                    cond = false;
                }
            }
            System.out.println(res);
            
            
            
        }
    }
    
}
