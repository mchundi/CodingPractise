package careerCup;

import java.util.Arrays;

public class MergeSort{
	
	public static void main(String args[]){
		int [] a = {1,3,4,5,6,7,8}; 
		int [] b={4,6,7,8,9,10,11,12,13,14,15}; 
		int len = a.length+b.length;
		int [] mergedArray = new int[len];
		int i,j,k;
		
		for(i=0,j=0,k=0; i<a.length && j<b.length;){
			if(a[i]<b[j]){
				mergedArray[k]=a[i];
				i++;
				k++;
			}
			else{
				mergedArray[k]=b[j];
				j++;
				k++;
			}
		}
		while (i<a.length){
			mergedArray[k]=a[i];
			i++;
			k++;
		}
		
		while (j<b.length){
			mergedArray[k]=b[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(mergedArray));
	}
}