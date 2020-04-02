package aquecimentoDaOBI2018;

import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		int e = input.nextInt();
		System.out.println("B: "+b);
		System.out.println("E: "+e);
		String[] vetor;
		int tamanho = 0;
		long x = (long)Math.pow(b, e);
		/*long x = 1;
		for(int i = 1; i <= e; i++) {
			x *= b;
		}*/
		System.out.println("b: "+ x);
		do {
			String y = String.valueOf(x);
			vetor = y.split("");
			tamanho = vetor.length;
			x = 0;
			for (String i : vetor) {
				x += Long.parseLong(i);
			}
		} while(tamanho > 1);
		System.out.println(x);
		input.close();
		
	}
}
