import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            set.add(str);
        }

        String[] words = set.toArray(new String[0]);

        Arrays.sort(words, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            else {
                return s1.length() - s2.length();
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String s : words) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}