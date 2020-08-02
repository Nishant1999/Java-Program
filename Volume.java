class Volume
{
	private int width,length,height;
	public void set(int l,int w,int h)
	{
		if(l<=0)
			l=1;
		if(w<=0)
			w=1;
		if(h<=0)
			h=1;
		length=l;
		width=w;
		height=h;
	}
	public void set(int l,int w)
	{
		if(l<=0)
			l=1;
		if(w<=0)
			w=1;
		length=l;
		width=w;
		height=1;
	}
	public void set(int l)
	{
		if(l<=0)
			l=1;
		length=l;
		width=1;
		height=1;
	}
	public void set()
	{
		length=1;
		width=1;
		height=1;
	}
	public void show()
	{
		System.out.println("l="+length+" w="+width+" h="+height);
	}
	public int vol()
	{
		int t;
		t=length*width*height;
		return t;
	}
}