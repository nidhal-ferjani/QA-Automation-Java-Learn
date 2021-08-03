package qa.learn.java;


// A Functional Interface it conatins a single Abstract Method SAM (public only, default method , static method)

@FunctionalInterface // Optional
interface Cab{
	//public void bookCab();
	//public void bookCab(String source, String destination);
	  public String bookCab(String source, String destination);
	  default String hello(String name) {
	      return "Hello " + name;}
	    
	  default String hello1(String name) {
		      return "Hello1 " + name;
	  }
}

//class Ola implements Cab{
//
//	@Override
//	public void bookCab() {
//	  System.out.println("Ola cab is Bookes .....");		
//	}
//	
//}


public class LambdaExpressionV1 {
    /*
     * Lambda Function is :
     * - anonymous function
     * - dones not have  a Name
     * - does not have a return key word
     * - does not have an access modified
     */
	
	
	public static void main(String[] args) {
		
		
		Cab cab2 = new Cab() {

			@Override
			public String bookCab(String source, String destination) {
				// TODO Auto-generated method stub
				return "Ola cab is booked from " + source + " to " + destination;
			}			
		};
		
		System.out.println(cab2.bookCab("Algerie", "Tunisie"));
		
	   //Cab cab = ()-> System.out.println("Hello this is my first lambda expression");  
	   //cab.bookCab();
		
	   //Cab cab = (source, destination) -> System.out.println("Ola cab is booked from " + source +" to " + destination);
	   //cab.bookCab("Tunisie", "Montreal");
		
		Cab cab = (source, destination) -> "Ola cab is booked from " + source + " to " + destination;
		
		System.out.println(cab.bookCab("Paris", "Egypte"));
		
        Cab cab1 = (source, destination) -> {
        	      System.out.println("Ola cab is booked from " + source +" to " + destination);
                  return "Price : 1000$";
                 };
		
		System.out.println(cab1.bookCab("Italy", "Canada"));
		
		System.out.println(cab1.hello("Nidhal ferjani"));
		
		
	}
    
	
}
