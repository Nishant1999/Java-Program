class Matrix
{
	public static void main(String ar[])
	{	int temp,w,min,b=0,c=0;
		int a[][]=new int[3][4];
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					for(w=0;w<a.length;w++)
					{
					if(a[i][j]<a[k][w])
					{
						temp=a[i][j];
						a[i][j]=a[k][w];
						a[k][w]=temp;
					}
					}
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}