class P
{
	private String name;
	private int age;
	public static int count=0;
	public P()
	{
		this(" ",1);
	}
	public P(String n)
	{
		this(n,1);
	}
	public P(String n,int a)
	{
		name=n;
		if(a<1)
			a=1;
		age=a;
		count++;
	}
}
class Use
{
	public static void main(String ar[])
	{
		System.out.println(P.count);
		P p1=new P();
		System.out.println(p1.count);
		P p2=new P();
		System.out.println(p2.count);
	}
}