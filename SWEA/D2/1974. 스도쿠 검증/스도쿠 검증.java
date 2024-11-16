import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] board = new int[9][9];

            // 입력받아 9x9 배열로 저장
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 결과 계산
            boolean isValid = checkSudoku(board);
            System.out.println("#" + test_case + " " + (isValid ? 1 : 0));
        }
    }

    // 스도쿠의 유효성 검증 함수
    public static boolean checkSudoku(int[][] board) {
        // 가로, 세로 검증
        for (int i = 0; i < 9; i++) {
            if (!isUnique(board[i]) || !isUnique(getColumn(board, i))) {
                return false;
            }
        }

        // 3x3 격자 검증
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isUnique(getSubGrid(board, i, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    // 배열에서 숫자의 중복 여부를 체크하는 함수
    public static boolean isUnique(int[] arr) {
        boolean[] seen = new boolean[10]; // 1~9의 숫자 중복 체크
        for (int num : arr) {
            if (num < 1 || num > 9 || seen[num]) {
                return false; // 숫자가 범위를 벗어나거나 중복된 경우
            }
            seen[num] = true;
        }
        return true;
    }

    // 열 데이터를 배열로 반환하는 함수
    public static int[] getColumn(int[][] board, int col) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++) {
            column[i] = board[i][col];
        }
        return column;
    }

    // 3x3 격자 데이터를 배열로 반환하는 함수
    public static int[] getSubGrid(int[][] board, int startRow, int startCol) {
        int[] subGrid = new int[9];
        int index = 0;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                subGrid[index++] = board[i][j];
            }
        }
        return subGrid;
    }
}
