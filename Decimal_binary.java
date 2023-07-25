package vic;
import java.util.*;

public class Decimal_binary {
	
	public static void decimal2binary(int v) {
		
		int a[]=new int [1000];
		int i=0;
		while(v>0) {
			a[i]=v%2;
			v=v/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]);
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int v=sc.nextInt();
		
		decimal2binary(v);
	}

}
