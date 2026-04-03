import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        max = arr[0];

        recur(N-1);

        System.out.println(max);
    }

    private static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);

            max = Math.max(dp[n], max);
        }

        return dp[n];
    }
}