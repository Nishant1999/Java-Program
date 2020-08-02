interface One
{
	//public int x=10;
	//public static int y=20;
	abstract void me();
	public void you(int i);
}
interface Two extends One
{
	//public static int x=30;
	//public int y=40;
	//public int z=50;
	public void me();
	public void you();
	/*public static void show()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
		System.out.println(One.x);
		System.out.println(One.y);
	}*/
	/*public void diplay()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(super.x);
		System.out.println(super.y);
		//System.out.println(super.z);
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
		//System.out.println(One.x);
		System.out.println(One.y);
		me();
		you();
		you(5);
		super.me();
		//super.you();
		super.you(5);
		One.me();
		One.you(5);
	}*/
}
class OnE implements Two
{
	public void me()
	{
		System.out.println("one hi");
	}
	public void you(int i)
	{
		System.out.println("one hello");
	}
	public void you()
	{
		System.out.println("two hello");
	}
}
class OneTwo
{
	public static void main(String ar[])
	{
		OnE t1=new OnE();
		//System.out.println(t1.x);
		//System.out.println(t1.y);
		//System.out.println(t1.z);
		t1.me();
		t1.you();
		t1.you(5);
		//Two.me();
		//Two.you();
		//Two.you(5);
	}
}
		
		
		 