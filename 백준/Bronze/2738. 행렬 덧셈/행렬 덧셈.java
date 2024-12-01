import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int num = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int k = 0; k < N; k++) {
            st = new StringTokenizer(br.readLine());
            for (int l = 0; l < M; l++) {
                num = Integer.parseInt(st.nextToken());
                sb.append(arr[k][l] + num).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}