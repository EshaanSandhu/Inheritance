class Motorcycle extends Vehicle{
	String a;
	public String fuel(String fuel1)
	{	
		a = fuel1;
		System.out.println("Fuel type is:" +fuel1);
		return a;
	}
	public static void main(String args[])
	{
		Motorcycle function = new Motorcycle();
		function.fuel("Petrol");
		function.make("Honda");
		function.model("Activa");
		function.year(2023);
	}
			}