import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int[] piece = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<6; i++){
            sb.append(piece[i] - Integer.parseInt(st.nextToken()));
            sb.append(" ");
        }
        
        System.out.print(sb);
    }
}