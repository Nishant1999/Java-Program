class Series
{
	public static void main(String args[])
	{
		for(int i=0;i<9;i++)
		{
			int a=(int)(Math.random()*100);
		}
		int c=1,r;
		while(a!=0)
		{
			r=a%10;
			a=a/10;
		for(int i=1;i<=10;i++)
		{
			for(int j=i+1;j<=i+1;j++)
			{
				if(a[i]<a[j])
				{
					c++;
				}
				else
				{
					c=1;
				}
			}
		}
		}
		System.out.println(c);
	}
}			
		