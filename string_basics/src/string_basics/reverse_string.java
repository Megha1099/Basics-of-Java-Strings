package string_basics;

public class reverse_string {
	public static void main(String[] args) {
		String str="java";
		rev(str);	
	}
	static void rev(String str)
	{
		String rever="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rever+=str.charAt(i);
		}
		System.out.println(rever);
	}
}
