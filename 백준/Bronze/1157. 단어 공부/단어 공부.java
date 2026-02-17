import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String str = br.readLine().toUpperCase();

        for (int i=0; i<str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }

        int max = -1;
        char answer = '?';

        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer = (char) (i + 'A');
            } else if (arr[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}