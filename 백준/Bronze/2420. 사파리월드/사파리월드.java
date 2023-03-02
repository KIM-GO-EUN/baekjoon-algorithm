import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        
        if(n-m<0){
            sb.append(-(n-m));
        }else if(n-m>=0){
            sb.append(n-m);
        }
        System.out.print(sb);
        
    }
}