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
            String str = br.readLine();
            String year = str.substring(0, 4);
            String month =str.substring(4, 6);
            int m = Integer.parseInt(month);
            String day = str.substring(6, 8);
            int d = Integer.parseInt(day);
            boolean isVal = false;
            
            System.out.print("#"+test_case+" ");
            
            if(m==1 || m==3 || m==5 || m==7 || m== 8 || m==10 || m==12){
                if(d>0 && d<=31){
                    isVal = true;}
            }
             else if((m==2)){
                if(d>0 && d<=28){
                isVal = true;
                }
            }
            else if(m==4 || m==6 || m==9 || m==11){
                if(d>0 && d<=30){
                    isVal = true;
                }
            }
            else{
                isVal = false;
            }
            if(isVal){
                System.out.println(year+"/"+month+"/"+day);
            }
            else{
                System.out.println("-1");
            }
            }
        }
	}
