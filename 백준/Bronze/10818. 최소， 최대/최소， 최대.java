import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000000;
        int min = 1000000;
        for(int i=1; i<=n; i++){
            int val = Integer.parseInt(st.nextToken());
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }   
        }
        System.out.print(min + " " + max);
    }
}