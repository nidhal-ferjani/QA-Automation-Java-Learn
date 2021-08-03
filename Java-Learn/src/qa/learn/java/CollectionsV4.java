package qa.learn.java;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * LinkedHaset : class extends HashSet : order preserved and
 * not duplicate elements
 * 
 * Queue : interface 
 * PriorityQueue - LinkedList :  Class implements Queue interface
 * 
 */
public class CollectionsV4 {

	public static void main(String[] args) {
		
		/************************************************************
		 * LinkedHashSet 
		 ************************************************************/
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("nidhal");
		linkedHashSet.add("bonjour");
		linkedHashSet.add("154");
		linkedHashSet.add("Welcome");
		linkedHashSet.add("hello");
		 
		System.out.println("LinkedHashSet : " + linkedHashSet);
		
		
		/*************************************************************
		 * PriorityQueue
		 *************************************************************/
		
		System.out.println("-----------------------------------------");
		
		Queue<Integer> queue =  new PriorityQueue<>();
		
		queue.add(12);
		queue.add(17);
		queue.add(145);
		queue.add(278);
		queue.add(123);
		
		System.out.println(queue);
		
		
		//Add element in tail Queue
		queue.add(1245);
		System.out.println("Queue after add element : " + queue);
		
		//Remove(): element in Head Queue : Throws Exception
		//poll() :  element in Head Queue : null retun if removing is impossible
		queue.remove();
		System.out.println("Queue after Remove element : " + queue);
		
		//offer() :  method return False if add element is impossible
		//Add()  : throws an exception if add element is impossible
		
		queue.offer(14);
		System.out.println(queue);
		
		
		// element() : return element in head queue if queue is empty method Throws exception
		// peek () : return element in head queue if queue is emplty method return null
		System.out.println("Head element  =  " + queue.element());
		System.out.println("Head element  =  " + queue.peek());
		
		
	}

}
