import java.io.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = -1;

        for (int i=N/5; i>=0; i--) {
            int remainder = N - (5 * i);

            if (remainder % 3 == 0) {
                result = i + (remainder / 3);
                break;
            }
        }

        System.out.println(result);
    }
}