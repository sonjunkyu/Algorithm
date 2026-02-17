import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String val : croatian) {
            if (str.contains(val)) {
                str = str.replace(val, "@");
            }
        }

        System.out.println(str.length());
    }
}