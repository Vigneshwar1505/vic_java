package vic;
import java.util.*;

public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the ext!!");
       String ext=sc.next();
       
       switch(ext)
       {
       case ".com":System.out.println("Commercial");
                   break;
       case ".org":System.out.println("Organisation");
                   break;           
       case ".net":System.out.println("network");
                   break;
       case ".gov":System.out.println("Government");
                   break;
                   default: System.out.println("Invalid");
       }
	}

}
