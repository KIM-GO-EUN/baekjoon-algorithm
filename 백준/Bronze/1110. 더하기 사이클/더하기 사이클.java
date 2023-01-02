import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int empty = n;
        
        do{
            empty = ((empty % 10) * 10) + (((empty / 10) + (empty % 10)) % 10);
            count++;
            
        }while(n != empty);
            
        bw.write(Integer.toString(count));
        br.close();
        bw.flush();
        bw.close();
    }
}

