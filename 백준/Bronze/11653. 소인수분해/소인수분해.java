import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) return;

        StringBuilder sb = new StringBuilder();

        for (int i=2; i*i<=N; i++) {
            while (N % i == 0) {
                sb.append(i).append("\n");
                N = N / i;
            }
        }

        if (N > 1) {
            sb.append(N).append("\n");
        }

        System.out.print(sb);
    }
}