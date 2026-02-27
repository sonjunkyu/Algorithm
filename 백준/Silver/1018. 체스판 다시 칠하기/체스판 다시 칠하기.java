import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        for (int i=0; i<=N-8; i++) {
            for (int j=0; j<=M-8; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int count = 0;
        boolean firstColor = arr[x][y];

        for (int i=x; i<x+8; i++) {
            for (int j=y; j<y+8; j++) {
                // 올바른 색이 아닐경우 count 1 증가 
                if (arr[i][j] != firstColor) {
                    count++;
                }
                firstColor = !firstColor; // 옆 칸으로 갈 때 색 반전
            }
            firstColor = !firstColor; // 줄이 바뀔 때 색 반전
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}