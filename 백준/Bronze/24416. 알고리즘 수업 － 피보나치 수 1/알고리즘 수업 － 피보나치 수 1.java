import java.io.*;
import java.util.*;

public class Main {
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        fib(N);
        fibonacci(N);

        System.out.println(cnt1 + " " + cnt2);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        }
        else {
            return (fib(n-1) + fib(n-2));
        }
    }

    private static int fibonacci(int n) {
        int[] f = new int[n];

        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
            cnt2++;
        }

        return f[n-1];
    }
}