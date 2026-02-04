import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            } else {
                sb.append(A + B).append("\n");
            }
        }

        System.out.print(sb);
    }
}