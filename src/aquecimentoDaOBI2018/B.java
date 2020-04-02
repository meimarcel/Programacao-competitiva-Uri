package aquecimentoDaOBI2018;

import java.util.Scanner;

class Calcula {
	public int calcular(int a, String[] b, int x, int tamanho) {
		if(x > tamanho) {
			return 0;
		}
		if(!b[x].equals("*")) {
			if(Integer.parseInt(b[x]) > a) {
				return x;
			} else {
				x = calcular(a, b, x + 1,tamanho);
			}
		}
			
		return x;
	}
}

public class B {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho = input.nextInt();
		Calcula aux = new Calcula();
		int[] vetor = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = input.nextInt();
		}
		String[] resposta = new String[tamanho];
		resposta[tamanho - 1] = "*";
		for(int i = tamanho - 1; i > 0; i--) {
			if(vetor[i] > vetor[i - 1]) {
				resposta[i - 1] = String.valueOf(vetor[i]);
			}
			else if(!resposta[i].equals("*")) {
				int a = aux.calcular(vetor[i - 1], resposta, i, tamanho - 1);
				if (a != 0) {
					resposta[i - 1] = resposta[a];
				} else {
					resposta[i - 1] = "*";
				}
			}else {
				resposta[i - 1] = "*";
			}
		}
		for(int i = 0; i < tamanho; i++) {
			System.out.print(resposta[i]);
			if(i < tamanho -1) {
			System.out.print(" ");
			}
		}
		System.out.print("\n");
		input.close();
		
	}
}
