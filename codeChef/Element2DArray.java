//find a number in two dimensional sorted array of size mxn in O(n)

package codeChef;

public class Element2DArray{
	
	public static void main(String args[]) {
		int [][] inArr = {{1,2,3,4,5},
				 {6,7,8,9,10},
				 {11,12,13,14,15},
				 {16,17,18,19,20},
				 {21,22,23,24,25},
		        };
		
		int element = 13;
		
		for(int i=0,j=inArr.length/2;i<inArr.length;){
			if(inArr[i][0]<=element && inArr[i][inArr.length-1]>=element){
				if(element>=inArr[i][j]){
					while(j<inArr[i].length){
						if(inArr[i][j]==element){
							System.out.println("Element found at index ("+i+","+j+")");
							i++;
						}
						j++;
					}
				}
				else{
					while(j>0){
						if(inArr[i][j]==element){
							System.out.println("Element found at index ("+i+","+j+")");
							i++;
						}
						j--;
					}
				}
				/*while(j<inArr[i].length){
					if(inArr[i][j]==element){
						System.out.println("Element found at index ("+i+","+j+")");
						i++;
					}
					j++;
				}*/
			}
			else{
				i++;
			}
		}
	}
}