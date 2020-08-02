import java.util.*;
class Rational
{
	private int numer,denom,w;
	public Rational()
	{
		numer=0;
		denom=1;
	}
	Rational(int n)
	{
		numer=n;
		denom=1;
	}
	Rational(int n,int d)
	{
		if(d==0)
			d=1;
		if(d<0)
		{
			n=-n;
			d=-d;
		}
		if(n<0)
			w=GCD(-n,d);
		else
			w=GCD(n,d);
		numer=n/w;
		denom=d/w;
	}
	Rational(Rational r)
	{
		numer=r.numer;
		denom=r.denom;
	}
	int GCD(int n,int d)
	{
		int min,gcd=0;
		if(n>d)
			min=d;
		else
			min=n;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0&&d%i==0)
				gcd=i;
		}
		return gcd;
	}
	void set()
	{
		numer=0;
		denom=1;
	}
	void set(int n)
	{
		numer=n;
		denom=1;
	}
	public void set(int n,int d)
	{
		if(d==0)
			d=1;
		if(d<0)
		{
			n=-n;
			d=-d;
		}
		if(n<0)
			w=GCD(-n,d);
		else
			w=GCD(n,d);
		numer=n/w;
		denom=d/w;
	}
	void show()
	{
		System.out.println(numer+"/"+denom);
	}
}
class UseRational
{
	public static void main(String ar[])
	{
		Rational r1,r2,r3,r4,r5;
		r1=new Rational(4,5);
		r2=new Rational(40,-50);
		r3=new Rational(-8,16);
		r4=new Rational();
		r5=new Rational(r2);
		r4.set(5,6);
		r1.show();
		r2.show();
		r3.show();
		r4.show();
		r5.show();
	}
}
			
	
				