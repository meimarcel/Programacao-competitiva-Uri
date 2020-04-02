package maratonaUri;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Cavalo {
	private int x;
	private int y;
	private int custo;
	
	public Cavalo(int x, int y, int custo) {
		this.x = x;
		this.y = y;
		this.custo = custo;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getCusto() {
		return custo;
	}

}

public class Uri1100 {
	public static int dfs(int x1, int y1, int x2, int y2) {
		final int[] dx = {1,1,-1,-1,2,2,-2,-2};
		final int[] dy = {2,-2,2,-2,1,-1,1,-1};
		Queue<Cavalo> fila = new LinkedList<>();
		fila.add(new Cavalo(x1,y1,0));
		while(!fila.isEmpty()) {
			Cavalo aux = fila.poll();
			if(aux.getX() == x2 && aux.getY() == y2) {
				return aux.getCusto();
			} 
			for(int i = 0; i < 8; i++) {
				int auxX = aux.getX() + dx[i];
				int auxY = aux.getY() + dy[i];
				if (auxX >= 1  && auxY >= 1 && auxX <= 8 && auxY <= 8) {
					fila.add(new Cavalo(auxX,auxY,(aux.getCusto() + 1)));
				}
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		int x1, x2, y1 ,y2;
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String[] entrada = input.nextLine().split(" ");
			x1 = (int) entrada[0].toCharArray()[0] - (int) 'a' + 1;
			y1 = (int) entrada[0].toCharArray()[1] - (int) '0';
			x2 = (int) entrada[1].toCharArray()[0] - (int) 'a' + 1;
			y2 = (int) entrada[1].toCharArray()[1] - (int) '0';
			int custo = dfs(x1,y1,x2,y2);
			System.out.printf("To get from %s to %s takes %d knight moves.\n" ,entrada[0], entrada[1],custo);
		}
		input.close();
	}

}
