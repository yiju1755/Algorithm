import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<8; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        boolean asc = true;
        boolean des = true;
        for(int j=1; j<list.size(); j++){
            if(list.get(j-1) > list.get(j)){
                asc = false;
            }
            if(list.get(j-1) < list.get(j)){
                des = false;
            }
        }

        if(asc){
            System.out.println("ascending");
        }
        else if(des){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }

    }
}
