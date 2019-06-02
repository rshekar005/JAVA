package HierarchicalInheritance;

public class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meow");
	}
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.meow();
		c.eating();
		//c.bark();//Compile time error
	}

}
