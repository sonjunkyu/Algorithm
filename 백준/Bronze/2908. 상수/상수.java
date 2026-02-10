import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s1 = st.nextToken();
        sb.append(s1).reverse();
        int val1 = Integer.parseInt(sb.toString());

        sb.setLength(0);

        String s2 = st.nextToken();
        sb.append(s2).reverse();
        int val2 = Integer.parseInt(sb.toString());

        System.out.println(Math.max(val1, val2));
    }
}