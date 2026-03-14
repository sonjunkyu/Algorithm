import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;

        for (int val : sorted) {
            if (!rankingMap.containsKey(val)) {
                rankingMap.put(val, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int key : origin) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.print(sb);
    }
}