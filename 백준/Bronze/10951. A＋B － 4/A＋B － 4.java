import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                break;
            }

            StringTokenizer st = new StringTokenizer(line);

            if (st.hasMoreTokens()) {
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                sb.append(A + B).append("\n");
            }
        }

        System.out.print(sb);
    }
}