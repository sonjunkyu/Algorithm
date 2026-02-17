import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<N; i++) {
            if (checkGroupWord()) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean checkGroupWord() throws IOException {
        boolean[] check = new boolean[26];
        String str = br.readLine();
        int prev = 0;

        for (int i=0; i<str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}