package maratonaUri;

import java.util.Scanner;

public class Uri1223 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			int n = input.nextInt();
			int l = input.nextInt();
			int h = input.nextInt();
			int cont = 0;
			for (int i = 1; i <= n; i++) {
				int y1 = input.nextInt();
				int x2 = input.nextInt();
				int y2 = input.nextInt();
				int[] vetorx = new int[2*n];
				int[] vetory = new int[2*n];
				if ((i % 2) != 0) {
					vetorx[cont] = 0; 
				} else {
					vetorx[cont] = l;
				}
				vetory[cont] = y1;
				cont++;
				vetorx[cont] = x2;
				vetory[cont] = y2;
				cont++;
			}
			
			
		}
	}

}
