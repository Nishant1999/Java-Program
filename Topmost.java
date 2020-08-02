import java.util.*;
class Topmost
{
	public static void main(String ar[])
	{
		int temp,c;
		Scanner sc=new Scanner(System.in);	
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		c=a[a.length-2]+a[a.length-1];
		System.out.println("sum is"+c);
	}
}