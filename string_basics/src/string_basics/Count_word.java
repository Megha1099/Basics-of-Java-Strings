package string_basics;

public class Count_word {
	public static void main(String[] args) {
		String str="hi hi hello hi hi hi";
		String s="hi";
		countword(str,s);
	}
	static void countword(String str, String s)
	{
		int count=0;
		String[] st=str.split(" ");
		for(int i=0;i<=st.length-1;i++)
		{
			if(st[i].equalsIgnoreCase(s))
			{
				count++;
			}
		}
		System.out.println(s+"--->"+count);
	}

}
