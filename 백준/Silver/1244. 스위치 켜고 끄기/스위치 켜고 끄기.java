import java.util.Scanner;

public class Main{
	static Scanner scan = new Scanner(System.in);
	static int[] arr;
	static void man(int swNum) {
		for(int i =swNum; i<arr.length; i+=swNum) {
			arr[i]^=1;
		}
	}
	static void woman(int swNum) {
		int left = swNum -1; 
		int right = swNum + 1; 
		
		while(true) {
			if(left < 1 || right >= arr.length) break;
			if(arr[left] != arr[right]) break;
			left--;
			right++;
		}
		for(int i=left+1; i<=right-1; i++) {
			arr[i] ^= 1;
		}
	}
	static void switchPrint() {
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			if(i%20==0) System.out.println();
		}
	}
	public static void main(String[] args) {
		int  n = scan.nextInt() + 1;
		arr  = new int[n];

		for(int i=1; i<n; i++) { 
			 arr[i] = scan.nextInt();
		}
		int stu = scan.nextInt();
		
		for(int s= 1; s<=stu; s++) {
			int gender = scan.nextInt();
			int swNum = scan.nextInt();
			
			if(gender ==1) {
				man(swNum);
			}else if(gender == 2){
				woman(swNum);
			}
		}
		switchPrint(); 
	}
}