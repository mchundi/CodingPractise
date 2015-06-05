//Given a String with print all the possible combinations of the all the characters in the string as a string for Example 
//"abc" is the input the you should print the below: 
//abc ,ab, ac, a, bc, b, c 


package codeChef;

public class AllSubStrings{
	
	public static void main(String args[]){
		//input string
		String inStr = "abcd";
		for(int i=0;i<inStr.length();i++){
			printSubStr(inStr.substring(i, inStr.length()));
		}
	}
	
	public static void printSubStr(String s){
		if(s.equals("") || s==null)
			return;
		System.out.println(s);
		if(s.length()>2)
			System.out.println(""+s.charAt(0)+s.charAt(s.length()-1));
		printSubStr(s.substring(0, s.length()-1));
	}
}