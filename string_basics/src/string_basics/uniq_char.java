package string_basics;

public class uniq_char {
	public static void main(String[] args) {
		String str="javajvh";
		uniq(str);
	}
	static void uniq(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			boolean flag=true;
			for(int j=0;j<=str.length()-1;j++)
			{
				if(i!=j&&str.charAt(i)==str.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(str.charAt(i));
			}
		}
	}

}
