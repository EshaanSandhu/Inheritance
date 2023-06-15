class Person{
	String a;
	public String getFirstName(String c){
		a = c ;
	System.out.println("First Name is:"+a);
	return c;
					  }
	String b;
	public String getLastName(String d){
		b = d ;
	System.out.print("Last name is:"+b);
	return d;
					 }
	public static void main(String args[]){
	Person function = new Person();
	function.getFirstName("Eshaan");
	function.getLastName("Sandhu");
					      }
}