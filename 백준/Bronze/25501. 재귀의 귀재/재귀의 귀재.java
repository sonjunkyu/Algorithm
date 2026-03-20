import java.io.*;

public class Main {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<T; i++) {
            String str = br.readLine();
            count = 0;
            sb.append(isPalindrome(str)).append(" ").append(count).append("\n");
        }

        System.out.print(sb);
    }

    private static int recursion(String s, int l, int r) {
        count++;

        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    private static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }
}