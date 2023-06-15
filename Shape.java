class Shape{
	public void Output()
	{
		System.out.println("This is a shape");
	}
	public static void main(String args[])
	{
		Shape function = new Shape();
		function.Output();
	}
}
class Circle extends Shape{
	public void Output1()
	{
		System.out.println("This is a Circle");
	}
	public static void main(String args[])
	{
		Circle function1 = new Circle();
		function1.Output1();
	}
}
class Rectangle extends Shape{
	public void Output2()
	{
		System.out.println("This is a Rectangle");
	}
	public static void main(String args[])
	{
		Rectangle function2 = new Rectangle();
		function2.Output2();
	}
}