package vic;
import java.util.*;

public class GPseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the values of a r and n");
     int a= sc.nextInt();
     int r= sc.nextInt();
     int n= sc.nextInt();
     int temp=a;
     for(int i=0;i<n;i++)
     {
    	 System.out.print(temp+",");
    	 temp=temp*r;
     }
	}

}
