package vic;

public class FirstLetterUpper {
public static void main(String[] args) {
	String str="my name is vicky";
	String ans="";
	int count=1;
	//My Name Is Vicky
	for(String s:str.split(" ")){
		char ch=s.charAt(0);//m
		ch=Character.toUpperCase(ch);
		ans+=ch;//M
		for(int i=1;i<s.length();i++) {
			ans+=s.charAt(i);
			count++;
			if(count==s.length()) {
				ans+=" ";
			}
		}
		count=1;
	}
	System.out.println(ans+" ");
}
}
