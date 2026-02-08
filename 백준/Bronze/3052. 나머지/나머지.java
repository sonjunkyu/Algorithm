import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];

        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());

            arr[num % 42] = true;
        }

        int count = 0;

        for (boolean r : arr) {
            if (r) {
                count++;
            }
        }

        System.out.println(count);
    }
}