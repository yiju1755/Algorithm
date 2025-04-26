import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0){
                break;
            }

            int A = a * a;
            int B = b * b;
            int C = c * c;

            int max = Math.max(Math.max(a, b), c);

            if (max == a) {
                System.out.println((B + C == A)? "right" : "wrong");
            } else if (max == b) {
                System.out.println((A + C == B)? "right" : "wrong");
            } else {
                System.out.println((A + B == C)? "right" : "wrong");
            }
        }
    }
}
