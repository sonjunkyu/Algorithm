import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int[] arr = new int[N];
        int X = sc.nextInt();

        for (int i=0; i<N; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }

        for (int i=0; i<N; i++) {
            if (arr[i] < X) {
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.print(sb);
    }
}