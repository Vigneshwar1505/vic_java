package vic;
import java.util.*;


public class Binary_decimal {
	
	public static int binary2decimal(int binary) {
		int decimal=0,power=0;
		while(binary!=0) {
			int rem=binary%2;
			decimal+=rem*Math.pow(2,power);
			binary=binary/10;
			power++;
		}
		return decimal;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int binary=sc.nextInt();
		System.out.print(binary2decimal(binary));
		
	}

}
