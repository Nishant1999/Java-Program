
public class Money
{
	private int rs,paisa;
	/*Money(int r,int p)
	{
		if(r<0)
			r=0;
		if(p<0)
			p=0;
		r=r+p/100;
		p=p%100;
		rs=r;
		paisa=p;
	}*/
	public void set()
	{
		rs=0;
		paisa=0;
	}
	public void set(int r)
	{
		if(r<0)
			r=0;
		rs=r;
		paisa=0;
	}
	public void set(int r,int p)
	{
		if(r<0)
			r=0;
		if(p<0)
			p=0;
		r=r+p/100;
		p=p%100;
		rs=r;
		paisa=p;
	}
	public void set(double t)
	{
		int c,q;
		c=(int)(t*100);
		q=c;
		c=c/100;
		q=q%100;
		rs=c;
		paisa=q;
	}
	public void show()
	{
		System.out.print(rs+".");
                if(paisa<10)
		System.out.print("0");
		System.out.println(paisa);
	}
	/*public Money add(Money x)
	{
		Money t=new Money();
		t.rs=rs+x.rs;
		t.paisa=paisa+x.paisa;
		t.rs+=t.paisa/100;
		t.paisa%=100;
		return t;
	}*/
	public String toString()
	{
		return this.rs+"."+this.paisa;
	}
	public boolean equals(Object o)
	{
		Money t=(Money)o;
		if(this.rs==t.rs&&this.paisa==t.paisa)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Money clone()throws CloneNotSupportedException
	{
		Object o;
		o=super.clone();
		return ((Money)o);
	}
}
