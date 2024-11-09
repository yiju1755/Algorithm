import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        for (int test_case = 1; test_case <= T; test_case++) {
            int caseNumber = Integer.parseInt(br.readLine()); // 테스트 케이스 번호 입력
            String[] scores = br.readLine().split(" "); // 점수 목록 입력
            // .split(" ") 메서드는 문자열을 공백(" ") 기준으로 나누어 배열로 반환
            int[] frequency = new int[101]; // 점수 빈도를 저장할 배열 (0~100)

            // 점수 빈도 계산
            // num이 8이라면, frequency[8]의 값을 1 증가
            // frequency 배열에는 각 점수가 몇 번 나타났는지 저장됨!
            for (String score : scores) {
                int num = Integer.parseInt(score);
                frequency[num]++;
            }

            // 최빈수 찾기
            int mode = 0; // 최빈수
            int maxFrequency = 0; // 최대 빈도

            for (int i = 0; i <= 100; i++) {
                if (frequency[i] > maxFrequency) { // 최대 빈도를 가진 점수를 찾기
                    maxFrequency = frequency[i];
                    mode = i;
                } else if (frequency[i] == maxFrequency) {
                    mode = Math.max(mode, i); // 동일한 빈도일 때 더 큰 점수 선택
                }
            }
            System.out.println("#" + caseNumber + " " + mode);
        }
    }
}
