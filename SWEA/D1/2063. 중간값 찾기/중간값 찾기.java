import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[a];
        for(int i=0; i<a; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num); // 배열 정렬
        int mid_index = num.length / 2;
        System.out.print(num[mid_index]); // 중간값 인덱스 계산 후 해당 인덱스 출력
	}
}