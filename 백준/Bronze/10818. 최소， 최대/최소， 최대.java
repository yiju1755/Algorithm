import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[0];
        int min = arr[0];
        for(int j=0; j<N; j++){
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
        }
        System.out.print(min + " " + max);
    }
}