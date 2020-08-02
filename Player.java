class Player extends Person
{
	private String sports;
	public Player(String n,int a,String s)
	{
		super(n,a);
		sports=s;
	}
	public Player(String n,int a)
	{
		super(n,a);
		sports=" ";
	}
	public Player(String n)
	{
		super(n);
		sports=" ";
	}
	public Player()
	{
		super();
		sports=" ";
	}
	public void show()
	{
		super.show();
		System.out.println("Sports:"+sports);
	}
}
		