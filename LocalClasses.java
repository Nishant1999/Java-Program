class LocalClasses
{
	private int a=1;
	private int b=2;
	private static int c=3;
	private static final int d=4;
	public void show()
	{
		int p=5;
		final int q=6;
		class Two
		{
			private int x=7;
			private final int y=8;
			//public static int z=9;
			private static final int s=10;
			public void display()
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(p);
				System.out.println(q);
				System.out.println(x);
				System.out.println(y);
				System.out.println(s);
			}
		}
		Two t=new Two();
		t.display();
	}
	public static void print()
	{
		int p=5;
		final int q=6;
		
		class Two
		{
			private int x=7;
			private final int y=8;
			//public static int z=9;
			private static final int s=10;
			public void display()
			{
				//System.out.println(a);
				//System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(p);
				System.out.println(q);
				System.out.println(x);
				System.out.println(y);
				System.out.println(s);
			}
		}
	}	
	public static void main(String ar[])
	{
		LocalClasses o=new LocalClasses();
		o.show();
		o.print();
	}
}