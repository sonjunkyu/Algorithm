import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int primeCount = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}