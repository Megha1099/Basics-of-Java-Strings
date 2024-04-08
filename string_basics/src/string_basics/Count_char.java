package string_basics;

public class Count_char {
	public static void main(String[] args) {
		String str="javaislanguageeee";
		char ch='j';
		countchar(str,ch);
	}
	static void countchar(String str, char ch)
	{
		int count=0;
		for(int i=0; i<=str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+"-->"+count);
	}

}
