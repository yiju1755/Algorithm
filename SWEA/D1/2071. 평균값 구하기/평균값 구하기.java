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
            System.out.print("#"+test_case+" ");
            int[] a = new int[10];
            double sum = 0;
            for(int i=0; i<10; i++){
            	a[i] = Integer.parseInt(st.nextToken());
                sum += a[i];
            }
            System.out.println((int)Math.round(sum/10));
        }
	}
}