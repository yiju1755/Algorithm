import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] T_person = new int[6];
        int order_T = 0;
        int order_P1 = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            T_person[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Arrays.sort(T_person);

        for (int j = 0; j < T_person.length; j++) {
            if (T_person[j] < T && T_person[j] > 0) {
                order_T += 1;
            }
            else {
                order_T += T_person[j] / T;
                if (T_person[j] % T > 0) {
                    order_T++;
                }
            }
        }
        int order_P = N / P;
        if (N % P > 0) {
            order_P1 = N % P;
        }
        System.out.println(order_T);
        System.out.println(order_P + " " + order_P1);
    }
}
