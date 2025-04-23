import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c;
        String str_result = String.valueOf(result);

        List<String> list = new ArrayList<>();
        for (char ch : str_result.toCharArray()) {
            list.add(String.valueOf(ch));
        }

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (String s : list) {
                if (s.equals(String.valueOf(i)))
                    count++;
            }
            System.out.println(count);
        }
    }
}
