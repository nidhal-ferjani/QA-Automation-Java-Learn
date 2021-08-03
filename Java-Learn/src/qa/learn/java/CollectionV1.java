package qa.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/*
 * Collection : interface
 * Collections : Class
 * 
 * Set - List - Queue : interface extends Collection
 * LinkedList - Vector - ArrayList : Class implements List interface
 * 
 * LinkedList  : Class implements Queue interface and List interface
 * PriorityQueue : Class implements Queue
 * 
 * HashSet : Class implements Set 
 * 
 * LinkedHashSet :  Class extends HashSet
 * 
 * 
 * Map : interface
 * HashMap - HashTable : Class implements interface Map
 * LinkedHashMap : Class extends HashMap
 * 
 * 
 */


class Employe implements Comparable<Employe>{
	
	private String name;
	private int age;
	private long salary;
	

	public Employe(String name, int age, long salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}




	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return (int) (o.salary - this.salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.toUpperCase().hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.toUpperCase().equals(other.name.toUpperCase()))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	
	
}



public class CollectionV1 {

	public static void main(String[] args) {
		
		List<Integer> list1 =  new ArrayList<>();
		List<Integer> list2 =  new ArrayList<>();
		
		List<String> list3 =  new ArrayList<>();
		
		list1.add(5);
		list1.add(400);
		list1.add(-5);
		list1.add(40);
		list1.add(15);
		list1.add(400);
		
		System.out.println(list1);
		
		list2.add(14);
		list2.add(44);
		list2.add(-15);
		
		System.out.println(list2);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		System.out.println("Size List1 = " + list1.size());
		
		
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove(new Integer(400));
		System.out.println(list1);
		
		list1.add(0, 100000);
		System.out.println(list1);
		
		list1.set(0, 4520);
		System.out.println(list1);
		
		System.out.println(list1.contains(4570));
		
		
		list3.add("nidhal");
		list3.add("aymen");
		list3.add("Bon");
		
		System.out.println(list3.contains("bon"));
		
		System.out.println("------------------------------------");
		
		Iterator<String> it = list3.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------------");
		for(int i = 0; i<list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		System.out.println("------------------------------------");
		
		
		for (String string : list3) {
			System.out.println(string);
		}
		
		
		System.out.println("-----------------------------------------");
		System.out.println(list1);
		
		Collections.shuffle(list1);
		
		System.out.println(list1);
		
		
		/*********************************************************************************
		 * 
		 * Parcours ArrayList with Enumeration
		 * 
		 *********************************************************************************/
		
		 Enumeration<Integer> enumeration = Collections.enumeration(list1);
		 
		 while(enumeration.hasMoreElements()) {
			 System.out.print(enumeration.nextElement() + "-");
		 }
		 
		 /********************************************************************************/
		 System.out.println("\n-----------------------------------------------------------");
		 
		 Collections.sort(list1);
		 System.out.println(list1);
		 
		 /********************************************************************************/
		 
		 System.out.println("\n-----------------------------------------------------------");
		 // créer un tableau de String
		    String a[] = new String[]{"a","b","c","d"};
		    
		    List<String> list5 = new ArrayList<>(Arrays.asList(a));
		    System.out.println(list5);
		    
		 
		 List<Integer> list6  = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;

			{
				 add(5);
				 add(8);
				 add(15);
			 }
		 };
		 
		 System.out.println(list6);
		 
		 list6.add(0, 550);
		 System.out.println(list6);
		 
		 
		 /*********************************************************************************************/
		 
		 System.out.println("37 existe ?: "+list6.contains(15));
	     System.out.println("25 existe ?: "+list6.contains(250));
	     
	     /*********************************************************************************************/
	     
	     System.out.println("la postion dela premiere occurence de 15 dans " + list6 + " = " +list6.indexOf(11445));
	     
	    
	     
	     /*********************************************************************************************/
	     
	     ArrayList<Employe> arraylist = new ArrayList<Employe>();
	     
	     arraylist.add(new Employe("mateo", 32, 20000));
	     arraylist.add(new Employe("katia", 26, 10000));
	     arraylist.add(new Employe("aline", 30, 40000));
	     arraylist.add(new Employe("salim", 28, 35000));
	     
	     Collections.sort(arraylist);
	     
	     System.out.println(arraylist);
	     
	     list3.addAll(list5);
	     
	     System.out.println(list3);
	     
	     Collections.sort(list3, Collections.reverseOrder());
	     System.out.println(list3);
	     
 
	}

}
