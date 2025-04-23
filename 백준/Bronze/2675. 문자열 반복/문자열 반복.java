import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            List<String> Slist = new ArrayList<>();
            for(char ch : S.toCharArray()){
                Slist.add(String.valueOf(ch));
            }

            StringBuilder P = new StringBuilder();

            for (String s : Slist) {
                for (int j = 0; j < R; j++) {
                    P.append(s);
                }
            }
            System.out.println(P);
        }
    }
}
