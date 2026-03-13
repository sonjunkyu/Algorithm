import java.io.*;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;
        int average = 0;

        for (int i=0; i<5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] =num;
            sum += num;
        }

        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        average = sum / 5;
        sb.append(average).append("\n");
        sb.append(arr[2]);

        System.out.print(sb.toString());
    }
}