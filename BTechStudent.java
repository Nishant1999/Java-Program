class BTechStudent extends Student
{
	private String branch;
	public BTechStudent()
	{
		super();
		branch=" ";
	}
	public BTechStudent(String n)
	{
		super(n);
		branch=" ";
	}
	public BTechStudent(String n,int a)
	{
		super(n,a);
		branch=" ";
	}
	public BTechStudent(String n,int a,int r)
	{
		super(n,a,r);
		branch=" ";
	}
	public BTechStudent(String n,int a,int r,String b)
	{
		super(n,a,r);
		branch=b;
	}
	public void show()
	{
		super.show();
		System.out.println("Branch:"+branch);
	}
}