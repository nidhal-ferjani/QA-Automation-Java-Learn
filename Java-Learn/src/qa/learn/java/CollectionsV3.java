package qa.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * HashSet : Class implements Set not duplicate and order 
 * is not preserved
 * 
 */


public class CollectionsV3 {
	
	public static void main(String[] args) {
		
		 //créer une hashset
		
	      HashSet<String> hset = new HashSet<String>();
	  
	      //ajouter des éléments
	      hset.add("a2");
	      hset.add("a3");
	      hset.add("b1");
	      hset.add("b3");
	      hset.add("a1");
	      hset.add("b2");
	  
	      System.out.println("Before Sort : " + hset);
	      
	     //copier les éléments de HashSet dans ArrayList
	      List<String> list = new ArrayList<String>(hset);
	      
	      Collections.sort(list);     
		
	      System.out.println("After Sort  : " + list);
	      
	      
	      /****************************************************
	       * Soreted HashSet Using TreeSet
	       ****************************************************/
	      System.out.println("-------------------------------------------");
	      HashSet<String> hashset = new HashSet<>();

	      hashset.add("E1");
	      hashset.add("E2");
	      hashset.add("E3");
	      hashset.add("E4");
	      hashset.add("E1");
	      hashset.add("E5");
	  
	      System.out.println("HashSet : "+ hashset);
	  
	      // créer une TreeSet de avec les éléments de HashSet
	      Set <String> treeset = new TreeSet<>(hashset);
	  
	      System.out.println("TreeSet : " + treeset);
	      
	      
	      /**************************************************************/
	      
	      System.out.println("--------------------------------------------");
	      Set<Employe> sets = new HashSet<>();
	      
	      sets.add(new Employe("nidhal", 25, 1245780));
	      sets.add(new Employe("NIDHAL", 25, 245780));
	      sets.add(new Employe("nidhal", 24, 4245780));
	      sets.add(new Employe("amine" , 25, 8245780));
	      
	      System.out.println("HashSet is : " + sets);
	      
	     List<Employe> treeSet = sets.stream().sorted(new Comparator<Employe>() {
	    		@Override
				public int compare(Employe o1, Employe o2) {
					// TODO Auto-generated method stub
					return (int) (o1.getSalary() - o2.getSalary());
				}
	    	}).collect(Collectors.toList()); // Returns the sorted List (using toSet() wont work)
	      
	     
	     
	      System.out.println("Set after Sorted  : " + treeSet);
	      
	      
	      /***********************************************************************************/
	      System.out.println("------------------------------------------------------");
	      
	      Set<Integer> set12 = new HashSet<>();
	      set12.add(14);
	      set12.add(14);
	      set12.add(180);
	      set12.add(20);
	      
	      
	      Set<Integer> set10 = new HashSet<>();
	      set10.add(14);
	      set10.add(140);
	      set10.add(10);
	      set10.add(20);
	      
	      //Union
	      set12.addAll(set10);
	      System.out.println("Union : " + set12);
	      
	      System.out.println("Set12 : " + set12);
	      System.out.println("Set10 : " + set10);
	      
	      //Intersection
	      set12.retainAll(set10);
	      
	      System.out.println("Intersection : " + set12);
	      
	      set10.add(111);
	      
	      //difference
	      set10.removeAll(set12);
	      System.out.println("Difference :" + set10);
	      
	      //subset
	      System.out.println(set12.containsAll(set10));
	      
	}

}
