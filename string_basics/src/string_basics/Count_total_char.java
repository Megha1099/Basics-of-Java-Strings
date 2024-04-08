package string_basics;

public class Count_total_char {
	public static void main(String[] args) {
		String str="jaa is goo doo ";
		countochar(str);
	}
	static void countochar(String str)
	{
		int cnt=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' ')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
