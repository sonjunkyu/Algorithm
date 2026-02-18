import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        for (int i=0; i<arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = -1;
        int maxRow = 0;
        int maxCol = 0;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        sb.append(max).append("\n");
        sb.append(maxRow).append(" ").append(maxCol);

        System.out.println(sb);
    }
}