import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=1; i<=9; i++){
            result = N * i;
            System.out.println(N+" * "+i+" = "+result);
        }
    }
}