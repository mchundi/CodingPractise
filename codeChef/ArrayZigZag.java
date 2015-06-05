package codeChef;

public class ArrayZigZag{
	
	public static void main(String args[]) throws Exception{
		
		int[][] inArr = {{1,2,3,4,5},
						 {6,7,8,9,10},
						 {11,12,13,14,15},
						 {16,17,18,19,20},
						 {21,22,23,24,25},
				        };
		int i=0,j=0;
		
		for(int loop=0;loop<inArr.length*inArr.length;loop++){
			
			if((i+j)%2==0){
				//System.out.print(inArr[i][j]+" ");
				System.out.print("("+i+","+j+")");
				if(i<inArr.length)
					i++;
				if(j>0)
					j--;
				
			}
			else{
				//System.out.print(inArr[i][j]+" ");
				System.out.print("("+i+","+j+")");
				if(i>0)
					i--;
				if(j<inArr[i].length)
					j++;
			}
		}
	}
}