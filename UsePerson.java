class UsePerson
{
	public static void main(String ar[])
	{
		Student p1,p2,p3,p4;
		p1=new Student();
		p2=new Student("deep",17);
		p3=new Student("deep",18,12345);
		p4=new Student("deep",-17,4567);
		BTechStudent t1,t2;
		//t1=new BTechStudent();
		//t2=new BTechStudent("deep",18,1234,"CS");
		t2=(BTechStudent)p3;
		t2.show();
		//p2.show();
		//p3.show();
		//p4.show();
		//t1.show();
		//t2.show();
	}
}