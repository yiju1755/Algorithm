import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
       // int testCase = Integer.parseInt(br.readLine());
 
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
             
            System.out.println(a+b);    
            System.out.println(a-b);    
            System.out.println(a*b);    
            System.out.println(a/b);    
         
    }
}