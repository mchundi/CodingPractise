//Write a java program for Fibonacci series...in this format 
//{1, 1, 2, 3, 5, 8, 13, 21, 34, 55,}print {1,1,#,3,5,#,13,21,#,55}instead of even numbers print #

package codeChef;

public class FibonacciHash{
	
	public static void main(String args[]){
		int fibonacciSeriesLength = 10;
		int i=0,j=1,k=i+j;
		System.out.print(i+" "+j);
		
		for(int l=1;l<=fibonacciSeriesLength;l++){
				if(k%2==0)
					System.out.print(" # ");
				else
					System.out.print(" "+k+" ");
				i=j;
				j=k;
				k=i+j;
		}
			
	}
}