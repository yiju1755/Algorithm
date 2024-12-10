import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);
        int numC = Integer.parseInt(C);
        int result = numA + numB - numC;
        String st;
        st = A + B;
        System.out.println(result);
        System.out.println(Integer.parseInt(st) - numC);
    }
}