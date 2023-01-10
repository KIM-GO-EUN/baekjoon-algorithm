import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sb.append("*");
            }
            for(int k=2*n-2*i; k>=1; k--){
                sb.append(" ");
            }
            for(int l=1; l<=i; l++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                sb.append("*");
            }
            for(int k=1; k<=2*n-2*i; k++){
                sb.append(" ");
            }
            for(int l=1; l<=i; l++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}