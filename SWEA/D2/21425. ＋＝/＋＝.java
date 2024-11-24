import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int count = 0;

			while (A <= N && B <= N) {
				if (A < B) { // A와 B 중에서 더 큰 값을 선택하여 연산의 최소 횟수를 구함(더 큰 수로 빠르게 증가)
					A += B;
				} else {
					B += A;
				}
				count++;
			}
            System.out.println(count);
		}
	}
}