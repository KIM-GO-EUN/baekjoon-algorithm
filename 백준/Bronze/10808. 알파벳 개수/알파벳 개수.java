import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        int[] cnt = new int[26];
        char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' ,'k', 'l', 'm', 'n', 
                        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};        
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<alp.length; j++){
                if(s.charAt(i)==alp[j]){
                    cnt[j]++;
                }
            }
        }
        for(int i=0; i<cnt.length; i++){
            sb.append(cnt[i]);
            sb.append(" ");
        }  
        System.out.print(sb);
        
        
    }
}