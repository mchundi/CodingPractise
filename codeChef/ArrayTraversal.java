package codeChef;

public class ArrayTraversal{
	
	public static void main(String args[]){
		int [][] inArr = {{1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						  {21,22,23,24,25}};
		int i=0,j=0;
		for(i=0;i<inArr.length;i++){
			if(i%2==0){
				for(j=0;j<inArr.length;j++)
					System.out.print(inArr[i][j]+"->");
			}
			else{
				for(j =inArr.length-1;j>=0;j--)
					System.out.print(inArr[i][j]+"->");
			}
		}
	}
}