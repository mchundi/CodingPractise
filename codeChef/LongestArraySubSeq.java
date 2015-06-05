
package codeChef;

import java.util.ArrayList;

public class LongestArraySubSeq{
	public static void main(String args[]){
		int[] inArr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};//{10,22,8,33,21,50,41,60,80};
		System.out.println(longestSeq(inArr));
		
	}
	
	public static int longestSeq(int[] input1)
    {
        //Write code here
        ArrayList<Integer>  outArr = new ArrayList<Integer>();
        for(int i=0;i<=input1.length-1;i++){
        	if(i+1==input1.length && input1[i-1]<input1[i])
        		outArr.add(input1[i]);
        	else if(input1[i]<input1[i+1]){
        		outArr.add(input1[i]);
        	}
        }
        return outArr.size();
    }
}