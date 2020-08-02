import java.util.*;
abstract class Geometry
{
	//public float area;
	public float b;
	public abstract void Input();
	public abstract float Area();
	/*void show()
	{
		System.out.println("Area is:"+area);
	}*/
}
class Triangle extends Geometry
{
	private float h;
	public void Input()
	{
		System.out.println("Enter base and height:");
		Scanner sc=new Scanner(System.in);
		b=sc.nextFloat();
		h=sc.nextFloat();
	}
	public float Area()
	{
		return (float)(0.5*b*h);
	}
}
class Square extends Geometry
{
	public void Input()
	{
		System.out.println("Enter sides:");
		Scanner sc=new Scanner(System.in);
		b=sc.nextFloat();
	}
	public float Area()
	{
		return (b*b*b);
	}
}
class Rectangle extends Geometry
{
	private float l;
	public void Input()
	{
		System.out.println("Enter lenght and breadth:");
		Scanner sc=new Scanner(System.in);
		l=sc.nextFloat();
		b=sc.nextFloat();
	}
	public float Area()
	{
		return (l*b);
	}
}
		
class Use
{
	public static void main(String ar[])
	{
		Geometry g1;
		System.out.print("Enter your choice for Geometry:");
		System.out.println("Triangle(T)/Rectangle(R)/Square(S)");
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		if(ch.equalsIgnoreCase("T")==true)
			g1=new Triangle();
		else if(ch.equalsIgnoreCase("R")==true)
			g1=new Rectangle();
		else if(ch.equalsIgnoreCase("S")==true)
			g1=new Square();
		else
		{
			System.out.println("Invalid Option");
			return;
		}
		g1.Input();
		float t=g1.Area();
		System.out.println("Area is:"+t);
		//g1.show();
	}
}
	