package maratonaUri;


import java.util.Scanner;

public class Uri1579 {
	
	static int [][] dp;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try{
			int numTestCases = scanner.nextInt();
			
			for (int k = 0; k < numTestCases; k++){
				int nPanels = scanner.nextInt();
				int nTrucks = scanner.nextInt();
				int freight = scanner.nextInt();
				
				int pesos[] = new int[nPanels];
				
				for (int p = 0; p < nPanels; p++) pesos[p] = scanner.nextInt();
				
				int melhor = Integer.MAX_VALUE;
				int maisPesado = 0;
				
				for (int i = 0; i < nTrucks; i++ ){
					dp = new int[111][11];
					System.out.println("Loop: "+i);
					int cur = maior(pesos, 0, i);
					
					if (cur * freight * nTrucks < melhor){
						melhor = cur * freight * nTrucks;
						maisPesado = cur;
					}
				}
				System.out.println(maisPesado + " $" + melhor);
			}
			
		}finally {
			scanner.close();
		}
	}

	private static int maior(int[] pesos, int i, int k) {
		
		if (i >= pesos.length) return 0;
		
		//if (dp[i][k] != -1)
		if (dp[i][k] != 0)
		    return dp[i][k];

		  int best = Integer.MAX_VALUE;
		  
		  if (k > 0) {
		    int cur = 0;
		    for (int j = i; j < pesos.length; ++j) {
		      cur += pesos[j];
		      System.out.println("a5.1: "+cur);
		      int xx = maior(pesos, j + 1, k - 1);
		      int t = Math.max(cur, xx);
		      best = Math.min(best, t);
		      System.out.println("a1: "+best);
		      System.out.println("a2: "+j);
		      System.out.println("a3: "+i);
		      System.out.println("a4: "+k);
		      System.out.println("a5: "+cur);
		      
		    }
		  } else {
		    best = 0;
		    for (int j = i; j < pesos.length; ++j) {
		    	best += pesos[j];
		    	System.out.println("b1: "+best);
		    	System.out.println("b2: "+j);
		    	System.out.println("b3: "+i);
		    	System.out.println("b4: "+k);
		    }
		  }
		  System.out.println();
		  return dp[i][k] = best;
	}

}
