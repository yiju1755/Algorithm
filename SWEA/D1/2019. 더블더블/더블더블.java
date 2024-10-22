import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a = 1;
        
        for(int i=0; i<=num; i++){
            System.out.print(a);
            if(i < num){
                System.out.print(" ");
            }
            a *= 2;
        }
	}
}