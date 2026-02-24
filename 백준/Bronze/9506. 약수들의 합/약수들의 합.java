import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i=1; i<n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i=0; i<list.size(); i++) {
                    if (i < list.size()-1) {
                        sb.append(list.get(i)).append(" + ");
                    } else {
                        sb.append(list.get(i)).append("\n");
                    }
                }
            } else {
                sb.append(n).append(" is NOT perfect.").append("\n");
            }
        }

        System.out.print(sb);
    }
}