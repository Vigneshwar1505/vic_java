package vic;
import java.util.*;

public class DupliateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		System.out.println("enter the values in array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length-1;j++) {
			for(int k=j+1;k<a.length;k++) {
				if(a[j]==a[k]&&(j!=k)) {
					count++;
					//System.out.println(count);
				}
			}
		}
		System.out.println(count);

	}

}
