package vic;
import java.util.*;
import java.lang.StringBuilder;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String v=sc.nextLine();
        StringBuilder a = new StringBuilder(v);
        int upper=0, lower=0, space=0,vowels=0,symbol=0;
        
        for(int i=0;i<a.length();i++) {
        	if(a.charAt(i)>=65 && a.charAt(i)<=90) {
        		upper++;
        	}
        	if(a.charAt(i)>=97 && a.charAt(i)<=122) {
        		lower++;
        	}
        	if(a.charAt(i)==32) {
        		space++;
        	}
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(space);
        System.out.println(a.length()-(upper+lower+space));
	}

}
