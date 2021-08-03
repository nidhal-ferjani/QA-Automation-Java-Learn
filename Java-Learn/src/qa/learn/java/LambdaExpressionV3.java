package qa.learn.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Pre-Defined Functional Interfaces | Function Interface : Signle Abstract Method : R apply(T t)


class Personal{
	
	private String name;
	private double salary;
	public Personal(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}	
	
}


/*******************************************************************************************/


public class LambdaExpressionV3 {

	public static void main(String[] args) {
		
		
		/********************************************************
		Function<T, R> function = new Function<T, R>() {

			@Override
			public R apply(T t) {
							return null;
			}
		};
		*********************************************************/
		
		
		Function<Integer, Integer> func1 = x -> x*x;
		
		System.out.println("(5)^2 = " + func1.apply(5));
		
		Function<String, Integer> func2 = str -> str.length();
		
		System.out.println("----------------------------------------");
		System.out.println("length of string(nidhal) = " + func2.apply("Nidhal"));
		System.out.println("length of string(nidhal ferjani) = " + func2.apply("Nidhal ferjani"));
		System.out.println("length of string(nidhal is a better) = " + func2.apply("Nidhal is a better"));
		
		
		/************************************************************/
		
		 ArrayList<Personal> employes  = new ArrayList<>();
		   employes.add(new Personal("Ali",4000));
		   employes.add(new Personal("Ali ben youness",4000.789));
		   employes.add(new Personal("Salim",140000.5800));
		   employes.add(new Personal("Karim",744000));
		   employes.add(new Personal("Anis",844000));
		   
		   
		 Function<Personal, Double> frac3  = employee ->{
			   
			           double salary = employee.getSalary();
			           if(salary >= 10000 && salary <= 20000) {
			        	      return salary*10/100;
			           }
			           else if(salary > 20000 && salary <= 30000) {
			        	   return salary*20/100;
			           }
			           else if(salary > 30000 ) {
			        	   return salary*30/100;
					   }else {
						   return  0d ;
					   }
		 };
		 
		 DecimalFormat df = new DecimalFormat();
		 df.setMaximumFractionDigits(2);
		 System.out.println("--------------------------------------------");
		 
		 for (Personal employee1 : employes) {
			 
			 System.out.println("The bonus of Employee [ " + employee1.getName() +" ] = " + df.format(frac3.apply(employee1)));
			
		}
		   
		 
		 /***************************************************************************************/
		 System.out.println("--------------------------------------------");
		 
		 Predicate<Double> pred =  bonus -> bonus > 5000;
		 
		 
		 for (Personal personal : employes) {
			 
			 double bonus =  frac3.apply(personal);
			 
			 if(pred.test(bonus)) {
			    System.out.println("The bonus of Employee [ " + personal.getName() +" ] = " + df.format(bonus));
			 }
			
		}
		 
		/**********************************************************************************************/
		 
		 
		 /*
		  * Function Chaining :
		  * - andThen()
		  * - compose()
		  */
		 
		 System.out.println("--------------------------------------------------------------");
		 
		 
		 Function<Integer,Integer> function1 = x -> x*x;
		 Function<Integer,Integer> function2 = x -> x*x*x;
		 
		 System.out.println("The Result andThen chaining = " + function1.andThen(function2).apply(5));
		 // andThen() : The result of function1 will be passed as an argument to function2
		 
		 System.out.println("The Result compose() chaining = " + function1.compose(function2).apply(5));
		 // compose() : The result of function2 will be passed as an argument to function1
		 
	}
}
