package maratonaUri;

import java.util.Scanner;
import java.util.ArrayList;


public class Uri1839 {
	static long[][] memo = new long[1000][1000];
	public static long calcula(int k,int s) {
		if (memo[k][s] != 0) {
			return (memo[k][s] - 1);
		} else {
			long aux = k - s;
			long k1 = 1;
			long s1 = 1;
			//long z1 = 1;
			if (aux > s) {
				for (; k > aux; k--) {
					k1 *= k;
				}
				for (; s > 0; s--) {
					s1 *= s;
				}
			} else {
				for (; k > s; k--) {
					k1 *= k;
				}
				for(;aux > 0;aux--) {
					s1 *= aux;
				}
			}
			memo[k][s] =  (k1 / s1) + 1;
                        System.out.println(s1);
			return (k1 / s1);
		}
		
	}
	
	public static void main(String[] args) {
		long CONST = 1000000007;
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.next());
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		String[] entrada = input.nextLine().split("");
		for(int i = 1; i <= n; i++) {
			int cont = 1;
			entrada = input.nextLine().split("");
			for (String s : entrada) {
				if (s.equals("#")) {
					x.add(i);
					y.add(cont);
				}
				cont++;
			}	
		}
		while(input.hasNextInt()) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			int k = Math.abs((x2 - x1) + 1) * ((y2 - y1) + 1);
			int s = 0;
			for(int i = 0; i < x.size(); i++) {
				if(x1 <= x.get(i) && x.get(i) <= x2 && y1 <= y.get(i) && y.get(i) <= y2) {
                                    System.out.println(x.get(i)+" "+y.get(i));
					s++;
				}
			}
			long calculo = calcula(k , s);
			System.out.printf("%d\n",((calculo - 1) % CONST));		
			
		}
		input.close();
	}

}
