class Box
{
	private int width,height,length;
	public Box()
	{
		this(1,1,1);
	}
	public Box(int w)
	{
		this(w,1,1);
	}
	public Box(int w,int h)
	{
		this(w,h,1);
	}
	public Box(int w,int h,int l)
	{
		if(w<1)
			w=1;
		if(h<1)
			h=1;
		if(l<1)
			l=1;
		width=w;
		height=h;
		length=l;
	}
	public void show()
	{
		System.out.println(width+height+length);
	}
}
class UseBox
{
	public static void main(String ar[])
	{
		Box b1,b2,b3;
		b1=new Box(1);
		b2=new Box(2,3);
		b3=new Box(2,3,4);
		b1.show();
		b2.show();
		b3.show();
	}
}