package vic;
import java.util.*;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int f=1;
       for(int i=1;i<=num;i++) {
    	    f=f*i;
    	    //System.out.println(f);
       }
       System.out.println(f);
	}

}
