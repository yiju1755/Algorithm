import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder room = new StringBuilder();
        for(int test_data=1; test_data<=T; test_data++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int count = 0;
            int a = 0;
            int b = 0;
            for(int i=1; i<=W; i++){
                for(int j=1; j<=H; j++){
                    ++count;
                    if(count==N){
                        a = i;
                        b = j;
                        break;
                    }
                }
            }
            room.append(b).append(String.format("%02d",a)).append("\n");
        }
        System.out.print(room);
    }
}