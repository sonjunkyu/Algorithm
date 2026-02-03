import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        int A;
        int B;

        for (int i=0; i<T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            sb.append(A + B).append("\n");
        }

        System.out.print(sb);
    }
}