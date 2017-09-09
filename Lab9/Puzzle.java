
public class Puzzle
{
	public static void main(String[] args)
        {
		puzzle(9);	
	}

	private static int puzzle (int n)
	{
		int temp = n;
		for (int i = 1; i <= 4 -n; i++){
			System.out.print("\t");
		}
        	if ( (n % 3) == 2 ){
           		temp = 1;
		}
        	else if ( (n % 3) == 1 ){
			System.out.println("puzzle(" + n + ") = puzzle(" + ( n + 1) + ") + 2");
           		temp = puzzle (n + 1) + 2 ;
		}
        	else{
			System.out.println("puzzle(" + n + ") = puzzle(" + (n/3) + ") + " + "1");
           		temp = puzzle (n / 3) + 1 ;
		}
		for(int i = 1; i <= 4 - n; i ++){
			System.out.print("\t");
		}
		if (temp != 0){
			System.out.println("puzzle (" + n + ") = return " + temp );
		}	
		return temp;	
		
	}
}
