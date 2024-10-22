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
            int[] num = new int[10];
			int max = 0; // 제약 조건이 음수도 포함되었다면 Integer.MIN_VALUE가 적절
            
            for(int i=0; i<10; i++){
            	num[i] = Integer.parseInt(st.nextToken());
                if(max<num[i]){
                	max = num[i];
                }
            }
            System.out.println("#"+test_case+" "+max);
         }
	}
}