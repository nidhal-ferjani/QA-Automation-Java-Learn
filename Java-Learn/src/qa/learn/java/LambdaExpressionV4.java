package qa.learn.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Pre-Defined Functional Interfaces | Consumer & Supplier


public class LambdaExpressionV4 {

	public static void main(String[] args) {
		
		/********************************************
		
		Consumer<T> consumer = new Consumer<T>() {

			@Override
			public void accept(T arg0) {
			  // TODO Auto-generated method stub
			}
		};
       ********************************************
		
	   Supplier<T> supplier = new Supplier<T>() {

		@Override
		public T get() {
			// TODO Auto-generated method stub
			return null;
		}
	  };	
	
	   ************************************************/
		
		Consumer<String> consumer1 = str -> System.out.println(str);
		
		consumer1.accept("Welcome Nidhal");
		
		
		/**********************************************/
		
		System.out.println("------------------------------------------------");
		
		Function<Employee, Double> function = employee ->  employee.getSalary()*10/100;
			              
						
		Predicate<Double> predicate = bonus -> bonus > 50000;		
		
		Consumer<Employee> consumer = employee -> {
			System.out.println("Name Employee : [ " + employee.getName() +" ] - Salary = " + employee.getSalary());
			
		};
		
		
		   ArrayList<Employee> employes  = new ArrayList<>();
		   employes.add(new Employee("Ali",144000, 2));
		   employes.add(new Employee("Ali ben youne",4000.789, 12));
		   employes.add(new Employee("Salim",140000.5800,14));
		   employes.add(new Employee("Karim",744000, 5));
		   employes.add(new Employee("Anis",844000, 44));
		   
		   
		   for (Employee employee2 : employes) {
			if(predicate.test(function.apply(employee2))) {
				consumer.accept(employee2);
			}
		}
		   
		/************************************************************************************/
		   
		   System.out.println("------------------------------------------------------------");
		   
		   Consumer<String> c1 = str -> System.out.println(str + "  " + " is White");
		   Consumer<String> c2 = str -> System.out.println(str + "  " + " is having four legs");
		   Consumer<String> c3 = str -> System.out.println(str + "  " + " is eating grass");
		   
		   c1.andThen(c2).andThen(c3).accept("Cow");;
		   
		/**************************************************************************************/
		
		   Supplier<Date> supplier = () -> new Date();
		   System.out.println("Date is :  " + supplier.get());
	}

}
