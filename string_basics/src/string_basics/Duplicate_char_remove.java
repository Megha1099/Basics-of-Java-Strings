package string_basics;

public class Duplicate_char_remove {
	public static void main(String[] args) {
		String str="jaaavav";
		duplicatechar(str);
	}
	static void duplicatechar(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			boolean flag=true;
			for(int j=i;j<=str.length()-1;j++)
			{
				if(i!=j&&str.charAt(i)==str.charAt(j))
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.print(str.charAt(i));
			}
//			else
//			{
//				System.out.print(str.charAt(i));
//			}
		}
	}

}
