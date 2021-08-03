package qa.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * 
 * LinkedList  : Class implements List and Queue
 * LinkedList is expensive in terms of access of the 
 * item or element but a lot faster in terms od adding
 * and removing a new element than ArrayLsit and Vector
 * 
 * ArrayListis very Fast in terms of access and adding at
 * the and
 */


public class CollectionsV2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		      List<String>  list = new ArrayList<String>() {
		 
				private static final long serialVersionUID = 1L;

				{
		    		  //Ajouter des éléments à LinkedList
			          add("Rock");
				      add("Blues");
				      add("Pop");
				      add("Classic");
		    	  }
		      };

		     
		      System.out.println("Eléments de LinkedList: ");
		      
		      for (String string : list) {
		    	  System.out.println(string);				
			}
	
		     System.out.println("-------------------------------------------");
		     
		     List<String> linkedlist = new LinkedList<>(list);
		     
		     Enumeration<String> enumeration = Collections.enumeration(linkedlist);
		     
		     while(enumeration.hasMoreElements()) {
		    	 System.out.println(enumeration.nextElement());
		     }
		
		     
		     /*****************************************************************************/
		     
		     List<String> llist = new LinkedList<>();
		     llist.add("1");
		     llist.add("2");
		     llist.add("3");
		     llist.add("4");
		     
		     System.out.println("------------------------------------------------------");
		     
		     System.out.println("the LinkedList before reversal  : " + llist);
		     
		     Collections.reverse(llist);
		     
		     System.out.println("the LinkedList after reversal   : " +llist);
		     
		     /********************************************************************************/
		     
		     LinkedList<String> llist1 = new LinkedList<>();

		     llist1.add("o1");
		     llist1.add("o2");
		     llist1.add("o3");
		     llist1.add("o4");
		     llist1.add("o4");
		     llist1.add("o5");
		     
		     System.out.println("The LinkedList before removing (o4) : " + llist1);
		     
		     System.out.println(llist1.remove("o4"));
		     
		     System.out.println("The LinkedList after removing (o4)  : " + llist1 );
		     
		     llist1.removeFirst();
		     llist1.removeLast();
		     
		     System.out.println("The LinkedList after removing the first and last element : " + llist1);
		     
		     llist1.push("Add Element in Stack");
		     
		     System.out.println("The stack is after push element : " + llist1);
		     
		     llist1.pop();
		     
		     System.out.println("The stack is after push element : " + llist1);
		     
		     /************************************************************************/
		     
		     System.out.println("--------------------------------------------------------");
		     
		     LinkedList<String> llist11 = new LinkedList<>();

		     llist11.add("o1");
		     llist11.add("o2");
		     llist11.add("o3");
		     llist11.add("o4");
		     llist11.add("o4");
		     llist11.add("o5");
		     
		     System.out.println(llist11);
		     ListIterator<String> iter  = llist11.listIterator();
		     
		    
		     
		     while(iter.hasNext()) {
		    	 System.out.print(iter.next() +" - ");
		     }
		     
		     System.out.println();
		     
		     for(; iter.hasPrevious(); System.out.print(iter.previous() + " - "));
		     
		     /*******************************************************************
		      * Permutation between two elements in LinkedList
		      *******************************************************************/
		     
		     LinkedList<String> linkedlist1 = new LinkedList<>();
		     
		     linkedlist1.add("java");
		     linkedlist1.add("C++");
		     linkedlist1.add("C");
		     linkedlist1.add("php");
		     linkedlist1.add("html");
		     linkedlist1.add("C#");
		     
		     System.out.println("\n------------------------------------------------------");
		     
		     System.out.println("LinkedList before permutation is                    : " + linkedlist1);
		     
		     String temp =  linkedlist1.get(3);
		     linkedlist1.set(3, linkedlist1.get(0));
		     linkedlist1.set(0, temp);
		     System.out.println("LinkedList after permutation is elements(java, php) : " + linkedlist1);
		     
		     
		     /******************************************************************************/
		     
		     linkedlist1.add("python");
		     System.out.println(linkedlist1);
		     
		     /*****************************************************************************/
		     
		     
		     @SuppressWarnings("rawtypes")
		     LinkedList linkedlist122 = new LinkedList();
		     
		     linkedlist122.add(12);
		     linkedlist122.add("C++");
		     linkedlist122.add("C");
		     linkedlist122.add(true);
		     linkedlist122.add(null);
		     
		     for (Object object : linkedlist122) {
				System.out.println(object);
			}
		     
		    System.out.println("------------------------------------------------");
		    
		    System.out.println(linkedlist1);
		    linkedlist1.addFirst("Bonjour");
		    linkedlist1.addLast("Bonsoir");
		    
		    
		    System.out.println(linkedlist1);
		    
		    System.out.println("The first element is : "+linkedlist1.getFirst());
		    System.out.println("The last element is  : "+linkedlist1.getLast());
	}

}
