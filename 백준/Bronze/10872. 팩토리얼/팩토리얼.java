import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        if(N==0) {
            System.out.print("1");
        }
        else {
            for (int i = N; i > 0; i--) {
                sum *= i;
            }
            System.out.println(sum);
        }
    }
}