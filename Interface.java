//Default methods in interface
@FunctionalInterface
interface Animal
{
	void eat();
	/*default void move()
	{
		System.out.println("Animal Moves");
	}*/
	static public void info()
	{
		System.out.println("Animal info");
	}
}
interface Human
{
	default void move()
	{
		System.out.println("Human move");
	}
}
class Dog implements Animal,Human
{
	public void eat()
	{
		System.out.println("Dog Eats");
	}
	public void move()
	{
		//Animal.info();
		System.out.println("Dog Moves");
	}
}
class Use
{
	public static void main(String ar[])
	{
		Dog d=new Dog();
		//Animal.info();
		d.eat();
		d.move();
	}
}