/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratonaDeProgramacaoSBC20171;

/**
 *
 * @author meimarcel
 */
import java.util.Scanner;

public class G {

  static final int MOD = 1_000_000_007;

  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    int T = in.nextInt();
    int M = in.nextInt();
    int N = in.nextInt();

    int range = N - M + 1;
    int res = 0;

    int[][] dp = new int[2][range];

    for (int i = 0; i < range; ++i) dp[0][i] = 1;

    int old = 0, cur = 1;
    for (int t = 1; t < T; ++t) {

      for (int i = 1; i < range-1; ++i) {
        dp[cur][i] = (dp[old][i-1] + dp[old][i+1]) % MOD;
        System.out.println(dp[cur][i] +" = "+dp[old][i-1]+" + "+dp[old][i+1]);
      }

      dp[cur][0] = dp[old][1];
      dp[cur][range-1] = dp[old][range-2];

      old = 1 - old;
      cur = 1 - cur;
    }

    for (int i = 0; i < range; ++i)
      res = (res + dp[old][i]) % MOD;

    System.out.println(res);
  }
}
