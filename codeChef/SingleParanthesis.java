//Given a string that contains exactly a single pair of parenthesis, return parenthesis and their contents, so "xyz(abc)123" yields "(abc)". etc. 
//Condition: You are not allowed to use a variable anywhere, Regex is not allowed


package codeChef;

public class SingleParanthesis{
	public static void main(String args[]){
		String inStr = "xyz(abc)123";
		int openParanthesisIndex = inStr.indexOf("(");
		int closeParanthesisIndex = inStr.indexOf(")");
		
		if(openParanthesisIndex<closeParanthesisIndex)
			System.out.println(inStr.substring(openParanthesisIndex, closeParanthesisIndex+1));
		else
			System.out.println("Input condition is not satisfied");
		
	}
}