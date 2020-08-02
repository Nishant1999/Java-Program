final class AAA
{
	 public final void me()
	{
		System.out.println("hello me");
	}
	final public void you(String x)
	{
		System.out.println(x);
	}
	public void i()
	{
		System.out.println("hello i");
	}
}
class BBB extends AAA
{
	/*public void me()
	{
		System.out.println("hi me");
	}*/
	public void you()
	{
		System.out.println("hi you");
	}
	public void we()
	{
		System.out.println("hi we");
	}
}
class UseA
{
	public static void main(String ar[])
	{
		/*BBB b1=new BBB();
		BBB b2=new BBB();
		BBB b3=new BBB();
		b1.me();
		b2.you();
		b3.you("dee");*/
		BBB a1;
		a1=new BBB();
		a1.me();
		a1.you("dee");
		a1.you();
		a1.i();
		a1.we();
	}
}