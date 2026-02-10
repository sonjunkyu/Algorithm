import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j=0; j<S.length(); j++) {
                char n = S.charAt(j);

                for (int k=0; k<R; k++) {
                    sb.append(n);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}