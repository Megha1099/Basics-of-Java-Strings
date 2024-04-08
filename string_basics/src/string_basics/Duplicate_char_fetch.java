package string_basics;

public class Duplicate_char_fetch {
	public static void main(String[] args) {
		String str="javaaavjgg";
		dupchar(str);
	}
	static void dupchar(String str)
	{
		char [] ch=str.toCharArray();
		int count;
		for(int i=0;i<=ch.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='0')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1&&ch[i]!= '0')
			System.out.println(ch[i]);
		}
	}

}
