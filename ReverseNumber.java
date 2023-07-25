package vic;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int rev=0,rem;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
		    n=n/10;	
		}
		System.out.println(rev);

	}

}
