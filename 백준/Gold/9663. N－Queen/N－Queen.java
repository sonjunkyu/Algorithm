import java.io.*;

public class Main {
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        backtracking(0);
        System.out.println(count);
    }

    public static void backtracking(int row) {
        if (row == N) { // 정답 출력
            count++;
            return;
        }

        for (int i = 0; i < N; i++) { // 모든 경우의 수 탐색
            arr[row] = i;

            if (check(row)) { // 가지치기 유효성 검사
                backtracking(row + 1);
            }
        }
    }

    public static boolean check(int row) {
        for (int i = 0; i < row; i++) {
            if (arr[row] == arr[i]) { // 일직선 공격 (같은 행)
                return false;
            }
            else if (Math.abs(row - i) == Math.abs(arr[row] - arr[i])) { // 대각선 공격
                return false;
            }
        }

        return true;
    }
}