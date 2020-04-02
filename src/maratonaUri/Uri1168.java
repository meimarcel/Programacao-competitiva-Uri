package maratonaUri;
import java.util.Scanner;

public class Uri1168 {
	
	public static int merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i = 0; i < n1; i++) {
			L[i] = A[p + i];
		}
		for(int i = 0; i < n2; i++) {
			R[i] = A[q + i + 1];
		}
		L[n1] = 900000000;
		R[n2] = 900000000;
		int x = 0;
		int y = 0;
		int c = 0;
		for (int k = p; k <= r; k++) {
			if (L[x] <= R[y]) {
				A[k] = L[x];
				x++;
			}
			else {
				A[k] = R[y];
				if (L[x] != 900000000) {
					c = c + ((L.length - x) - 1);
				}
				y++;
			}
		}
		return c;
	}
	
	public static int merge_sort(int A[], int p, int r) {
		if (p >= r) {
			return 0;			
		} else {
			int q = (int) Math.floor((p+r)/2);
			int c = merge_sort(A,p,q) +
			merge_sort(A,q+1,r) +
			merge(A,p,q,r);
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = 1;
		while (x <= n) {
			int tamanho = input.nextInt();
			int[] vagoes = new int[tamanho];
			String aux = input.nextLine();
			aux = input.nextLine();
			int y = 0;
			for (String s : aux.split(" ")) {
				vagoes[y] = Integer.parseInt(s);
				y++;
			}
			int swap = merge_sort(vagoes,0, (tamanho -1));
			System.out.printf("Optimal train swapping takes %d swaps.\n", swap);
			x++;
		}
		input.close();
		
	}
}
