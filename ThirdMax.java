import java.util.*;
class ThirdMax
{
	public static void main(String arg[])
	{
		int max,smax,tmax;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first value");
		int a=sc.nextInt();
		System.out.print("enter second value");
		int b=sc.nextInt();
		System.out.print("enter third value");
		int c=sc.nextInt();
		System.out.print("enter fourth value");
		int d=sc.nextInt();
		if(a>b)
		{
			max=a;
			smax=b;
		}
		else
		{
			max=b;
			smax=a;
		}
		if(c>max)
		{
			//tmax=smax;
			smax=max;
			max=c;
		}
		else
		{
			if(c>smax)
			{
				//tmax=smax;
				smax=c;
			}
			/*else
			{
				tmax=c;
			}*/
		}
		if(d>max)
		{
			//tmax=smax;
			smax=max;
			max=d;
		}
		else
		{
			if(d>smax)
			{
				//tmax=smax;
				smax=d;
			}
			/*else
			{
				tmax=d;
			}*/
		}
		System.out.println("Thirdmax is:"+smax);
	}
}