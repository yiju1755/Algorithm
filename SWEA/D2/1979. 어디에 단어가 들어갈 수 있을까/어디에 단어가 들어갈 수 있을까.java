import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 퍼즐 크기 N
            int K = Integer.parseInt(st.nextToken()); // 단어 길이 K
            
            int[][] puzzle = new int[N][N]; // 퍼즐 데이터
            
            // 퍼즐 배열 입력
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int count = 0; // K 길이에 맞는 자리의 개수
            
            // 가로 방향 탐색
            for (int i = 0; i < N; i++) {
                int continuous = 0; // 연속된 1의 개수
                for (int j = 0; j < N; j++) { // 열을 왼쪽에서 오른쪽으로 탐색
                    if (puzzle[i][j] == 1) {
                        continuous++;
                    } else {
                        if (continuous == K) count++;
                        continuous = 0; // 초기화
                    }
                }
                // 마지막 칸에서 확인
                // 연속된 숫자가 배열의 끝까지 이어질 수 있기 때문 -> else문 실행 안하기 때문에 한번 더 확인해줌
                if (continuous == K) count++;
            }
            
            // 세로 방향 탐색
            for (int j = 0; j < N; j++) {
                int continuous = 0; // 연속된 1의 개수
                for (int i = 0; i < N; i++) { // 행을 위에서 아래로 탐색
                    if (puzzle[i][j] == 1) {
                        continuous++;
                    } else {
                        if (continuous == K) count++;
                        continuous = 0; // 초기화
                    }
                }
                // 마지막 칸에서 확인
                if (continuous == K) count++;
            }
            System.out.println("#" + test_case + " " + count);
        }
    }
}
