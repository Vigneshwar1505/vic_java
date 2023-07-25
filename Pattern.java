  package vic;
  
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       
       //LEFT INCREASING TRIANGLE
//       for(int i=1;i<=n;i++) {
//    	   for(int j=1;j<=i;j++) {
//    		   System.out.print("*"); 
//    	   }
//    	   System.out.println();
//       }
       
       
       //LEFT DECREASING TRIANGLE
//       for(int i=1;i<=n;i++) {
//    	   for(int j=n;j>=i;j--) {
//    		   System.out.print("*");
//    	   }
//    	   System.out.println();
//       }
       
       
       //RIGHT INCREASING TRIANGLE
//       for(int i=1;i<=n;i++) {
//    	   for(int k=n;k>=i;k--) {
//    		   System.out.print(" ");
//    	   }
//    	   for(int j=1;j<=i;j++) {
//    		   System.out.print("*");
//    	   }
//    	   System.out.println();
//       }
       
       
       //RIGHT DECREASING TRIANGLE
//       for(int i=1;i<=n;i++) {
//    	   for(int k=1;k<=i;k++) {
//    		   System.out.print(" ");
//    	   }
//    	   for(int j=n;j>=i;j--) {
//    		   System.out.print("*");
//    	   }
//    	  System.out.println();
//       }
       
       //LEFT PASCAL'S TRIANGLE
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
       }
       for(int i=1;i<=n;i++) {
    	   for(int j=n;j>=i;j--) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
       }
	}

}
