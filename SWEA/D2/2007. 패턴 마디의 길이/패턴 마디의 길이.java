import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String st = br.readLine();
            int length = 0;

            for (int i = 1; i <= 10; i++) { // 마디 길이 확인
                String pattern = st.substring(0, i); // 마디 추출
                StringBuilder repeatedPattern = new StringBuilder(); // append() 사용을 위해 가변 객체 StringBuilder 생성

                if (st.length() % i == 0) { // 전체 문자열 길이가 현재 마디의 길이로 나누어 떨어지는지 확인
                    for (int j = 0; j < st.length() / i; j++) { // 나누어 떨어진다 -> 해당 마디 반복
                        repeatedPattern.append(pattern);
                    }

                    if (repeatedPattern.toString().equals(st)) { // 전체 문자열과 비교
                        length = i; // 반복되는 마디 길이 저장
                        break;
                    }
                } else { // 나누어 떨어지지 않는다 -> 마디가 반복되는지 확인
                    StringBuilder partialPattern = new StringBuilder();
                    for (int j = 0; j < st.length() / i + 1; j++) {
                        partialPattern.append(pattern);
                    }

                    if (partialPattern.toString().startsWith(st)) { // 현재 마디가 문자열의 시작 부분과 일치하는지 확인
                        length = i; // 마디 길이 저장
                        break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + length);
        }
    }
}
