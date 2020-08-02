class X extends {Person, Student}
{
	void a()
	{
		System.out.println("hello a");
	}
	String b()
	{
		System.out.println("hello b");
	}
	String c()
	{
		System.out.println("hello c");
	}
	Person d()
	{
		System.out.println("hello  person d");
	}
	Person e()
	{
		System.out.println("hello person e");
	}
	Student f()
	{
		System.out.println("hello student f");
	}
}
class Y extends X
{
	void a()
	{
		System.out.println("hi a");
	}
	String b()
	{
		System.out.println("hi b");
	}
	int c()
	{
		System.out.println("hi c");
	}
	Person d()
	{
		System.out.println("hi Person d");
	}
	Person e()
	{
		System.out.println("hi student e");
	}
	Student f()
	{
		System.out.println("hi student f");
	}
}
class UseY
{
	public static void main(String ar[])
	{
		Y y1=new Y();
		Y y2=new Y();
		Y y3=new Y();
		Y y4=new Y();
		Y y5=new Y();
		Y y6=new Y();
		y1.a();
		y2.b();
		y3.c();
		y4.d();
		y5.e();
		y6.f();
	}
}
	
