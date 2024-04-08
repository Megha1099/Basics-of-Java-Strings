package string_basics;

public class Uniq_word {
	public static void main(String[] args) {
		String str="hi hi hello how are are are";
		uniqword(str);
	}
	static void uniqword(String str)
	{
		String []s=str.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			boolean flag=true;
			for(int j=0;j<=s.length-1;j++)
			{
				if(i!=j&&s[i].equalsIgnoreCase(s[j]))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			System.out.print(s[i]+" ");
		}
	}

}
