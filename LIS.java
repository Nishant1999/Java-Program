class LIS
{
	public static void main(String ar[])
	{
		int a,b,count=1,lis=0;
		a=(int)(Math.random()*100);
		System.out.println("A:"+a);
		for(int i=2;i<=10;i++)
		{
			b=(int)(Math.random()*100);
			System.out.println("B:"+b);
			if(b>a)
			{
				count++;
				if(count>lis)
				{
					lis=count;
				}
			}
			else
			{
				count=1;
			}
			a=b;
		}
		System.out.println(lis);
	}
}
		