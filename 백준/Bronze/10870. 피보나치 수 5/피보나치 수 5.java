import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fib(N));
    }

    private static int fib(int n) {
        if (n == 0 || n == 1) return n;

        return fib(n-1) + fib(n-2);
    }
}