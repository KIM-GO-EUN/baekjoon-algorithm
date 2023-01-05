import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sb.append("Case #");
            sb.append(i+1);
            sb.append(": ");
            sb.append(a+b);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}