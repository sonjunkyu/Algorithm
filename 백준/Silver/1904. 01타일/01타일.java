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
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = (fibonacci(n-1) + fibonacci(n-2)) % 15746;

        return dp[n];
    }
}