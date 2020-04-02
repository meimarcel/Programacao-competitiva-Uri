package maratonaUri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class Uri1163 {
	public static void main(String[] args) throws EOFException,IOException {
		try {
			while(true) {
				Scanner input = new Scanner(System.in);
				double h1;
				int p1, p2;
				String aux;
				int n;
				double a, v;
				final double PI = 3.14159;
				final double G = 9.80665;
				aux = input.nextLine();
				h1 = Double.parseDouble(aux);
				aux = input.nextLine();
				p1 = Integer.parseInt(aux.split(" ")[0]);
				p2 = Integer.parseInt(aux.split(" ")[1]);
				n = input.nextInt();
				aux = input.nextLine();
				for(int i = 1; i <= n; i++) {
					aux = input.nextLine();
					a = Double.parseDouble(aux.split(" ")[0]);
					v = Double.parseDouble(aux.split(" ")[1]);
					double vx = Math.cos((PI / 180) * a) * v;
					double vy = Math.sin((PI / 180) * a) * v;
					double t1 = vy / G;
					double h2 = (vy * vy) / (2 * G);
					double hf = h1 + h2;
					double t2 = Math.sqrt((2 * hf)/G);
					double distancia = vx * (t1 + t2);
					
					if(distancia > p1 && distancia < p2) {
						System.out.printf("%.5f -> DUCK\n", distancia);
					} else {
						System.out.printf("%.5f -> NUCK\n",distancia);
					}
					
					input.close();
					
				}
				
				
			}
		}catch(Exception e) {
			System.exit(0);
		}
		
	}

}
