package careerCup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapGetKey{
	
	public static void main(String args[]){
		HashMap<Integer,String> hM = new HashMap<Integer,String>();
		hM.put(1, "a");
		hM.put(2, "b");
		hM.put(3, "c");
		hM.put(4, "d");
		hM.put(5, "e");
		hM.put(6, "f");
		
		String inValue = "d";
		
		if(hM.containsValue(inValue)){
			Set<Entry<Integer, String>> s = hM.entrySet(); 
			Iterator<Entry<Integer, String>> i = s.iterator(); 
			while(i.hasNext()){
				Entry<Integer, String> e = i.next();
				if (e.getValue().equals(inValue)) { 
					System.out.println("The key is " + e.getKey()); 
				} 
			}
		}
	}
}
