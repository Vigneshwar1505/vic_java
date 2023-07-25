package vic;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int check = 0;
		int temp = 0;
		while(num>0) {
			temp = num%10;
			check = (check*10)+temp;
			num = num/10;
		}
		if(original==check) {
System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
	}

}
