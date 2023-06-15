class Car extends Vehicle{
	String a;
	public String fuel(String fuel1)
	{	
		a = fuel1;
		System.out.println("Fuel type is:" +fuel1);
		return a;
	}
	public static void main(String args[])
	{
		Car function = new Car();
		function.fuel("Petrol");
		function.make("Tata");
		function.model("Harrier");
		function.year(2023);
	}
			}