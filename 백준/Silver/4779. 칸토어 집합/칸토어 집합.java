import java.io.*;
import java.util.*;

public class Main {
    static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            if (input.trim().isEmpty()) break;

            int N = Integer.parseInt(input);
            int length = (int) Math.pow(3, N);

            arr =new char[length];
            Arrays.fill(arr, '-');

            cantor(0, length);

            sb.append(arr).append("\n");
        }

        System.out.print(sb);
    }

    private static void cantor(int start, int length) {
        if (length == 1) return;

        int newLength = length / 3;

        for (int i = start + newLength; i < start + 2 * newLength; i++) {
            arr[i] = ' ';
        }

        cantor(start, newLength);

        cantor(start + 2 * newLength, newLength);
    }
}