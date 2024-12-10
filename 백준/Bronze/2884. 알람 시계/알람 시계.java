import java.io.*;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LocalTime goTime = LocalTime.of(H, M);
        LocalTime wakeTime = goTime.minusMinutes(45);
        System.out.print(wakeTime.getHour()+" "+wakeTime.getMinute());
    }
}