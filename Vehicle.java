class Vehicle{
	String a;
	String b;
	int c;
	public String make(String make1)
	{
		a = make1;
		System.out.println("The vehicle is made by:"+a);
		return a;
	}	
	public String model(String model1)
	{
		b = model1;
		System.out.println("The vehicle model is:"+b);
		return b;
	}
	public int year(int year1)
	{
		c = year1;
		System.out.println("The vehicle was manufactured in:"+c);
		return 0;
	}
	public static void main(String args[])
	{
		Vehicle function = new Vehicle();
		function.make("Mahindra");
		function.model("XUV500");
		function.year(2023);
	}
}