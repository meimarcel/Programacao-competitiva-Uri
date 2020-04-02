package aquecimentoDaOBI2018;
 
import java.util.Scanner;
//import java.util.ArrayList;


public class F {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ArrayList<Integer> vetor = new ArrayList<>();
		/*ArrayList<Integer> aux = new ArrayList<>();
		aux.add(0);
		while(input.hasNext()) {
			int n = input.nextInt();
			for(int i = 0; i < n; i++) {
				vetor.add(input.nextInt());
			}
			int m = input.nextInt();
			int cont = 2;
			int cont2 = 1;
			while(true) {
				int x = cont2;
				while(x < vetor.size()) {
					vetor.set(x, 0);
					x += cont;
				}
				vetor.removeAll(aux);
				if(vetor.indexOf(m) == -1) {
					System.out.println("N");
					break;
				} 
				else if(vetor.indexOf(m) < cont) {
					System.out.println("Y");
					break;
				}
				cont++;
				cont2++;
			}
			vetor.clear();
		}*/
		while(input.hasNextLine()) {
			int n = input.nextInt();
			int[] vetor = new int[n];
			for(int i = 0; i < n; i++) {
				vetor[i] = input.nextInt();
			}
			int m = input.nextInt();
			int pos = 1;
			for(int s : vetor) {
				if(s == m) {
					break;
				}
				pos++;
				
			}
			System.out.println(pos);
			//int pos = vetor.indexOf(m) + 1;
			int cont = 2;
			while(true) {
				if(pos % cont == 0) {
					System.out.println("N");
					break;
				}
				else if(pos < cont) {
					System.out.println("Y");
					break;
				}
				pos = pos - (pos / cont);
				cont++;			
			}
			//vetor.clear();
		}
		input.close();
	}

}
