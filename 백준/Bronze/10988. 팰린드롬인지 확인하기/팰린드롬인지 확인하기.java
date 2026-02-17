import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String original = br.readLine();
        int len = original.length();
        int result = 1;

        for (int i=0; i<len/2; i++) {
            if (original.charAt(i) != original.charAt(len - 1 - i)) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}