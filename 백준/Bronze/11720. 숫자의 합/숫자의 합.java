import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
				
		String str = br.readLine();		
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += str.charAt(i) - '0';
		}
		
		// 결과 출력
		System.out.print(sum);
	}
}