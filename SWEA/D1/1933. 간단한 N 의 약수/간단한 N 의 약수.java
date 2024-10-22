import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 0;
        for(int i=1; i<=N; i++){
            if(N%i==0){
            	a = i;
                if(i==N){
                    System.out.print(a);
                }
                else{
        		System.out.print(a+" ");
                }
            }
        }
	}
}