import java.io.*;
class DataOutputStream1
{
	public static void main(String ar[])throws IOException
	{
		FileInputStream fos;
		fos=new FileInputStream("F:/JavaProgram/filewriting1.txt");
		DataInputStream dos=new DataInputStream(fos);
		int a=1927,a1;
		boolean b=true,b1;
		float f=3.96f,f1;
		String s="hello",s1;
		a1=dos.readInt();
		System.out.println(a1);
		b1=dos.readBoolean();
		f1=dos.readFloat();
		s1=dos.readLine();[[;
		dos.close();
	}
}