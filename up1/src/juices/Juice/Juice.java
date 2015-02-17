package Juice;

class Fruits
 {
	String name;
	Fruits(){}
	Fruits(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Название сока:"+name;
	}
	
	public String getName()
	{
		return name;
	}
	public int compareTo(Fruits fruit)
	{
		return name.compareTo(fruit.name);	
	}
}
