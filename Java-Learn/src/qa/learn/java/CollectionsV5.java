package qa.learn.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map : interface with pair (key, value)
 * HashMap - HashTable : Class implements Map
 * 
 * - Insertion order is not preserved
 * - duplicate key is not allowed
 * 
 */
public class CollectionsV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hashMap = new HashMap<>();

		hashMap.put("Valeur1", 15);
		hashMap.put("Valeur1", 15);
		hashMap.put("valeur1", 15);
		hashMap.put("valeur2", 48);
		hashMap.put("valeur3", 21);
		hashMap.put("valeur4", 87);
		hashMap.put("valeur5", 159);
		hashMap.put("valeur6", 17);
		hashMap.put(null, 1515);

		System.out.println("HashMap is  : " + hashMap);

		Integer value = hashMap.remove("Valeur11");

		System.out.println("Element removed is : " + value);
		System.out.println("After removed element HashMap is : " + hashMap);

		System.out.println("Removed key, value : " + hashMap.remove("valeur1", 15));

		System.out.println("------------------------------------------------------");

		System.out.println("Valeur of the key - valeur6 : " + hashMap.get("valeur6"));

		System.out.println("If key is present in hashMap   : " + hashMap.containsKey("valeur5"));
		System.out.println("If Value is present in hashMap : " + hashMap.containsValue(1245));

		System.out.println("If hashMap is empty : " + hashMap.isEmpty());

		/*********************************************************************
		 * Return All the keys of the HashMap
		 * 
		 *********************************************************************/

		Set<String> keys = hashMap.keySet();

		for (String string : keys) {
			System.out.println("key is : " + string + " Value is : " + hashMap.get(string));
		}

		/**********************************************************************
		 * Return entry in HashMap
		 * 
		 **********************************************************************/

		System.out.println("------------------------------------------------");

		Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

		Iterator<Entry<String, Integer>> iter = set.iterator();

		while (iter.hasNext()) {

			Map.Entry<String, Integer> item = iter.next();
			System.out.println("Key : " + item.getKey() + " value : " + item.getValue());
			// item.setValue(1000000);
		}

		System.out.println("--------------------------------------------------");

		// ou vous pouvez récupérer la clé et sa valeur directement sans passer par
		// Iterator
		for (Entry<String, Integer> entry : hashMap.entrySet()) {

			System.out.println("Key : " + entry.getKey() + " - value : " + entry.getValue());

		}

       System.out.println("-------------------------------------------------------");
	   
	   /***************************************************************************
	    * All  Values of the HashMap
	    * 
	    ***************************************************************************/
	   
	   System.out.println("All Values in HashMap : " + hashMap.values());

}
	
}
