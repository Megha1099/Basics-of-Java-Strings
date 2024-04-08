package string_basics;

public class Duplicate_word_remove {
	public static void main(String[] args) {
		String str="hi hi hi how kl";
		duplicateword(str);
	}
	static void duplicateword(String str)
	{
		String []st=str.split(" ");
		for(int i=0;i<=st.length-1;i++)
		{
			boolean flag=true;
			for(int j=i;j<=st.length-1;j++)
			{
				if(i!=j&&st[i].equalsIgnoreCase(st[j]))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(st[i]+" ");
			}
		}
	}

}
