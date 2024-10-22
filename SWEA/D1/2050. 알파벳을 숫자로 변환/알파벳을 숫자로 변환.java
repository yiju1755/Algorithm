import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = 0;
        for(int i=0; i<str.length(); i++){
            a = str.charAt(i) - 64; // charAt(): 문자열의 특정 위치에 있는 문자를 가져옴
        	System.out.print(a + " ");
        }
	}
}