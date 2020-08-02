class SwitchCase
{
	public static void main(String arg[])
	{
		byte a=(byte)(Math.random()*100);
		//byte a=15;
		System.out.println("A:"+a);
		switch(a)
		{
			case a:
				System.out.println("Heloo");
				break;
			case 50:
				System.out.println("welcome");
				break;
			default:
				System.out.println("Bye");
		}
	}
}