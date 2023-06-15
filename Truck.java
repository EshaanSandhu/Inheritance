class Truck extends Vehicle{
	String a;
	public String fuel(String fuel1)
	{	
		a = fuel1;
		System.out.println("Fuel type is:" +fuel1);
		return a;
	}
	public static void main(String args[])
	{
		Truck function = new Truck();
		function.fuel("Diesal");
		function.make("Tata");
		function.model("Ace");
		function.year(2023);
	}
			}