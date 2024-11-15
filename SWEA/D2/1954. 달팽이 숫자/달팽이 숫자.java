import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[][] snail = new int[N][N];
            
			int x = 0;
			int y = 0;
			int d = 0;
			int num = 1;
			int[] dx = { 0, 1, 0, -1 };
			int[] dy = { 1, 0, -1, 0 };

			while (num <= N * N) {
				snail[x][y] = num++;
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N || snail[nx][ny] != 0) {
					d = (d + 1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];
				}
				x = nx;
				y = ny;
			}
			System.out.println("#" + test_case);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(snail[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}