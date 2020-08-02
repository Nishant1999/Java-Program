class Sum9
{
	public static void main(String ar[])
	{
		int sum=0,n=9,b=0,c=0,temp,k=0;
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10);
			System.out.println(a[i]);
		}
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}*/
		for(int i=0;i<a.length;i++)
		{	
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==n)
				{
					b=i;
					c=j;
					k=1;
				}
			}
			if(k==1)
			{
				break;
			}
		}
		System.out.println(a[b]+","+a[c]);
	}
}