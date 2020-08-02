import java.util.*;
class Array
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		a=new int[5l];
		/*for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
			System.out.println(a[i]);
		}*/
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			sum+=a[j];
		}
		System.out.println("Sum is:"+sum);	
	}
	//int k;
	//System.out.println(k);
}