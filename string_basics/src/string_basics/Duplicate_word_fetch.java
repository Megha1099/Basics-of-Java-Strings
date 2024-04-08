package string_basics;

public class Duplicate_word_fetch {
	public static void main(String[] args) {
		String str="java java is good is";
		dupword(str);
	}
	static void dupword(String str)
	{
		String []s=str.split(" ");
		int count;
		for(int i=0;i<=s.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i].equalsIgnoreCase(s[j])&&s[i]!=" ")
				{
					count++;
					s[j]="";
				}
			}
			if(count>1&&s[i]!="")
			System.out.print(s[i]+" ");
		}
		
		}

}
