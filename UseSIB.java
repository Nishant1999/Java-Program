class SIB
{
	private int x,y;
	public static int z;
	public static final float PI=3.14f;
	static{
		System.out.println("i amm");
		z=5;
	}
	public static void me()
	{
	}
	static{
		
		System.out.println("i 2");
	}
}
class UseSIB
{
	public static void main(String ar[])
	{
		//SIB m=new SIB();
		SIB.me();
		//System.out.println(SIB.z);
	}
}
	