import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int temp = card[i] + card[j] + card[k];

                    if (temp == M) {
                        result = temp;
                        System.out.println(result);
                        return;
                    }

                    if (temp < M && temp > result) {
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);
    }
}