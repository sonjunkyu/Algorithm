import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int key = Integer.parseInt(st.nextToken());

            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(hashMap.getOrDefault(key, 0)).append(" ");
        }

        System.out.print(sb);
    }
}