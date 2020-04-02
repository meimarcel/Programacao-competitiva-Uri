package maratonaUri;
import java.util.Scanner;

public class Uri1286 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n , w;
		while(true) {
			n = input.nextInt();
			if (n == 0) {
				break;
			}
			w = input.nextInt();
			int[] pizza = new int[n + 1];
			int[] tempo = new int[n + 1];
			pizza[0] = 0;
			tempo[0] = 0;
			String entrada = input.nextLine();
			String[] aux = new String[2];
			for(int i = 1; i <= n; i++) {
				entrada = input.nextLine();
				aux = entrada.split(" ");
				tempo[i] = Integer.parseInt(aux[0]);
				pizza[i] = Integer.parseInt(aux[1]);
			}
			int[][] resposta = new int[n + 1][w + 1];
			for (int i = 0; i <= n; i++) {
				resposta[i][0] = 0;
			}
			for (int i = 0; i <= w; i++) {
				resposta[0][i] = 0;
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= w; j++) {
					resposta[i][j] = resposta[i - 1][j];
					if (pizza[i] <= j && (tempo[i] + resposta[i - 1][j - pizza[i]]) > resposta[i][j]) {
						resposta[i][j] = tempo[i] + resposta[i - 1][j - pizza[i]];
					}
				}
			}
			System.out.println(resposta[n][w]+" min.");
			
		}
		input.close();
	}
}
