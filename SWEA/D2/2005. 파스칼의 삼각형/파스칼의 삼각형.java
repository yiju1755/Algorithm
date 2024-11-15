import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine()); // 파스칼 삼각형의 크기
            int[][] triangle = new int[N][N];
            
            // 파스칼 삼각형 생성
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) { // j<=i -> 삼각형 모양
                    // j == 0: 현재 숫자가 가장 왼쪽에 있을 때 (배열의 첫 번째 위치)
                    // j == i: 현재 숫자가 가장 오른쪽에 있을 때 (배열의 마지막 위치)
                    if (j == 0 || j == i) {
                        triangle[i][j] = 1; // 첫 번째와 마지막은 항상 1
                    } else {
                        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                    }
                }
            }
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j]);
                    if (j < i) System.out.print(" "); // 숫자 간 공백
                }
                System.out.println(); // 줄 바꿈
            }
        }
    }
}
