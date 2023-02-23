import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] a = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] b = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int max = 0;
        int v1 = a[0] + b[1];
        int v2 = a[1] + b[0];
        
        if(v1>=v2){
            max = v2;
        }else{
            max = v1;
        }
        
        System.out.print(max);
        
        
        
        
        
        
        
    }
}