import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;
        while(a>=b){
            if(a==b){
                sum++;
            	break;}
            b += 1;
            sum++;
        }
        System.out.print(sum);
            
	}
}