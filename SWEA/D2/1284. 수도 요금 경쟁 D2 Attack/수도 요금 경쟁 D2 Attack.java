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
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int A = 0; int B = 0;
            System.out.print("#"+test_case+" ");
            
            A = W * P;
            if(W>R){
                B = Q + (W-R) * S;
            }
            else{
                B = Q;
            }
            
            if(A>B){
                System.out.println(B);
            }
            else if(A<B){
                System.out.println(A);
            }
        }
	}
}