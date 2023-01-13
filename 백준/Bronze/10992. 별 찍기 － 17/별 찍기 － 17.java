import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n; i++){
            for(int k =1; k<=(n-i);k++){
                sb.append(" ");
            }

            for(int j =1; j<=(2*i-1) ; j++){
                if(i == n){
                    sb.append("*");
                }
                else{
                    if(j == 1 || j==(2*i-1))                    
                        sb.append("*");
                    else
                        sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}