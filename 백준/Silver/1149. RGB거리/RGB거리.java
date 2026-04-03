import java.io.*;
import java.util.*;

public class Main {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        cost = new int[N][3];
        dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            cost[i][Red] = Integer.parseInt(st.nextToken());
            cost[i][Green] = Integer.parseInt(st.nextToken());
            cost[i][Blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];

        System.out.println(Math.min(Paint_cost(N- 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
    }

    private static int Paint_cost(int n, int color) {
        if (dp[n][color] == 0) {
            if (color == Red) {
                dp[n][Red] = Math.min(Paint_cost(n-1, Green), Paint_cost(n-1, Blue)) + cost[n][Red];
            }

            if (color == Green) {
                dp[n][Green] = Math.min(Paint_cost(n-1, Red), Paint_cost(n-1, Blue)) + cost[n][Green];
            }

            if (color == Blue) {
                dp[n][Blue] = Math.min(Paint_cost(n-1, Red), Paint_cost(n-1, Green)) + cost[n][Blue];
            }
        }

        return dp[n][color];
    }
}