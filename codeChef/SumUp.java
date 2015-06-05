package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class SumUp {
  public static void main(String[] args) {
 
	  //Read the sum and the array
	  try{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      String str = br.readLine();
	      String s[] = str.split(" ");
	      int a[] = new int[s.length];
	      for(int i=0;i<s.length;i++)
	    	  a[i] = Integer.parseInt(s[i]);
	      
	      Arrays.sort(a);
	      for(int i=0,j=a.length-1;i<j;){
	    	  if(a[i]+a[j] == n){
	    		  System.out.println(a[i]+" "+a[j]);
	    		  i++;
	    		  j--;
	    	  }	  
	    	  else if(a[i]+a[j]<n)
	    		  i++;
	    	  else
	    		  j--;
	      }
	      
 
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
   }
}
