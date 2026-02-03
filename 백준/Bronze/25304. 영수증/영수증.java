import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextInt();
        int N = sc.nextInt();
        long sum = 0;
        int a, b;

        for(int i=0; i<N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a * b;
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}