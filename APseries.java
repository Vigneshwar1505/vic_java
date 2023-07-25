package vic;

import java.util.*;

public class APseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a d and n");
				int a = sc.nextInt();
				int d = sc.nextInt();
				int n = sc.nextInt();
				int temp=a;
				for(int i=0;i<n;i++)
				{
					System.out.print(temp+",");
					temp=temp+d;
				}
				
        
	}

}
