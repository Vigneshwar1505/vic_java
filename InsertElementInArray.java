package vic;
import java.util.*;
import java.util.Arrays;

public class InsertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the num:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values in array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the index:");
		int index=sc.nextInt();
		System.out.println("enter the value:");
		int value=sc.nextInt();
		
		for(int j=arr.length-1;j>index;j--) {
			arr[j]=arr[j-1];
		}
		arr[index]=value;
		System.out.println(Arrays.toString(arr));

	}

}
