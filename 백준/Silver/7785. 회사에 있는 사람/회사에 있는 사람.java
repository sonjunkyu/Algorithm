import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                hashSet.add(name);
            }
            else {
                hashSet.remove(name);
            }
        }

        ArrayList<String> result = new ArrayList<>(hashSet);
        Collections.sort(result, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (String s : result) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}