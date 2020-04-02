/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maratonaUri;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author meimarcel
 */
public class Uri1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer,String> ddd = new TreeMap<>();
        ddd.put(61,"Brasilia");
        ddd.put(71,"Salvador");
        ddd.put(11,"Sao Paulo");
        ddd.put(21,"Rio de Janeiro");
        ddd.put(32,"Juiz de Fora");
        ddd.put(19,"Campinas");
        ddd.put(27,"Vitoria");
        ddd.put(31,"Belo Horizonte");
        int n = input.nextInt();
        if(ddd.containsKey(n)) {
            System.out.println(ddd.get(n));
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
    
}
