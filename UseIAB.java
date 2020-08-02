class IAB
{
	private int x,y;
	{
		x=10;
		System.out.println("X:"+x);
	}
	public void set(int i,int j)
	{
		x=i;
		y=j;
	}
	{
		y=10;
		System.out.println("Y:"+y);
	}
	public IAB()
	{
		x=y=0;
		System.out.println("hello");
	}
}
class UseIAB
{
	public static void main(String ar[])
	{
		IAB k=new IAB();
	}
}