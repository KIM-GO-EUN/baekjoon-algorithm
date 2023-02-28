import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int y = Integer.parseInt(br.readLine());
        if(y%4==0 && y%100!=0){
            sb.append(1);
        }else if(y%4==0 && y%400==0){
            sb.append(1);
        }else{
            sb.append(0);
        }
        
        System.out.print(sb);
    }
}