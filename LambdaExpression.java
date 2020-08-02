interface A
{
	void me();
}
class Demo
{
	public void show(A a)
	{
		a.me();
	}
}
class LambdaExpression
{
	public static void main(String ar[])
	{
		Demo d=new Demo();
		d.show(()->System.out.println("hi"));
	}
}