class NewString
{
	public static void main(String ar[])
	{
		/*int l;
		String s1="Hello";
		l=s1.length();
		System.out.println(l);
		l="welcom".length();
		System.out.println(l);*/
		/*boolean b;
		String s1="amit",s2="WELL",s3;
		b=s1.equals(s2);
		System.out.println(b);
		b=s1.equals("Anil");
		System.out.println(b);
		b="hello".equals("Hello");
		System.out.println(b);
		b=s1.equalsIgnoreCase("Amit");
		System.out.println(b);
		b="welcome".equalsIgnoreCase("WELCOME");
		System.out.println(b);*/
		/*String s1="amit",s2="WELL",s3;
		s3=s1.toUpperCase();
		System.out.println(s3);
		System.out.println(s1);
		s2.toLowerCase();
		System.out.println(s2);
		s3=s2.toLowerCase();
		System.out.println(s3);
		s1=s1.toUpperCase();
		System.out.println(s1);*/
		/*String s1;
		s1="Hello".concat("amit");
		System.out.println(s1);
		s1="hello"+"amit";
		System.out.println(s1);*/
		/*boolean b;
		String s1="WelearningJava";
		b=s1.startsWith("We");
		System.out.println(b);
		b=s1.startsWith("Weall");
		System.out.println(b);
		b=s1.endsWith("Java");
		System.out.println(b);
		b=s1.endsWith("c++");
		System.out.println(b);*/
		/*int i="amit".compareToIgnoreCase("amitabh");
		System.out.println(i);*/
		/*String s1="Welcome";
		char ch;
		ch=s1.charAt(2);
		System.out.println(ch);
		ch=s1.charAt(10);*/
		String s1="abcbaabcbacbacbbcaabc";
		int i;
		i=s1.indexOf('c');
		System.out.println(i);
		i=s1.indexOf("ca");
		System.out.println(i);
		i=s1.indexOf('c',140);
		System.out.println(i);
		i=s1.indexOf("cac");
		System.out.println(i);
		i=s1.indexOf("bc",10);
		System.out.println(i);
		i=s1.indexOf("ab",5);
		System.out.println(i);
		/*i=s1.lastIndexOf("ab",5);
		System.out.println(i);*/
		/*String s1="welcome",s2;
		s2=s1.replace('e','z');
		System.out.println(s2);*/
		/*String s1="    Hello   ",s2;
		s2=s1.trim();
		System.out.println(s2);*/
		/*String s1="welcomeIndia";
		char c[]=new char[10];
		s1.getChars(3,7,c,3);
		for(char x:c)
		System.out.println(x);*/
		/*char x[]=null;
		String s1=String.copyValueOf(x);
		System.out.println(s1);
		s1=String.copyValueOf(x,4,2);
		System.out.println(s1);*/
		/*String s1="hello",s2;
		s2=s1.toString();
		System.out.println(s2);*/
		/*byte b[]="ABCD".getBytes();
		for(byte x:b)
		System.out.println(x);*/
		/*String s1,s2,s3,s4,s5;
		s1=String.valueOf(39000000000l);
		System.out.println(s1);
		s2=String.valueOf(141e-2);
		System.out.println(s2);
		s3=String.valueOf(false);
		System.out.println(s3);
		s4=String.valueOf(new char[]{'A','b'});
		System.out.println(s4);
		s5=String.valueOf("\"");
		System.out.println(s5);*/
		/*final int i=100;
		String s1=String.valueOf(i);
		System.out.println(s1);*/
		/*String s1="hello"+39,s2;
		s2="hi"+s1;
		System.out.println(s2);*/
		
	}
}