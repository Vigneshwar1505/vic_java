package vic;
import java.util.*;

public class SumAndAvg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,a;
		for(int i=1;i<=n;i++) {
			a=sc.nextInt();
			sum+=a;
		}
		System.out.println("The sum is: " +sum);
		System.out.println("The avg is: " +sum/n);

	}

}
