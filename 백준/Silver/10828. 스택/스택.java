import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    private static int[] stack;
    private static int size;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        stack = new int[n];
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop());
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(size());
                    sb.append("\n");
                    break;
                case "empty":
                    sb.append(empty());
                    sb.append("\n");
                    break;
                case "top":
                    sb.append(top());
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int x){
        stack[size] = x;
        size++;
    }
    public static int pop(){
        if(size==0){
            return -1;
        }else{
            int tmp = stack[size-1];
            stack[size-1] = 0;
            size--;
            return tmp;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int top(){
        if(size==0){
            return -1;
        }else{
            return stack[size-1];
        }
    }
}