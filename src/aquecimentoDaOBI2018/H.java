package aquecimentoDaOBI2018;

import java.util.Scanner;

public class H {
	
	public static int soma(int[] vetor, int x, int y, int z, int s) {
		int soma = 0;
		if(y == 0 && z == 0) {
			for(int i = x; i <= s; i++) {
				soma += vetor[i];
			}
		} else {
			for(int i = x; i <= y; i++) {
				soma += vetor[i];
				
			}
			for(int i = z; i <= s; i++) {
				soma += vetor[i];
			}
		}
		
		
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int q = 0;
		int[] trem = new int[n+1];
		for (int i = 0; i < n; i++) {
			trem[i] = 0;
		}
		String entrada = input.nextLine();
		while(q < m) {
			entrada = input.nextLine();
			String[] vetor = entrada.split(" ");
			if (vetor[0].equals("1")) {
				trem[Integer.parseInt(vetor[1])] += Integer.parseInt(vetor[2]); 
			} else {
				if(Integer.parseInt(vetor[2]) >= Integer.parseInt(vetor[3]) && Integer.parseInt(vetor[1]) <= Integer.parseInt(vetor[3]) &&
						Integer.parseInt(vetor[4]) >= Integer.parseInt(vetor[2])) {
					System.out.println(soma(trem, Integer.parseInt(vetor[1]),0,0,Integer.parseInt(vetor[4])));
				}
				else if (Integer.parseInt(vetor[4]) >= Integer.parseInt(vetor[2]) && Integer.parseInt(vetor[1]) >= Integer.parseInt(vetor[3])) {
					System.out.println(soma(trem, Integer.parseInt(vetor[3]),0,0,Integer.parseInt(vetor[4])));
				}
				else if (Integer.parseInt(vetor[2]) >= Integer.parseInt(vetor[4]) && Integer.parseInt(vetor[1]) <= Integer.parseInt(vetor[3])) {
					System.out.println(soma(trem, Integer.parseInt(vetor[1]),0,0,Integer.parseInt(vetor[2])));
				}
				else if (Integer.parseInt(vetor[2]) >= Integer.parseInt(vetor[3]) && Integer.parseInt(vetor[1]) >= Integer.parseInt(vetor[3]) &&
						Integer.parseInt(vetor[4]) <= Integer.parseInt(vetor[2]) && Integer.parseInt(vetor[4]) >= Integer.parseInt(vetor[1])) {
					System.out.println(soma(trem, Integer.parseInt(vetor[3]),0,0,Integer.parseInt(vetor[2])));
				}
				else {
					System.out.println(soma(trem, Integer.parseInt(vetor[1]),Integer.parseInt(vetor[2]),
							Integer.parseInt(vetor[3]),Integer.parseInt(vetor[4])));
				}
			}
			q++;
		}
		input.close();
		
	}

}

