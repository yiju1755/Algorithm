import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine()); // 매매가의 일수
            int[] prices = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            // 뒤에서부터 최대 가격과 이익 계산
            long maxProfit = 0;
            int maxPrice = 0;

            for (int i = N - 1; i >= 0; i--) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i]; // 최대 가격 갱신
                } else {
                    maxProfit += (maxPrice - prices[i]); // 이익 계산
                }
            }

            sb.append("#").append(t).append(" ").append(maxProfit).append("\n");
        }

        System.out.print(sb.toString());
    }
}
