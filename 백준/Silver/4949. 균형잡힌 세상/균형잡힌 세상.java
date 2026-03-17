import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();

            if (line.equals(".")) {
                break;
            }

            sb.append(check(line)).append("\n");
        }

        System.out.print(sb);
    }

    private static String check(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                stack.pop();
            }
            else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "yes" : "no";
    }
}