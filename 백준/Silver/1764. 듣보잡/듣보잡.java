import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();

        for (int i=0; i<N; i++) {
            hashSet.add(br.readLine());
        }

        List<String> list = new ArrayList<>();

        for (int i=0; i<M; i++) {
            String name = br.readLine();
            if (hashSet.contains(name)) {
                list.add(name);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        sb.append(list.size()).append("\n");

        for (String val : list) {
            sb.append(val).append("\n");
        }

        System.out.print(sb);
    }
}