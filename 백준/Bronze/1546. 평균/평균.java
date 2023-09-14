import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<n; i++){
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        double max = 0;
        double sum = 0.0;

        for (int i=0; i<n; i++){
            if (max < arrN[i]) max = arrN[i];
            sum += arrN[i];
        }

        System.out.println(sum/max*100/n);
    }
}
