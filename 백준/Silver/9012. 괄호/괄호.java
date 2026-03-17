import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            boolean isPossible = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(') {
                    stack.push(c);
                }
                else if (stack.isEmpty()) {
                    isPossible = false;
                    break;
                }
                else {
                    stack.pop();
                }
            }

            if (isPossible && stack.isEmpty()) {
                sb.append("YES").append("\n");
            }
            else {
                sb.append("NO").append("\n");
            }

            stack.clear();
        }

        System.out.print(sb);
    }
}