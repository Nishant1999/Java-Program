class NestedClasses
{
	private int a=1;
	private final int b=2;
	private static int c=3;
	private static final int d=4;
	public static class Two
	{
		private int x=5;
		private final int y=6;
		//private static int z=7;
		private static final int s=8;
		public void display()
		{
			//System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(x);
			System.out.println(y);
			System.out.println(s);
		}
	}
	public static void main(String ar[])
	{
		//NestedClasses n=new NestedClasses();
		NestedClasses.Two t1=new NestedClasses.Two();
		t1.display();
	}
}