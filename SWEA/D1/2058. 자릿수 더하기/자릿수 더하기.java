import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int a = 0;
       while(num>0){
        	a = num%10;
            sum += a;
            num /= 10;
        }
        System.out.print(sum);
	}
}