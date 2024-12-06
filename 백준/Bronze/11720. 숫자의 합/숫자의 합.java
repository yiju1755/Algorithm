import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        String Num = br.readLine();
        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(String.valueOf(Num.charAt(i)));
        }
        System.out.print(result);
    }
}