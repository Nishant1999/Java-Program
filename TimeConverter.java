import java.util.*;
class TimeConverter
{
	public static void main(String a[])
	{
		Scanner sc;
		sc=new Scanner(System.in);
		long ms,sec,min;
		long temp,hr,days;
		System.out.print("Enter Milliseconds");
		ms=sc.nextLong();
		temp=ms;
		sec=(ms/1000)%60;
		min=((ms/(60*1000))%60);
		hr=((ms/(1000*60*60))%24);
		days=((ms/(1000*60*60*24))%30);
		long MILISECONDS=ms-(sec*1000);
		System.out.print(days+":");
		System.out.print(hr+":");
		System.out.print(min+":");
		System.out.print(sec+":");
		System.out.print(MILISECONDS);
	}
}