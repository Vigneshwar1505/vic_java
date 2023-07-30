package vic;

import java.util.Scanner;

public class SumOfanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int size =sc.nextInt();
		int A[]= new int [size];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
			sum=sum+A[i];
	}
		System.out.print("sum is "+sum);
	}
}
