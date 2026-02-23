import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        long result = 0;
        int power = 1;
        int num = 0;

        for (int i=N.length()-1; i>=0; i--) {
            char ch = N.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                num = ch - 'A' + 10;
            }

            result += (long) num * power;

            power *= B;
        }

        System.out.println(result);
    }
}