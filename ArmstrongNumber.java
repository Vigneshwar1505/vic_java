package vic;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int d1,d2,d3; 
        int result;

        	d1=t%10;
        	t=t/10;
        	
        	d2=t%10;
        	t=t/10;
        	
        	d3=t%10;
        	
        	 result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if(n==result) {
        	System.out.println("YES");
        }
        else {
        	System.out.println("NO");
        }
	}

}
