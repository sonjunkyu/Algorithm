import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = {1, 1, 2, 2, 2, 8};

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<6; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(arr[i] - num).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}