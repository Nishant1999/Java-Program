import java.util.*;
class Pat1
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("enter String");
		String s1=sc.next();
		c=s1.length();
		if(c%2==0)
			System.out.println("Format not exist");
		else
		{
			for(int i=0;i<=c/2;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(" ");
				}
				System.out.println(s1.charAt(i));
			}
			for(int i=(c/2)+1;i<c;i++)
			{
				for(int j=0;j<c-i-1;j++)
				{
					System.out.print(" ");
				}
				System.out.println(s1.charAt(i));
			}
		}
	}
}