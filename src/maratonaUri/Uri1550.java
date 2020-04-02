package maratonaUri;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;



class Numero {
	public int num;
	public int botao;
	
	public Numero(int num, int botao) {
		this.num = num;
		this.botao = botao;
	}
	
}

public class Uri1550 {
	
	public static int calcula(int a, int b) {
		boolean[] cond = new boolean[11000];
		Queue<Numero> fila = new LinkedList<>();
		fila.add(new Numero(a,0));
		cond[a] = true;
		while(!fila.isEmpty()) {
			Numero aux = fila.poll();
			if (aux.num >= 11000 || b >= 11000) {
				continue;
			}
			if((aux.num + 1) == b) {
				return aux.botao + 1;
			}
			int aux2 = 0;
			int k = aux.num;
			while(k > 0) {
				aux2 *= 10;
				aux2 += (k % 10);
				k /= 10;
			}
			if (aux2 == b) {
				return aux.botao + 1;
			}
			if (cond[aux.num + 1] == false) {
			fila.add(new Numero(aux.num + 1, aux.botao +1));
				cond[aux.num + 1] = true;
			}
			if (cond[aux2] == false) {
			fila.add(new Numero(aux2, aux.botao + 1));
				cond[aux2] = true;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for ( ; n > 0; n--) {
			int entrada1 = input.nextInt();
			int entrada2 = input.nextInt();
			if (entrada1 == entrada2) {
				System.out.println(0);
			} else {
				System.out.println(calcula(entrada1,entrada2));
			}
		}
		input.close();
	}
}


/*127
128 721
129 821 722 
130 921 822 723 227 
131 013 922 823 228 724 327 */

