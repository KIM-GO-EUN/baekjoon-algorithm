import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str = "";

        for (int i = 0; i < t; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
           
            while(st.hasMoreTokens()){
                StringBuilder rvs = new StringBuilder(st.nextToken());
                sb.append(rvs.reverse());
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}