import java.util.*;
import java.io.*;

class Solution {
    // 각 월의 마지막 날짜를 반환
    private static final int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // 두 날짜 간의 차이를 계산하는 메서드
    private static int calculateDays(int month1, int day1, int month2, int day2) {
        int days = 0; // 두 날짜 간의 총 일수를 저장

        // 첫 번째 날짜의 월부터 두 번째 날짜의 월 전까지의 모든 날을 더하기
        for (int month = month1; month < month2; month++) {
            days += daysInMonth[month];
        }
        // 두 번째 날짜의 일(day2)에서 첫 번째 날짜의 일(day1)을 빼서 두 날짜의 일수 차이를 계산
        // 이전에 계산한 days에 더하여 최종적인 일수를 구함
        days += (day2 - day1 + 1);
        
        return days;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            // 첫 번째와 두 번째 날짜 입력받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            // 두 날짜 간의 차이 계산
            int result = calculateDays(month1, day1, month2, day2);

            System.out.printf("#%d %d%n", test_case, result);
        }
    }
}