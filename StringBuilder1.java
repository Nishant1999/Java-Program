class StringBuilder1
{
	public static void main(String ar[])
	{
		StringBuffer sb1=new StringBuffer("hi");
		String s2;
		int i=sb1.length();
		System.out.println(i);
		sb1.ensureCapacity(140);
		i=sb1.capacity();
		System.out.println(i);
		System.out.println(sb1.capacity());
		sb1.append(true);
		System.out.println(sb1);
		sb1.append(new StringBuilder("why"));
		System.out.println(sb1);
		sb1.append(3.1469287);
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		String t=null;
		sb1.append(t);
		System.out.println(sb1);
		sb1.insert(2,new char[]{'x','y'});
		System.out.println(sb1);
		sb1.setCharAt(2,'z');
		System.out.println(sb1);
		sb1.replace(3,7,"come");
		System.out.println(sb1);
		sb1.setLength(30);
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		s2=sb1.substring(4);
		System.out.println(sb1);
		//System.out.println(i);
		System.out.println(sb1);
		int j=sb1.indexOf("h");
		System.out.println(j);
	}
}