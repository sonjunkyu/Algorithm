import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int index = 1;
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (index == num) {
                index++;

                while (!stack.isEmpty() && stack.peek() == index) {
                    index++;
                    stack.pop();
                }
            }
            else {
                stack.push(num);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        }
        else {
            System.out.println("Sad");
        }
    }
}