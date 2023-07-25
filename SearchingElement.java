package vic;

import java.util.*;

public class SearchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int key;
		System.out.println("Enter the size of an Array");
		int size= sc.nextInt();
		System.out.println("Enter the key"); 
        int A[]=new int[size];
        key=15;
        for(int i=0;i<A.length;i++) 
        {
        	A[i]=sc.nextInt();
        	if(A[i]==key)
        	{
        		System.out.println(i);
        	
        		//System.exit(0);
        	}
        }
        	
       
}
}
