package vic;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the values:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int n=sc.nextInt();
      System.out.print(a+","+b+",");
      for(int i=0;i<n;i++)
      {
    	  int c=a+b;
    	  System.out.print(c+",");
    	  a=b;
    	  b=c;
      }
	}

}
