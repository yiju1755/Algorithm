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
            String word = br.readLine();
            boolean isPal = false;
            int length = word.length();
            String[] check1 = new String[length];
            String[] check2 = new String[length];
            System.out.print("#"+test_case+" ");
            
            for(int i=0; i<length; i++){ //정방향 입력
            	check1[i] = String.valueOf(word.charAt(i));
            }
            
            /*for(int j=length-1; j>=0; j--){
            	check2[length-1-j] = String.valueOf(word.charAt(j));
            }*/
            
            for (int j = 0; j < length; j++) { //역방향 입력
                check2[j] = String.valueOf(word.charAt(length - 1 - j));
            }
            
            for(int k=0; k<length; k++){ //회문 검사
            	if(!check1[k].equals(check2[k])){
                    isPal = false;
                    break;
                }else{
                	isPal = true;
                }
               }
            if(isPal)
                System.out.println("1");
            else
                System.out.println("0");
        }
	}
}