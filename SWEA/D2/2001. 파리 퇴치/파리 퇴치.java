import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][N];
			int max = 0;
			
			// 배열 저장
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 최댓값 구하기
			for(int k=0; k<=N-M; k++) { // M*M가 N 배열을 벗어나지 않도록 설정
				for(int l=0; l<=N-M; l++) {
					int sum = 0; // M*M 합 초기화
					for(int x=k; x<k+M; x++) { // N 배열 내 M*M 합산하기
						for(int y=l; y<l+M; y++) {
							sum += arr[x][y];
						}
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println("#"+test_case+" "+max);
		}
	}
}