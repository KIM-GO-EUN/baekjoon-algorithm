import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            leftStack.push(str.charAt(i));
        }

        int n  = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String cmd = br.readLine();
            switch (cmd.charAt(0)){
                case 'L':
                    if(leftStack.empty()) break;
                    rightStack.push(leftStack.pop());
                    break;
                case 'D':
                    if(rightStack.empty()) break;
                    leftStack.push(rightStack.pop());
                    break;
                case 'B':
                    if(leftStack.empty()) break;
                    leftStack.pop();
                    break;
                case 'P':
                    leftStack.push(cmd.charAt(2));
                    break;
            }
        }
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}

