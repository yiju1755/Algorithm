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
            int[] A = new int[Integer.parseInt(st.nextToken())];
            int[] B = new int[Integer.parseInt(st.nextToken())];
            int max=Integer.MIN_VALUE; // 초기값을 최소값으로 설정
            
            st = new StringTokenizer(br.readLine()); // 입력 받은 숫자열을 A, B 배열에 넣기
            for(int i=0; i<A.length; i++){
            	A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<B.length; j++){
            	B[j] = Integer.parseInt(st.nextToken());
            }
            
            int[] shortArr; // 짧은 숫자열, 긴 숫자열 구분하기
            int[] longArr;
            if(A.length < B.length){
                shortArr = A;
                longArr = B;
            }
            else{
                shortArr = B;
                longArr = A;
            }
            
            for(int k=0; k<=longArr.length-shortArr.length; k++){ // 마주보는 숫자 계산
            	int sum = 0;
            	for(int h=0; h<shortArr.length; h++){
                	sum += shortArr[h] * longArr[h+k];
                    }
                max = Math.max(sum, max);
                }
            System.out.println("#" + test_case + " " + max);
            }
        }
	}
