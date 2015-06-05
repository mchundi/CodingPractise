package hackerEarth;

import java.io.*;

public class AlternatingCharacters{
	public static void main(String args[]) throws IOException{
		//Read the sentence
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int tcCount = Integer.parseInt(br.readLine());
				for(int i=0;i<tcCount;i++){
					String inStr = br.readLine();
					System.out.println(altChar(inStr));
				}
		}
	
	static int altChar(String s){
		int delCnt =0;
		for(int i=0;i<s.length() && i+1 != s.length();i++){
			if(s.charAt(i)==s.charAt(i+1)){
				delCnt++;
				altChar(s.substring(0,i)+s.substring(i+2,s.length()));
			}
		}
		return delCnt;
	}
}