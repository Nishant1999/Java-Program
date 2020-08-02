class Student extends Person
{
	private int rollno;
	public Student()
	{
		super();
		rollno=0;
	}
	public Student(String n)
	{
		super(n);
		rollno=0;
	}
	public Student(String n,int a)
	{
		super(n,a);
		rollno=0;
	}
	public Student(String n,int a,int r)
	{
		super(n,a);
		rollno=r;
	}
	public void show()
	{
		super.show();
		System.out.println("rollno:"+rollno);
	}
}