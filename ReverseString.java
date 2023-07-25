package vic;
import java.util.*;
import java.lang.StringBuilder;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a=sc.nextLine();
	StringBuilder v=new StringBuilder(a);
	v.reverse();
	System.out.println(v);
	
	String str="vicky";
	System.out.println(str.toUpperCase());
	
	
//	String str="hai";
//	String ans="";
//	for(int i=str.length()-1;i>=0;i--) {
//		ans=ans+str.charAt(i);
//	}
//	System.out.println(ans);
	
}
}
