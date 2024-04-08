package string_basics;

public class palin {
public static void main(String[] args) {
	String str="gadag";
	palin(str);
}
static void palin(String str)
{
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev+=str.charAt(i);
	}
	if(str.equalsIgnoreCase(rev))
	{
		System.out.println("the given string is palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
