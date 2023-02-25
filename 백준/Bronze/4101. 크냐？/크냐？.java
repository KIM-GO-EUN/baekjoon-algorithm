import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            
            if(n1==0 && n2==0){
                break;
            }else if(n1>n2){
                sb.append("Yes");
                sb.append(" ");
            }else{
                sb.append("No");
                sb.append(" ");
            }
        }
        System.out.print(sb);
    }
}