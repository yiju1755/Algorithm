import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken()) - 1; // K 번째 학생 인덱스 조정
            double[][] scoreArr = new double[student][3];
            double[] totalScores = new double[student];

            for (int i = 0; i < student; i++) // 학생 성적 정보 입력
            {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 3; j++)
                {
                    scoreArr[i][j] = Integer.parseInt(st.nextToken());
                }
                double midTest = scoreArr[i][0] * 0.35;
                double finTest = scoreArr[i][1] * 0.45;
                double assign = scoreArr[i][2] * 0.2;
                totalScores[i] = Math.round((midTest + finTest + assign) * 10) / 10.0; // 소수점 첫째 자리까지 반올림
            }

            double numStudentScore = totalScores[num]; // K 번째 학생의 점수
            // 학생 점수 내림차순 정렬
            double[] sortedScores = totalScores.clone(); // 원본 배열 복사
            Arrays.sort(sortedScores);
            double[] reversedScores = new double[student]; // 내림차순 배열
            
            for (int l = 0; l < student; l++)
            {
                reversedScores[l] = sortedScores[student - 1 - l]; // 내림차순으로 복사
            }

            // K 번째 학생의 랭크 찾기
            int rank = 0;
            for (int i = 0; i < student; i++)
            {
                if (reversedScores[i] == numStudentScore)
                {
                    rank = i; // 랭크를 찾는 과정
                    break;
                }
            }

            int score = rank / (student / 10); // 학점 계산
            String[] scoreMap = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            System.out.println("#" + test_case + " " + scoreMap[score]);
        }
    }
}
