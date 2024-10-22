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
            int[] primes = {2, 3, 5, 7, 11};
            int[] counts = new int[5]; // a, b, c, d, e의 카운트
        	System.out.print("#"+ test_case + " ");
            
            for (int i = 0; i < primes.length; i++) {
                while (N % primes[i] == 0) {
                    counts[i]++;
                    N /= primes[i];
                }
                System.out.print(counts[i]);
                if(i < primes.length-1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}