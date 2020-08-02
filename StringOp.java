class StringOp
{
	public static void main(String ar[])
	{
		String s1,s2,s3,s4,s5,s6;
		char c[]={'A','B','C','D','E'};
		s1=new String(c);
		System.out.println(s1);
		s2=new String(c,1,3);
		System.out.println(s2);
		byte b[]={'X','Y','Z','E'};
		//System.out.println(s1);
		s3="hi";
		System.out.println(s3);
		s4=new String("hello");
		System.out.println(s4);
		s5=new String("hello");
		System.out.println(s5);
		s6="Helo";
		s6="hi";
		System.out.println(s6);
		boolean j;
		j=s3==s6;
		System.out.println(j);
	}
}