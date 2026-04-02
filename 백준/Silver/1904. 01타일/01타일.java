import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new int[1000001];

        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        return dp[n];
    }
}