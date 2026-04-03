import java.io.*;

public class Main {
    static long[] seq = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        seq[0] = 1;
        seq[1] = 1;
        seq[2] = 1;
        seq[3] = 1;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(func(N)).append("\n");
        }

        System.out.print(sb);
    }

    private static long func(int n) {
        if (seq[n] == 0) {
            seq[n] = func(n-2) + func(n-3);
        }

        return seq[n];
    }
}