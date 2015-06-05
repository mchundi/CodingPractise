//int[] a1={1,3,5,7} int[] a2={3,6,8,9} int[] a3={}... 
//Merge first two arrays in a sorted order result put it in third array output will be{1,3,3,5,7,8}

package codeChef;

public class MergeSort{
	
	static int[] a1={1,3,5,7};
	static int[] a2={3,6,8,9};
	static int finalLength=a1.length+a2.length,l=0;
	static int[] a3=new int[finalLength];
	public static void main(String args[]){
		
		finalLength = a1.length+a2.length;
		int i=0,j=0;
		nextElement(i,j);
		for(int k=0;k<a3.length;k++)
			System.out.print(a3[k]+",");
	}
	
	public static void nextElement(int a1Index,int a2Index){
		if(a1Index==a1.length){
			while(a2Index<a1.length){
				a3[l]=a2[a2Index];
				l++;
				a2Index++;
			}
			return;
		}
		else if(a2Index==a2.length){
			while(a1Index<a1.length){
				a3[l]=a1[a1Index];
				l++;
				a1Index++;
			}
			return;
		}
		if(a1[a1Index]<=a2[a2Index] && a1Index!=a1.length){
				a3[l]=a1[a1Index];
				l++;
				nextElement(++a1Index,a2Index);
			}
			else{
				a3[l]=a2[a2Index];
				l++;
				nextElement(a1Index,++a2Index);
			}
	}
}