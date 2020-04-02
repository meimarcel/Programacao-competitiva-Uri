/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20171;

/**
 *
 * @author meimarcel
 */
import java.util.*;
import java.util.Scanner;
public class E {
    
    public static boolean verificar(ArrayList a, int[] b) {
        boolean estado = true;
        for(int x : b) {
            if(a.indexOf(x) == -1) {
                estado = false;
                break;
            }
        }
        return estado;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int[] PADRAO = {2,4,5,7,9,11,12};
        final String[] NOTAS = {"do","do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si","desafinado"};
        
        List<ArrayList<Integer>> escalas = new ArrayList<>();
        
        for(int i = 0; i < 12; ++i) {
            escalas.add(new ArrayList<>());
            for(int j = 0; j < 7; ++j) {
                escalas.get(i).add((i + PADRAO[j]) % 12);
            }
        }
        
        int n = input.nextInt();
        int[] entrada = new int[n];
        for(int s = 0; s < n; ++s) {
            entrada[s] = input.nextInt();
            entrada[s] = (entrada[s] - 1) % 12;
        }
        entrada = Arrays.stream(entrada).distinct().sorted().toArray();
        int nota = 0;
        for(ArrayList escala : escalas) {
            if (verificar(escala, entrada)) {
                break;
            }
            nota++;
        }
        
        System.out.println(NOTAS[nota]);
        
        
    }
    
}
