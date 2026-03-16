import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i=0; i<N; i++) {
            String name = br.readLine();
            arr.add(name);
            hashMap.put(name, i+1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M; i++) {
            String str = br.readLine();

            if (Character.isDigit(str.charAt(0))) {
                int index = Integer.parseInt(str);
                sb.append(arr.get(index-1)).append("\n");
            }
            else {
                sb.append(hashMap.get(str)).append("\n");
            }
        }

        System.out.print(sb);
    }
}