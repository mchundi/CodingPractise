package vmWare;

/*
Check binary number is prime or not 
input : 1001 
output : 9 is not prime number
*/

public class PrimeBit{
	
	public static void main(String args[]){
		checkPrime("1001");
	}
	
	public  static void  checkPrime(String str){
        // convert to decimal
        int x=Integer.parseInt(str,2);
        // check if mod is
        if (x ==2 ) { 
        	System.out.println(" Prime number"); 
        	return ;
        }
        for(int i =2; i <= Math.sqrt(x); i++ ){
            if (x %i == 0) {
                System.out.println(x+" is not Prime number" );
                return ;
            }
        }
        System.out.println(" Prime number");

    }
}