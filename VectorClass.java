import java.util.*;
class VectorClass
{
	public static void main(String ar[])
	{
		Vector v1=new Vector();
		v1.add("hello");
		v1.add(19.26);
		v1.add(123);
		v1.add(3,567);
		v1.add(true);
		v1.add(32.6f);
		Object i=v1.clear();
		System.out.println((String)i);
	}
}
		