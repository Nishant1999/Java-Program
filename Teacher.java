class Teacher extends Person
{
	private String sub;
	public Teacher(String n,int a,String s)
	{
		super(n,a);
		sub=s;
	}
	public Teacher(String n,int a)
	{
		super(n,a);
		sub=" ";
	}
	public Teacher(String n)
	{
		super(n);
		sub=" ";
	}
	public Teacher()
	{
		super();
		sub=" ";
	}
	public void show()
	{
		super.show();
		System.out.println("Subject:"+sub);
	}
}	