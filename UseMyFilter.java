import java.io.*;
class MyFilter implements FilenameFilter
{
	private String ext;
	public MyFilter(String e)
	{
		ext=e;
	}
	public boolean accept(File f1,String name)
	{
		boolean b;
		b=name.endsWith(ext);
		return b;
	}
}
class UseMyFilter
{
	public static void main(String ar[])
	{
		File f1=new File("F:/JavaProgram");
		MyFilter mf;
		mf=new MyFilter(".java");
		String s[];
		s=f1.list(mf);
		for(String x:s)
		{
			System.out.println(x);		
		}
	}
}