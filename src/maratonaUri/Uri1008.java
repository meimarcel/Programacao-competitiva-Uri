package maratonaUri;

import java.util.Scanner;

public class Uri1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		int horas = input.nextInt();
		double dinheiro = input.nextDouble();
		System.out.println("NUMBER = "+numero);
		System.out.printf("SALARY = U$ %.2f\n", (horas*dinheiro));
		input.close();
	}
}
