import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] s = new long[n+1];
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int k=1; k<=n; k++){
            s[k] = s[k-1] + Integer.parseInt(st.nextToken());
        }
        for(int q=0; q<m; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(s[j] - s[i-1]).append("\n");
        }
        System.out.println(sb);
    }
}