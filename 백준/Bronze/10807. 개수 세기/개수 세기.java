import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<n; i++){
            arr[i] =  Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == v){
                count++;
            }
        }
        
        bw.write(Integer.toString(count));
        br.close();
        bw.flush();
        bw.close();
    }
}