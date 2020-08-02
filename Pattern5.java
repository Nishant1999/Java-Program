class Pattern5
{
	public static void main(String ar[])
	{
		int a=(int)(Math.random()*100);
		if(a%2==0)
		{
			a=a+1;
		}
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i==1||i==a)
					System.out.print("*");
				else if(i==i&&(j==1||j==a))
					System.out.print("*");
				else if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}