package maratonaUri;
import java.util.Scanner;

public class Uri1088 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		
		while(true) {
			String entrada = input.nextLine();;
			n = Integer.parseInt(entrada.split(" ")[0]);
			
			if (n == 0) {
				break;
			}
			
			int[] vetor = new int[n + 1];
			int k = 0;
			for(String s : entrada.split(" ")) {
				vetor[k] = Integer.parseInt(s);
				k++;
			}
			int cont = 0;
			int i = 1;
			while (i <= n) {
				if(vetor[i] != i) {
					int aux  = vetor[i];
					cont = cont + (2 * (vetor[i] - i) - 1);
					vetor[i] = vetor[aux];
					vetor[aux] = aux;
				} else {
					i++;
				}
			}
			if((cont % 2) == 0) {
				System.out.println("Carlos");
			} else {
				System.out.println("Marcelo");
			}
		}
		input.close();
	}

}
