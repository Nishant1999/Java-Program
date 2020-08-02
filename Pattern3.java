class Pattern3
{
	public static void main(String ar[])
	{
		int a=(int)(Math.random()*10);
		char c;
		System.out.println("A:"+a);
		for(int i=1;i<=a;i++)
		{
			c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
					c++;
			}
			for(int j=1;j<=2*(a-i)-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				c--;
				char r=(char)('A'+(a-1));
					if(c!=r)
					System.out.print(c);
			}
		 	System.out.println();
		}
	}
}