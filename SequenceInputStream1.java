import java.io.*;
class SequenceInputStream1
{
	public static void main(String ar[])throws IOException
	{
		FileInputStream fis1,fis2;
		fis1=new FileInputStream("F:/JavaProgram/one.txt");
		fis2=new FileInputStream("F:/JavaProgram/two.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int x;
		while((x=sis.read())!=-1)
			System.out.print((char)x);
		sis.close();
	}
}
