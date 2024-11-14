import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int speed = 0; // 초기 속도 (0 m/s)
            int distance = 0; // 이동한 총 거리

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken()); // Command
                
                if (command == 1) { // 가속 명령일 경우
                    int acceleration = Integer.parseInt(st.nextToken());
                    speed += acceleration; // 속도에 가속도 추가
                } else if (command == 2) { // 감속 명령일 경우
                    int deceleration = Integer.parseInt(st.nextToken());
                    speed -= deceleration; // 속도에서 감속도 뺌
                    if (speed < 0) speed = 0; // 속도가 음수가 되면 0으로 설정
                }
                // 현재 속도만큼 이동 거리 추가
                distance += speed;
            }
            System.out.println("#" + test_case + " " + distance);
        }
    }
}
