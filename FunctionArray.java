package vic;
import java.util.Arrays;
import java.util.*;

public class FunctionArray {
	
	public static int[] sortArray() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]= new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vrr[]=sortArray();
		for(int a:vrr)
			System.out.print(a+" ");
		

	}

}
