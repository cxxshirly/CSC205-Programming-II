public class mySums{
	public static void main (String[] args){
			
		System.out.println(recurSum(3));
	}
	
	public static double recurSum (int n){
		if (n<1)
			return 0;
		else 
			return Math.pow(2,n)+1+recurSum(n-1);

	}



}
