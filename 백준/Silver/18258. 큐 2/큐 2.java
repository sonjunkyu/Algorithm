import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.offer(num);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(queue.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    }
                    else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}