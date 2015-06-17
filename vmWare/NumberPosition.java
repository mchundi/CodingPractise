package vmWare;


/*
Given the array of integers containing equal number of even and odd numbers. Rearrange 
*the array such that even number is at even place and odd number is at odd place. 
Example : [2,1,3,4,7,9,24,98] 
Answer : 1,2,3,4,7,24,9,98
*/

public class NumberPosition{
	
	
	public static void main(String args[]){
		int[] inArr = {2,1,3,4,7,9,24,98};
		for(int i=0;i<inArr.length;i++){
			if(i%2 != 0){
				if(inArr[i]%2 != 0 && i<inArr.length-1){
					int temp = inArr[i];
					inArr[i]=inArr[i+1];
					inArr[i+1]=temp;
				}
			}
			else{
				if(inArr[i]%2 == 0 && i<inArr.length-1){
					int temp = inArr[i];
					inArr[i]=inArr[i+1];
					inArr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<inArr.length;i++)
			System.out.print(inArr[i]+" ");
	}
}