class Person
{
	private String name;int age;
	private static int count=0;
	Person(String n,int a)
	{
		if(a<1)
			a=1;
		name=n;
		age=a;
		count++;
	}
	Person(String n)
	{
		this(n,1);
		count++;
	}
	Person()
	{
		this(" ",1);
		count++;
	}
	public static int getCount()
	{
		return count;
	}
	/*public static void me()
	{
		Person t=new Person("de",45);
		t.show();
		count=10;
		System.out.println(getCount());
	}*/	
	public void show()
	{
		System.out.println(name+age);
	}
}
class UsePerson
{
	public static void main(String ar[])
	{
		Person p1,p2,p3,p4;
		p1=new Person();
		System.out.println(p1.getCount());
		p2=new Person("deep",17);
		System.out.println(p2.getCount());
		p3=new Person("deep");
		System.out.println(p3.getCount());
		p4=new Person("deep",-17);
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		Object o=new String("hi");
		System.out.println(o);
	}
}