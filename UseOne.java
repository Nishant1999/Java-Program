class One1
{
	void a() 
	{
		System.out.println("hello a");
	}
	protected static void b()
	{
		System.out.println("hello b");
	}
	void c()
	{
		System.out.println("hello c");
	}
	 void d() 
	{
		System.out.println("hello d");
	}
	void e() 
	{
		System.out.println("hello e");
	}
	void f() 
	{
		System.out.println("hello f");
	}
	void g() 
	{
		System.out.println("hello g");
	}
	void h() 
	{
		System.out.println("hello h");
	}
	/*void a() 
	{
		System.out.println("hello a");
	}
	void a() 
	{
		System.out.println("hello a");
	}*/
}
class Two1 extends One1
{
	void a() 
	{
		System.out.println("hi a");
	}
	public void b() 
	{
		System.out.println("hi b");
	}
	void c() 
	{
		System.out.println("hi c");
	}
	protected void  static d() 
	{
		System.out.println("hi d");
	}
	void e() 
	{
		System.out.println("hi e");
	}
	void f() 
	{
		System.out.println("hi f");
	}
	void g() 
	{
		System.out.println("hi g");
	}
	void h()
	{
		System.out.println("hi h");
	}
}
class UseOne
{
	public static void main(String ar[])
	{
		Two1 t1=new Two1();
		Two1 t2=new Two1();
		Two1 t3=new Two1();
		Two1 t4=new Two1();
		Two1 t5=new Two1();
		Two1 t6=new Two1();
		Two1 t7=new Two1();
		Two1 t8=new Two1();
		Two1 t9=new Two1();
		t1.a();
		t2.b();
		t3.c();
		t4.d();
		t5.e();
		t6.f();
		t7.g();
		t8.h();
	}
}
		
