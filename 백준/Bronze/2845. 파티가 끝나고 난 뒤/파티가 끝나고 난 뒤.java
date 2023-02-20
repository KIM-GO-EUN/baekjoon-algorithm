import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int value = l*p;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<5; i++){
            sb.append(Integer.parseInt(st.nextToken())-value);
            sb.append(" ");
        }
        
        System.out.print(sb);
        
    }
}