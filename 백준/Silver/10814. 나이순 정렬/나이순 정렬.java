import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][2];
        
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken();
            members[i][1] = st.nextToken();
        }

        Arrays.sort(members, (m1, m2) -> {
            return Integer.parseInt(m1[0]) - Integer.parseInt(m2[0]);
        });

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            sb.append(members[i][0]).append(" ").append(members[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}