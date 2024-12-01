import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char A = (char) br.read();
        int asciiCode = (int) A;
        System.out.print(asciiCode);
    }
}