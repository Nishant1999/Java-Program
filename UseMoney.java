
class UseMoney
{
	public static void main(String ae[])throws CloneNotSupportedException
	{
		Money m1,m2,m3,m4,m5,m6;
		m1=new Money();
		m2=new Money();
		m3=new Money();
		m4=new Money();
		m5=new Money();
		m1.set();
		m2.set(6,40);
		m3.set(6,40);
		m4.set(4,5);
		m4.set(5.67);
		//m1.show();
		//m2.show();
		//m3=m1.sub(m2);
		//m3.show();
		//m4.show();
		//m5.show();
		System.out.println(m1);
		boolean b=m1.equals(m2);
		System.out.println(b);
		m5=m1.clone();
		m5.show();
	}
}