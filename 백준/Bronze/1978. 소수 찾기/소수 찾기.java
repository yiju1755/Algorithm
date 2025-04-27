import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    static boolean isPrime(int num) {
        if (num < 2) return false; // 2보다 작은 수는 소수 아님
        for (int i = 2; i <= Math.sqrt(num); i++) { // √num까지만 검사
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
