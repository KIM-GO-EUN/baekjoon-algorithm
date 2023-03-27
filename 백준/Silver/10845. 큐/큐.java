import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int[] queue = new int[10001];
    static int front = 0;
    static int rear = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str){
                case "push" :
				    push(Integer.parseInt(st.nextToken()));
				    break;
			    case "pop" :
				    sb.append(pop()).append("\n");
				    break;
			    case "size" :
				    sb.append(size()).append("\n");
				    break;
			    case "empty" :
				    sb.append(empty()).append("\n");
				    break;
			    case "front" :
				    sb.append(front()).append("\n");
				    break;
			    case "back" :
				    sb.append(back()).append("\n");
				    break;
            }
        } 
        System.out.println(sb);
    }
    public static void push(int x){
        queue[rear++] =  x;
    }   
    public static int pop(){
        if(front==rear){
            return -1;
        }else{
            int tmp = queue[front];
            front++;
            return tmp;
        }
    }  
    public static int size(){
        return rear - front;
    }    
    public static int empty(){
        if(rear - front==0){
            return 1;
        }else{
            return 0;
        }
    }     
    public static int front(){
        if(rear - front==0){
            return -1;
        }else{
            return queue[front];
        }
    }   
    public static int back(){
        if(rear - front==0){
            return -1;
        }else{
            return queue[rear-1];
        }
    }
}