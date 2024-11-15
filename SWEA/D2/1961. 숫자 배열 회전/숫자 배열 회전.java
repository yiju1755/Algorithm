import java.util.*;
import java.io.*;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            System.out.println("#"+test_case);
            
            // 입력된 배열 저장
            for(int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
            	for(int j=0; j<N; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
            	}
            }
            
            int[][] rotated_90 = new int[N][N]; // 90도 회전
            int[][] rotated_180 = new int[N][N]; //180도 회전
            int[][] rotated_270 = new int[N][N]; //270도 회전
            
            // 회전 후 배열에 저장
            for(int k=0; k<N; k++) {
            	for(int l=0; l<N; l++) {
            		rotated_90[k][l] = arr[N-1-l][k];
            		rotated_180[k][l] = arr[N-1-k][N-1-l];
            		rotated_270[k][l] = arr[l][N-1-k];
            	}
            }
            
            // 한줄씩 출력
            for(int m=0; m<N; m++){
            	printRow(rotated_90, m);
            	printRow(rotated_180, m);
            	printRow(rotated_270, m);
                System.out.println();
            }
        }
    }

    // 한줄 전체 출력하는 메서드
	private static void printRow(int[][] a, int n) {
		for(int i=0; i<a[n].length; i++) {
			System.out.print(a[n][i]);
		}
        System.out.print(" ");
	}
}