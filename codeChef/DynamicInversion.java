/*
You are given a permutation A of the first N positive integers. You are also given Q queries to perform one-by-one, the i-th is defined by a pair Xi Yi and has the meaning that you swap the Xi-th number in the permutation with the Yi-th one. After performing each query you should output the number of inversions in the obtained permutation, modulo 2.
The inversion is such a pair (i, j) that i < j and Ai > Aj.
*/


package codeChef;

import java.io.*;

public class DynamicInversion{
	
	public static void main(String args[]){
		//Read input from command line
		
		System.out.println("enter the size of the permutation string and the number of Queries: ");
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String arg[] = br.readLine().split(" ");
			int permutationSize = Integer.parseInt(arg[0]);
			int queryCount = Integer.parseInt(arg[1]);
			
			System.out.println("Enter the permutation string: ");
			
			arg = br.readLine().split(" ");
			int[] inArr = new int[permutationSize];
			int index1=-1,index2=-1,inversionCount=0,inversion1=0,inversion2=0,temp=0;
			for(int i=0;i<permutationSize;i++){
				inArr[i] = Integer.parseInt(arg[i]);
			}
			System.out.println("Enter the elements to be inteversed: ");
			while(queryCount!=0){
				
				arg = br.readLine().split(" ");
				inversion1 = Integer.parseInt(arg[0]);
				inversion2 = Integer.parseInt(arg[1]);
				
				for(int i=0;i<permutationSize;i++){
					if(inArr[i]==inversion1)
						index1 = i;
					else if(inArr[i]==inversion2)
						index2 =i;
				}
				if(index1==-1 || index2==-1){
					System.out.println("Desired elements not found");
					break;
				}
				else{
					temp = inArr[index1];
					inArr[index1] = inArr[index2];
					inArr[index2] = temp;
				}
				
				if(index1<index2 && inArr[index1]>inArr[index2] && inversion1!=inversion2)
					inversionCount++;
				queryCount--;
			}
			System.out.println("Inversion count modulo 2: "+(inversionCount%2));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}