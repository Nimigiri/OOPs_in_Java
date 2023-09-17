class Animal
{
	void eat(){
	System.out.print("I eat food");
                  }
}

class Dog extends Animal
{
	public static void main(String[] args)
	{
		Dog d= new Dog();
		d.eat();
	}
}