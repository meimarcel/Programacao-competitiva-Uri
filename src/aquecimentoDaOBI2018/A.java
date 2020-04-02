package aquecimentoDaOBI2018;

import java.util.Scanner;

public class A {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String entrada = input.nextLine();
			switch(entrada) {
			 	case "esquerda":
			 		System.out.println("ingles");
			 		break;
			 	case "direita":
			 		System.out.println("frances");
			 		break;
			 	case "nenhuma":
			 		System.out.println("portugues");
			 		break;
			 	case "as duas":
			 		System.out.println("caiu");
			}		
		}
		input.close();
	}
}
