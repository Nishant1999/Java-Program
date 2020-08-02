class One
{
	private int n;
	private boolean flag=false;
	synchronized public void set(int i)
	{
		if(flag==true)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
			}
		}
		n=i;
		System.out.println("Set:"+n);
		flag=true;
		notifyAll();
	}
	synchronized public void show()
	{
		if(flag==false)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
			}
		}
			System.out.println("Show:"+n);
			flag=false;
			notifyAll();
	}
}
class Two extends Thread
{
	private One o;
	Two(One o)
	{
		this.o=o;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			o.set(i);
			i++;
		}
	}
}
class Three extends Thread
{
	private One o;
	Three(One o)
	{
		this.o=o;
	}
	public void run()
	{
		while(true)
		{
			o.show();
		}
	}
}
class Use
{
	public static void main(String ar[])
	{
		One o1=new One();
		Two a=new Two(o1);
		Three b=new Three(o1);
		a.start();
		b.start();
	}
}