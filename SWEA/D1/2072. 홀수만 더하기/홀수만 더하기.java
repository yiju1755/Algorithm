import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        int[] num = new int[10];

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.print("#"+test_case+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = 0;
            for(int i=0; i<10; i++){
            	num[i] = Integer.parseInt(st.nextToken());
                if(num[i]%2==1){
                    a += num[i];
                }
            }
            System.out.println(a);
        }
	}
}