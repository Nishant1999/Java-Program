class PatternSquare
{
	public static void main(String ar[])
	{
		int n=(int)(Math.random()*10);
		System.out.println("N:"+n);
		if(n%2==0)
		{
			n=n+1;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-2;j++)
			{
			     if(i==0||i==n-1)
				System.out.print("*");
			     else
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		