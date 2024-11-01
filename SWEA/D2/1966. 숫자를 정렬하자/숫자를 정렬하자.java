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
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
            	num[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(num); // 오름차순 정렬 메서드
            
            System.out.print("#" + test_case + " ");
            for(int j=0; j<N; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
	}
}