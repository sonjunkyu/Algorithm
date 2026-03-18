import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            queue.add(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1) {
            for (int i=0; i<K-1; i++) {
                queue.add(queue.poll());
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.print(sb);
    }
}