package qa.learn.java;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.function.*;


class Employee{
	
	private double salary;
	private String name;
	private int experience;
	public Employee(String name,double salary, int experience) {
		this.salary = salary;
		this.name = name;
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}

//Pre-Defined Functional Interfaces | Predecate Interface : Single Abstract Method : boolean test(T t)

public class LambdaExpressionV2 {
	
	/*
	 * Pre-Defined Functional Interfaces
	 *  | Predicate Interface
	 *  | Function 
	 *  | Consumer
	 *  | supplier
	 */
   public static void main(String[] args) {
	   
	   
	   /***********************************************************************************************/
	   
	   Predicate<Integer> pr  = i -> (i>10);
	   
	   System.out.println(" Result is  : " + pr.test(10));
	
	   
	   // Exercice 2 : Check if the length of given  String is greater then 5 or not.
	   
	   Predicate<String> pred = str -> (str.length()>5);
	   System.out.println("length of : 'nidhal ferjani' is >5 : " + pred.test("nidhal ferjani"));
	   System.out.println("length of : 'jani' is >5 : " + pred.test("jani"));
	   
	   // Exercice 3
	   
	   String[] names = {"nidhal", "Ali", "Aymen", "Youssef", "Mohamed Ali"};
	   
	   for (String name : names) {
	       if(pred.test(name)) {
	    	   System.out.println(name);
	       }
    	}
	   
	   /***********************************************************************************/
	   
	   // Exercice 4 : Return name of Employee if salary>50k and experience>5
	   
	   Employee employe = new Employee("Ali",144000, 2);
	   
	   Predicate<Employee> pred1 = (employee) -> (employee.getSalary() > 30000 && employee.getExperience() > 3);
	   
	   System.out.println(pred1.test(employe)? employe.getName(): null);
	   
	   /************************************************************************************/
	   
	   ArrayList<Employee> employes  = new ArrayList<>();
	   employes.add(new Employee("Ali",144000, 2));
	   employes.add(new Employee("Ali ben youne",4000.789, 12));
	   employes.add(new Employee("Salim",140000.5800,14));
	   employes.add(new Employee("Karim",744000, 5));
	   employes.add(new Employee("Anis",844000, 44));
	   
	   System.out.println("------------------------------");
	   
	   DecimalFormat df = new DecimalFormat();
	   df.setMaximumFractionDigits(2);
	   
	   System.out.println("Liste of Employee : ");
	   
	   for (Employee employee : employes) {
		    if(pred1.test(employee)) {
		    	System.out.println(employee.getName() + " - " +df.format(employee.getSalary()));
		    }
	}
	   
	   /***********************************************************************************************/
	   
	   // Exercice 5 : Joining Predicates : or - and - negate
	   
	   int[] a = {20, 15, 11, 10, 17, 19, 16, 28, 23, 88};
	   
	   Predicate<Integer> pred2 = i -> i%2 == 0;
	   Predicate<Integer> pred3 = i -> i > 50;
	   System.out.println("------------------------------");
	   
	   
	   for (int j : a) {
		
		   if(pred2.and(pred3).test(j)) {  //pred2.test(j) && pred3.test(j)
			   System.out.println(j);
		   }
	}
	   System.out.println("------------------------------");
	   
	   for (int j : a) {
			
		   if(pred2.or(pred3).test(j)) {  // pred2.test(j) || pred3.test(j)
			   System.out.println(j);
		   }
	}
	   System.out.println("------------------------------");
	   
	   
	   for (int j : a) {
			
		   if(pred2.negate().test(j)) { // !pred2.test(j)
			   System.out.println(j);
		   }
	}
}
   
}
