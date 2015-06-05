package careerCup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class UniqueChar{
	
	public static void main(String args[]){
		String inStr="importjava.util.HashMap";
		inStr = inStr.toLowerCase();
		HashMap<Character,Integer> charOcc = new HashMap<Character,Integer>();
		
		for(int i=0;i<inStr.length();i++){
			if(charOcc.containsKey(inStr.charAt(i))){
				charOcc.put(inStr.charAt(i), charOcc.get(inStr.charAt(i))+1);
			}
			else
				charOcc.put(inStr.charAt(i),1);
		}
		System.out.println(charOcc);
		
		if(charOcc.containsValue(1)){
			Set<Entry<Character, Integer>> s = charOcc.entrySet(); 
			Iterator<Entry<Character, Integer>> i = s.iterator(); 
			while(i.hasNext()){
				Entry<Character, Integer> e = i.next();
				if (e.getValue().equals(1)) { 
					System.out.println("The key is '" + e.getKey()+"'"); 
					break;
				} 
			}
		}
			
	}
}