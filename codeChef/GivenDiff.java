package codeChef;

public class GivenDiff{
	
	public static void main(String args[]){
		
		int[] inArr = {3,5,10,23,45,47};
		int k=0;
		
		if(k==0){
			//look for duplicate numbers
			for(int i=0;i<inArr.length-1;i++){
				if(inArr[i]==inArr[i+1])
					System.out.println("("+inArr[i]+","+inArr[i+1]+")");
			}
		}
		else {
			for(int i=0;i<inArr.length;i++){
				for(int j=1;j<inArr.length;j++){
					if(inArr[j]-inArr[i]==k)
						System.out.println("("+inArr[i]+","+inArr[j]+")");
				}
			}
		}
		
	}
}