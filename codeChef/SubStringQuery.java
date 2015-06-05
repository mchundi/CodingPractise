//Program to display the sub-string of given length that matches the number of expected occurrences given

package codeChef;

import java.io.*;

public class SubStringQuery {
	public static void main(String args[]) throws Exception {

		// Read input from command prompt
		System.out.println("Enter the string: ");
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inStr = br.readLine();
			
			System.out.println("Enter the number of testcases followed by the inpud combination: ");
			int tcCount = Integer.parseInt(br.readLine());
			while(tcCount!=0){
				String[] inConstraint = br.readLine().split(" ");
				int patternLength=0,patternExpOcc=0;
					patternLength = Integer.parseInt(inConstraint[0]);
					patternExpOcc = Integer.parseInt(inConstraint[1]);
				
				for(int i=0; i<= inStr.length()-patternLength;i++){
					
					String subStr = inStr.substring(i,i+patternLength);
					//subStrR(inStr,subStr,patternLength,patternExpOcc);
					int patternActOcc = subStrCnt(subStr,inStr.substring(i+1,inStr.length()));
					
					//System.out.println(patternActOcc);
					if(patternActOcc == patternExpOcc)
						System.out.println(subStr);
					
				}
				tcCount--;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static int subStrCnt(String sub, String in){
		int occCnt=1;
		
		for(int i=0;i<=in.length()-sub.length();i++){
			if(in.substring(i, i+sub.length()).equals(sub))
				occCnt++;
		}
		return occCnt;
	}

}