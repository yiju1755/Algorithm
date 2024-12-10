import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        for(int i=0; i<9; i++){
            arr.add(Integer.parseInt(br.readLine()));
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }
        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}