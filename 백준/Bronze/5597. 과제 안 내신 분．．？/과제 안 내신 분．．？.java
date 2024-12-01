import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> student = new ArrayList<>();

        int num = 0;

        for (int i = 1; i <= 30; i++) {
            student.add(i);
        }

        for (int j = 0; j < 28; j++) {
            num = Integer.parseInt(br.readLine());
            student.remove(Integer.valueOf(num));
        }
        
        System.out.println(student.get(0));
        System.out.print(student.get(1));
    }
}