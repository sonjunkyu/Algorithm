import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[][] paper = new boolean[100][100];
        int totalArea = 0;

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int r=x; r<x+10; r++) {
                for (int c=y; c<y+10; c++) {
                    if (!paper[r][c]) {
                        paper[r][c] = true;
                        totalArea++;
                    }
                }
            }
        }

        System.out.println(totalArea);
    }
}