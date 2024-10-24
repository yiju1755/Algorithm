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
            System.out.print("#"+test_case+" ");
            int num = Integer.parseInt(br.readLine());
            boolean[] checked = new boolean[10];
            int count = 0;
            int mult = 1;
             
            while(count!=10) {
                int n = num*mult++;
                while(n>0) {
                    if(!checked[n%10]) {
                        count++;
                        checked[n%10] = true;
                    }
                    n/=10;
                }
            }
            System.out.println(num*(mult-1));
        }
	}
}