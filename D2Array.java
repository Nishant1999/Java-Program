class D2Array
{
	public static void main(String ar[])
	{
		int a[][][];
		a=new int[2][][];
		a[0]=new int [3][];
		a[0][0]=new int[2];
		a[0][1]=new int[4];
		a[0][2]=new int[3];
		a[1]=new int[2][];
		a[1][0]=new int[3];
		a[1][1]=new int[4];
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
		   System.out.println(a[i][j]);
		}
	}
}