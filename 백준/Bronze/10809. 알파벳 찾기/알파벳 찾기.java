import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        for(char c = 'a'; c <= 'z'; c++){
            System.out.print(line.indexOf(c)+" ");
        }
    }
}
