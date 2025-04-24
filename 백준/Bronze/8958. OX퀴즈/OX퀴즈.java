import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 0; test_case < T; test_case++){
            int score = 0;
            int n = 0;
            String line = br.readLine();

            for(int i=0; i<line.length(); i++){
                if(line.charAt(i) == 'O'){
                    n++;
                    score += n;
                }
                else{
                    n = 0;
                }
            }
            System.out.println(score);
        }

    }
}
