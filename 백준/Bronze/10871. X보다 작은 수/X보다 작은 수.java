import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<n; i++){
            int val = Integer.parseInt(st.nextToken());
            
            if(val < x){
                sb.append(val);
                sb.append(" ");
            }
        }
        System.out.print(sb);
        
    }
}