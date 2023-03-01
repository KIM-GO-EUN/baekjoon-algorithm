import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int v = 0;
        if(a==b && a==c){
            v = 10000 + (a*1000);
            sb.append(v);
        }else if(a==b || b==c || a==c){
            if(a==b || a==c){
                v = 1000 + (a*100);
                sb.append(v);
            }else{
                v = 1000 + (b*100);
                sb.append(v);
            }
        }else{
            if(a>b && a>c){
               v = a *100;
                sb.append(v);
            }else if(b>a && b>c){
                v = b * 100;
                sb.append(v);
            }else{
                v = c * 100;
                sb.append(v);
            }
        }
        System.out.print(sb);
    }
}